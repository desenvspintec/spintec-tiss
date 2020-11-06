
package br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_autorizacaoInternacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoInternacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacaoDosServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="dataProvavelAdmissao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *         &lt;element name="qtdDiariasAutorizadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *         &lt;element name="tipoAcomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoInternacao", propOrder = {
    "autorizacaoDosServicos",
    "dataProvavelAdmissao",
    "qtdDiariasAutorizadas",
    "tipoAcomodacaoAutorizada"
})
public class CtmAutorizacaoInternacao {

    @XmlElement(required = true)
    protected CtmAutorizacaoServico autorizacaoDosServicos;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProvavelAdmissao;
    protected BigInteger qtdDiariasAutorizadas;
    protected String tipoAcomodacaoAutorizada;

    /**
     * Obtém o valor da propriedade autorizacaoDosServicos.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoDosServicos() {
        return autorizacaoDosServicos;
    }

    /**
     * Define o valor da propriedade autorizacaoDosServicos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoDosServicos(CtmAutorizacaoServico value) {
        this.autorizacaoDosServicos = value;
    }

    /**
     * Obtém o valor da propriedade dataProvavelAdmissao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavelAdmissao() {
        return dataProvavelAdmissao;
    }

    /**
     * Define o valor da propriedade dataProvavelAdmissao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavelAdmissao(XMLGregorianCalendar value) {
        this.dataProvavelAdmissao = value;
    }

    /**
     * Obtém o valor da propriedade qtdDiariasAutorizadas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtdDiariasAutorizadas() {
        return qtdDiariasAutorizadas;
    }

    /**
     * Define o valor da propriedade qtdDiariasAutorizadas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtdDiariasAutorizadas(BigInteger value) {
        this.qtdDiariasAutorizadas = value;
    }

    /**
     * Obtém o valor da propriedade tipoAcomodacaoAutorizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoAcomodacaoAutorizada() {
        return tipoAcomodacaoAutorizada;
    }

    /**
     * Define o valor da propriedade tipoAcomodacaoAutorizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoAcomodacaoAutorizada(String value) {
        this.tipoAcomodacaoAutorizada = value;
    }

}
