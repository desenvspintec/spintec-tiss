
package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalho" type="{http://www.ans.gov.br/padroes/tiss/schemas}cabecalhoTransacao"/>
 *         &lt;element name="respostaElegibilidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_respostaElegibilidade"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Signatures" type="{http://www.ans.gov.br/padroes/tiss/schemas}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cabecalho",
    "respostaElegibilidade",
    "hash",
    "signatures"
})
@XmlRootElement(name = "respostaElegibilidadeWS")
public class RespostaElegibilidadeWS {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    @XmlElement(required = true)
    protected CtRespostaElegibilidade respostaElegibilidade;
    @XmlElement(required = true)
    protected String hash;
    @XmlElement(name = "Signatures")
    protected Signature signatures;

    /**
     * Obt�m o valor da propriedade cabecalho.
     * 
     * @return
     *     possible object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public CabecalhoTransacao getCabecalho() {
        return cabecalho;
    }

    /**
     * Define o valor da propriedade cabecalho.
     * 
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao }
     *     
     */
    public void setCabecalho(CabecalhoTransacao value) {
        this.cabecalho = value;
    }

    /**
     * Obt�m o valor da propriedade respostaElegibilidade.
     * 
     * @return
     *     possible object is
     *     {@link CtRespostaElegibilidade }
     *     
     */
    public CtRespostaElegibilidade getRespostaElegibilidade() {
        return respostaElegibilidade;
    }

    /**
     * Define o valor da propriedade respostaElegibilidade.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRespostaElegibilidade }
     *     
     */
    public void setRespostaElegibilidade(CtRespostaElegibilidade value) {
        this.respostaElegibilidade = value;
    }

    /**
     * Obt�m o valor da propriedade hash.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define o valor da propriedade hash.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obt�m o valor da propriedade signatures.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getSignatures() {
        return signatures;
    }

    /**
     * Define o valor da propriedade signatures.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setSignatures(Signature value) {
        this.signatures = value;
    }

}
