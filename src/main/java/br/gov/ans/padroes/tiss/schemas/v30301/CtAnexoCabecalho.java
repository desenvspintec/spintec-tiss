
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_anexoCabecalho complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_anexoCabecalho">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaReferenciada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dataAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_anexoCabecalho", propOrder = {
    "registroANS",
    "numeroGuiaAnexo",
    "numeroGuiaReferenciada",
    "numeroGuiaOperadora",
    "dataSolicitacao",
    "senha",
    "dataAutorizacao"
})
public class CtAnexoCabecalho {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaAnexo;
    @XmlElement(required = true)
    protected String numeroGuiaReferenciada;
    protected String numeroGuiaOperadora;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataSolicitacao;
    protected String senha;
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAutorizacao;

    /**
     * Obtém o valor da propriedade registroANS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistroANS() {
        return registroANS;
    }

    /**
     * Define o valor da propriedade registroANS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistroANS(String value) {
        this.registroANS = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaAnexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaAnexo() {
        return numeroGuiaAnexo;
    }

    /**
     * Define o valor da propriedade numeroGuiaAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaAnexo(String value) {
        this.numeroGuiaAnexo = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaReferenciada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaReferenciada() {
        return numeroGuiaReferenciada;
    }

    /**
     * Define o valor da propriedade numeroGuiaReferenciada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaReferenciada(String value) {
        this.numeroGuiaReferenciada = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaOperadora() {
        return numeroGuiaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaOperadora(String value) {
        this.numeroGuiaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade dataSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataSolicitacao() {
        return dataSolicitacao;
    }

    /**
     * Define o valor da propriedade dataSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataSolicitacao(XMLGregorianCalendar value) {
        this.dataSolicitacao = value;
    }

    /**
     * Obtém o valor da propriedade senha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSenha() {
        return senha;
    }

    /**
     * Define o valor da propriedade senha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSenha(String value) {
        this.senha = value;
    }

    /**
     * Obtém o valor da propriedade dataAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAutorizacao() {
        return dataAutorizacao;
    }

    /**
     * Define o valor da propriedade dataAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAutorizacao(XMLGregorianCalendar value) {
        this.dataAutorizacao = value;
    }

}
