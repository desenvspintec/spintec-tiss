
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_respostaRecursoGuiaOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaRecursoGuiaOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="recursoAcatadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaRecursoGuiaOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "nomeBeneficiario",
    "codGlosaGuia",
    "justificativaGuia",
    "recursoAcatadoGuia"
})
public class CtRespostaRecursoGuiaOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    @XmlElement(required = true)
    protected String codGlosaGuia;
    @XmlElement(required = true)
    protected String justificativaGuia;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmSimNao recursoAcatadoGuia;

    /**
     * Obtém o valor da propriedade numeroGuiaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaPrestador() {
        return numeroGuiaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaPrestador(String value) {
        this.numeroGuiaPrestador = value;
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
     * Obtém o valor da propriedade nomeBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeBeneficiario() {
        return nomeBeneficiario;
    }

    /**
     * Define o valor da propriedade nomeBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeBeneficiario(String value) {
        this.nomeBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade codGlosaGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGlosaGuia() {
        return codGlosaGuia;
    }

    /**
     * Define o valor da propriedade codGlosaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGlosaGuia(String value) {
        this.codGlosaGuia = value;
    }

    /**
     * Obtém o valor da propriedade justificativaGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaGuia() {
        return justificativaGuia;
    }

    /**
     * Define o valor da propriedade justificativaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaGuia(String value) {
        this.justificativaGuia = value;
    }

    /**
     * Obtém o valor da propriedade recursoAcatadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getRecursoAcatadoGuia() {
        return recursoAcatadoGuia;
    }

    /**
     * Define o valor da propriedade recursoAcatadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setRecursoAcatadoGuia(DmSimNao value) {
        this.recursoAcatadoGuia = value;
    }

}
