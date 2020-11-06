
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_dadosResumoDemonstrativo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosResumoDemonstrativo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosResumoDemonstrativo", propOrder = {
    "dataProtocolo",
    "numeroProtocolo",
    "numeroLote",
    "valorInformado",
    "valorProcessado",
    "valorLiberado",
    "valorGlosa"
})
public class CtDadosResumoDemonstrativo {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProtocolo;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected BigDecimal valorInformado;
    @XmlElement(required = true)
    protected BigDecimal valorProcessado;
    @XmlElement(required = true)
    protected BigDecimal valorLiberado;
    protected BigDecimal valorGlosa;

    /**
     * Obtém o valor da propriedade dataProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProtocolo() {
        return dataProtocolo;
    }

    /**
     * Define o valor da propriedade dataProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProtocolo(XMLGregorianCalendar value) {
        this.dataProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade valorInformado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInformado() {
        return valorInformado;
    }

    /**
     * Define o valor da propriedade valorInformado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInformado(BigDecimal value) {
        this.valorInformado = value;
    }

    /**
     * Obtém o valor da propriedade valorProcessado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessado() {
        return valorProcessado;
    }

    /**
     * Define o valor da propriedade valorProcessado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessado(BigDecimal value) {
        this.valorProcessado = value;
    }

    /**
     * Obtém o valor da propriedade valorLiberado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberado() {
        return valorLiberado;
    }

    /**
     * Define o valor da propriedade valorLiberado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberado(BigDecimal value) {
        this.valorLiberado = value;
    }

    /**
     * Obtém o valor da propriedade valorGlosa.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosa() {
        return valorGlosa;
    }

    /**
     * Define o valor da propriedade valorGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosa(BigDecimal value) {
        this.valorGlosa = value;
    }

}
