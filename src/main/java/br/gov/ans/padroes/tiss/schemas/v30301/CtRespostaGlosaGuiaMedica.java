
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_respostaGlosaGuiaMedica complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_respostaGlosaGuiaMedica">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="codGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *         &lt;element name="justificativaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *         &lt;element name="recursoGuiaAcatado" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="justificativaOPSnaoAcatadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_respostaGlosaGuiaMedica", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "senha",
    "codGlosa",
    "justificativaPrestador",
    "recursoGuiaAcatado",
    "justificativaOPSnaoAcatadoGuia"
})
public class CtRespostaGlosaGuiaMedica {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String senha;
    @XmlElement(required = true)
    protected String codGlosa;
    @XmlElement(required = true)
    protected String justificativaPrestador;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmSimNao recursoGuiaAcatado;
    protected String justificativaOPSnaoAcatadoGuia;

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
     * Obtém o valor da propriedade codGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodGlosa() {
        return codGlosa;
    }

    /**
     * Define o valor da propriedade codGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodGlosa(String value) {
        this.codGlosa = value;
    }

    /**
     * Obtém o valor da propriedade justificativaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaPrestador() {
        return justificativaPrestador;
    }

    /**
     * Define o valor da propriedade justificativaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaPrestador(String value) {
        this.justificativaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade recursoGuiaAcatado.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getRecursoGuiaAcatado() {
        return recursoGuiaAcatado;
    }

    /**
     * Define o valor da propriedade recursoGuiaAcatado.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setRecursoGuiaAcatado(DmSimNao value) {
        this.recursoGuiaAcatado = value;
    }

    /**
     * Obtém o valor da propriedade justificativaOPSnaoAcatadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaOPSnaoAcatadoGuia() {
        return justificativaOPSnaoAcatadoGuia;
    }

    /**
     * Define o valor da propriedade justificativaOPSnaoAcatadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaOPSnaoAcatadoGuia(String value) {
        this.justificativaOPSnaoAcatadoGuia = value;
    }

}
