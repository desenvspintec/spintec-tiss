package com.spin.verificaelegibilidade.tiss.utils;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import org.jboss.logging.Logger;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.Namespace;
import org.jdom2.input.SAXBuilder;
import org.springframework.stereotype.Component;

@Component
public class CalculoHash implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -7144962045466955560L;
	
	private static final int HASH_LENGTH = 32;
    private static final Namespace XSI = Namespace.getNamespace("xsi", XMLConstants.W3C_XML_SCHEMA_INSTANCE_NS_URI);
    private static final String TAG_HASH = "hash>".toLowerCase();
    private static final String CHARSET = "ISO-8859-1";
    private static final Map<Class<?>, JAXBContext> JAXB_CACHE = new ConcurrentHashMap<>();

    private final Logger logger = Logger.getLogger(CalculoHash.class);

    protected CalculoHash() {
    }

    /**
     * Retornar uma instancia de Marshaller para o objeto informado.
     * Caso exista uma instancia no cache, retornar o cache.
     *
     * @param obj
     * @return Marshaller
     * @throws Exception
     */
    private Marshaller getMarshaller(Object obj) throws Exception {
        JAXBContext jc = null;
        if (JAXB_CACHE.containsKey(obj.getClass())) {
            jc = JAXB_CACHE.get(obj.getClass());
        } else {
            jc = JAXBContext.newInstance(obj.getClass());
            JAXB_CACHE.putIfAbsent(obj.getClass(), jc);
        }
        return jc.createMarshaller();
    }

    public boolean verificarHash(final Object objeto, String hash) {
        final String hashValido = getHashFromObject(objeto);
        final boolean resultado = hashValido.equalsIgnoreCase(hash);
        logger.infov("Hash de entrada [{0}] - Hash valido [{1}] - Resultado Comparacao [{2}]", hash, hashValido, resultado ? "Valido" : "Invalido");
        return resultado;
    }

    public CalculoHashResultado verificarHashResultado(final Object objeto, String hash) {
        final String hashValido = getHashFromObject(objeto);
        final boolean resultado = hashValido.equalsIgnoreCase(hash);
        logger.infov("Hash de entrada [{0}] - Hash valido [{1}] - Resultado Comparacao [{2}]", hash, hashValido, resultado ? "Valido" : "Invalido");
        return new CalculoHashResultado(hash, hashValido, resultado);
    }

    public String getHashFromObject(final Object obj) {
        try {
            final Marshaller marshaller = getMarshaller(obj);
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, false);
            marshaller.setProperty(Marshaller.JAXB_ENCODING, CHARSET);
            marshaller.setProperty("com.sun.xml.bind.namespacePrefixMapper", new com.sun.xml.bind.marshaller.NamespacePrefixMapper() {
                @Override
                public String getPreferredPrefix(String arg0, String arg1, boolean arg2) {
                    return "ans";
                }
            });

            final StringWriter sw = new StringWriter();
            marshaller.marshal(obj, sw);
            final String xmlString = sw.toString();
            return generateHashFromXml(xmlString);
        } catch (final Exception e) {
            throw new RuntimeException(e);
        }
    }

    private String generateHashFromXml(String xml) throws JDOMException, IOException, NoSuchAlgorithmException {
        String hash = null;
        try {
            final String xmlNoHash = removeHashTagFromXml(xml);
            // Se existe a o hash temporario, remover o valor para gerar
            final InputStream is = new ByteArrayInputStream(xmlNoHash.getBytes(CHARSET));
            final SAXBuilder sax = new SAXBuilder();
            final Document document = sax.build(is);
            final Element rootElement = document.getRootElement();
            rootElement.addNamespaceDeclaration(XSI);
            // Calcula o hash das informações já inseridas
            hash = calculaHash(rootElement);
        } catch (final JDOMException e) {
            throw e;
        } catch (final IOException e) {
            throw e;
        } catch (final NoSuchAlgorithmException e) {
            throw e;
        }
        return hash;
    }

    /**
     * Remove o conteúdo do HASH deixando a tag HASH vazia.
     * Exemplo: <hash></hash>
     *
     * @param xml
     * @return
     */
    private String removeHashTagFromXml(String xml) {
        return getHashFromXml(xml).map(hashContent -> xml.replace(hashContent, TAG_HASH)).orElse(xml);
    }

    /**
     * Retorna hash> + o conteudo da tag HASH
     * Exemplo: hash>1
     *
     * @param xml
     * @return
     */
    private Optional<String> getHashFromXml(String xml) {
        final int tagHashIndex = xml.indexOf(TAG_HASH);
        if (tagHashIndex == -1) {
            return Optional.empty();
        }

        xml = xml.substring(tagHashIndex, xml.length());
        xml = xml.substring(0, xml.indexOf("<"));
        return Optional.of(xml);
    }

    private String calculaHash(Element root) throws NoSuchAlgorithmException, UnsupportedEncodingException {
        String hash = null;
        final MessageDigest digest = MessageDigest.getInstance("MD5");
        recalculaHash(digest, root);
        final byte[] md5sum = digest.digest();
        final BigInteger bigInt = new BigInteger(1, md5sum);
        hash = bigInt.toString(16);
        return formatHashSize(hash);
    }

    private String formatHashSize(String hash) {
        final StringBuffer s = new StringBuffer(HASH_LENGTH);
        s.append(hash);
        while (s.length() < HASH_LENGTH) {
            s.insert(0, "0");
        }
        return s.toString();
    }

    private void recalculaHash(MessageDigest digest, Element element) throws UnsupportedEncodingException {
        final List<Element> childs = element.getChildren();
        if (childs.size() == 0) {
            if (element.getText() != null) {
                digest.update(element.getText().getBytes(CHARSET));
            }
        } else {
            for (final Element child : childs) {
                recalculaHash(digest, child);
            }
        }
    }

}
