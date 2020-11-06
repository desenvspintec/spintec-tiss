
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de cto_recursoGlosaOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_recursoGlosaOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="numeroGuiaRecGlosaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="objetoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_objetoRecurso"/>
 *         &lt;element name="numeroGuiaRecGlosaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico12"/>
 *         &lt;element name="opcaoRecurso">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="recursoProtocolo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                             &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="recursoGuia" maxOccurs="100">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                             &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                             &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                             &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                             &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                             &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                       &lt;element name="denteRegiao" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;choice>
 *                                                 &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                                                 &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                                               &lt;/choice>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
 *                                       &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                                       &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                       &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                       &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="dataRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_recursoGlosaOdonto", propOrder = {
    "registroANS",
    "numeroGuiaRecGlosaPrestador",
    "nomeOperadora",
    "objetoRecurso",
    "numeroGuiaRecGlosaOperadora",
    "dadosContratado",
    "numeroLote",
    "numeroProtocolo",
    "opcaoRecurso",
    "valorTotalRecursado",
    "dataRecurso"
})
public class CtoRecursoGlosaOdonto {

    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected String numeroGuiaRecGlosaPrestador;
    @XmlElement(required = true)
    protected String nomeOperadora;
    @XmlElement(required = true)
    protected String objetoRecurso;
    protected String numeroGuiaRecGlosaOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosContratado;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected BigInteger numeroProtocolo;
    @XmlElement(required = true)
    protected CtoRecursoGlosaOdonto.OpcaoRecurso opcaoRecurso;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRecurso;

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
     * Obtém o valor da propriedade numeroGuiaRecGlosaPrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaPrestador() {
        return numeroGuiaRecGlosaPrestador;
    }

    /**
     * Define o valor da propriedade numeroGuiaRecGlosaPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaPrestador(String value) {
        this.numeroGuiaRecGlosaPrestador = value;
    }

    /**
     * Obtém o valor da propriedade nomeOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeOperadora() {
        return nomeOperadora;
    }

    /**
     * Define o valor da propriedade nomeOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeOperadora(String value) {
        this.nomeOperadora = value;
    }

    /**
     * Obtém o valor da propriedade objetoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObjetoRecurso() {
        return objetoRecurso;
    }

    /**
     * Define o valor da propriedade objetoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObjetoRecurso(String value) {
        this.objetoRecurso = value;
    }

    /**
     * Obtém o valor da propriedade numeroGuiaRecGlosaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroGuiaRecGlosaOperadora() {
        return numeroGuiaRecGlosaOperadora;
    }

    /**
     * Define o valor da propriedade numeroGuiaRecGlosaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroGuiaRecGlosaOperadora(String value) {
        this.numeroGuiaRecGlosaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosContratado.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Define o valor da propriedade dadosContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosContratado(CtContratadoDados value) {
        this.dadosContratado = value;
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
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroProtocolo(BigInteger value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade opcaoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso }
     *     
     */
    public CtoRecursoGlosaOdonto.OpcaoRecurso getOpcaoRecurso() {
        return opcaoRecurso;
    }

    /**
     * Define o valor da propriedade opcaoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso }
     *     
     */
    public void setOpcaoRecurso(CtoRecursoGlosaOdonto.OpcaoRecurso value) {
        this.opcaoRecurso = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalRecursado.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalRecursado() {
        return valorTotalRecursado;
    }

    /**
     * Define o valor da propriedade valorTotalRecursado.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalRecursado(BigDecimal value) {
        this.valorTotalRecursado = value;
    }

    /**
     * Obtém o valor da propriedade dataRecurso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRecurso() {
        return dataRecurso;
    }

    /**
     * Define o valor da propriedade dataRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRecurso(XMLGregorianCalendar value) {
        this.dataRecurso = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="recursoProtocolo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                   &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="recursoGuia" maxOccurs="100">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                   &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                   &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                   &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                             &lt;element name="denteRegiao" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;choice>
     *                                       &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                                       &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                                     &lt;/choice>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
     *                             &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *                             &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                             &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                             &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "recursoProtocolo",
        "recursoGuia"
    })
    public static class OpcaoRecurso {

        protected CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo recursoProtocolo;
        protected List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia> recursoGuia;

        /**
         * Obtém o valor da propriedade recursoProtocolo.
         * 
         * @return
         *     possible object is
         *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo getRecursoProtocolo() {
            return recursoProtocolo;
        }

        /**
         * Define o valor da propriedade recursoProtocolo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo }
         *     
         */
        public void setRecursoProtocolo(CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoProtocolo value) {
            this.recursoProtocolo = value;
        }

        /**
         * Gets the value of the recursoGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the recursoGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRecursoGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia }
         * 
         * 
         */
        public List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia> getRecursoGuia() {
            if (recursoGuia == null) {
                recursoGuia = new ArrayList<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia>();
            }
            return this.recursoGuia;
        }


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
         *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *         &lt;element name="recursoProcedimento" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *                   &lt;element name="denteRegiao" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;choice>
         *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
         *                           &lt;/choice>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
         *                   &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
         *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *                   &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "numeroGuiaPrestador",
            "numeroGuiaOperadora",
            "senha",
            "nomeBeneficiario",
            "codGlosaGuia",
            "justificativaGuia",
            "recursoProcedimento"
        })
        public static class RecursoGuia {

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
            protected List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento> recursoProcedimento;

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
             * Gets the value of the recursoProcedimento property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the recursoProcedimento property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRecursoProcedimento().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento }
             * 
             * 
             */
            public List<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento> getRecursoProcedimento() {
                if (recursoProcedimento == null) {
                    recursoProcedimento = new ArrayList<CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento>();
                }
                return this.recursoProcedimento;
            }


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
             *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
             *         &lt;element name="denteRegiao" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;choice>
             *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
             *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
             *                 &lt;/choice>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_face" minOccurs="0"/>
             *         &lt;element name="quantidade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
             *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
             *         &lt;element name="codGlosaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="justificativaProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
             *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
                "dataRealizacao",
                "denteRegiao",
                "denteFace",
                "quantidade",
                "procRecurso",
                "codGlosaProc",
                "justificativaProc",
                "valorRecursado"
            })
            public static class RecursoProcedimento {

                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dataRealizacao;
                protected CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao denteRegiao;
                protected String denteFace;
                @XmlElement(required = true)
                protected BigInteger quantidade;
                @XmlElement(required = true)
                protected CtProcedimentoDados procRecurso;
                @XmlElement(required = true)
                protected String codGlosaProc;
                @XmlElement(required = true)
                protected String justificativaProc;
                @XmlElement(required = true)
                protected BigDecimal valorRecursado;

                /**
                 * Obtém o valor da propriedade dataRealizacao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataRealizacao() {
                    return dataRealizacao;
                }

                /**
                 * Define o valor da propriedade dataRealizacao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataRealizacao(XMLGregorianCalendar value) {
                    this.dataRealizacao = value;
                }

                /**
                 * Obtém o valor da propriedade denteRegiao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao }
                 *     
                 */
                public CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao getDenteRegiao() {
                    return denteRegiao;
                }

                /**
                 * Define o valor da propriedade denteRegiao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao }
                 *     
                 */
                public void setDenteRegiao(CtoRecursoGlosaOdonto.OpcaoRecurso.RecursoGuia.RecursoProcedimento.DenteRegiao value) {
                    this.denteRegiao = value;
                }

                /**
                 * Obtém o valor da propriedade denteFace.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDenteFace() {
                    return denteFace;
                }

                /**
                 * Define o valor da propriedade denteFace.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDenteFace(String value) {
                    this.denteFace = value;
                }

                /**
                 * Obtém o valor da propriedade quantidade.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getQuantidade() {
                    return quantidade;
                }

                /**
                 * Define o valor da propriedade quantidade.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setQuantidade(BigInteger value) {
                    this.quantidade = value;
                }

                /**
                 * Obtém o valor da propriedade procRecurso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtProcedimentoDados }
                 *     
                 */
                public CtProcedimentoDados getProcRecurso() {
                    return procRecurso;
                }

                /**
                 * Define o valor da propriedade procRecurso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtProcedimentoDados }
                 *     
                 */
                public void setProcRecurso(CtProcedimentoDados value) {
                    this.procRecurso = value;
                }

                /**
                 * Obtém o valor da propriedade codGlosaProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodGlosaProc() {
                    return codGlosaProc;
                }

                /**
                 * Define o valor da propriedade codGlosaProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodGlosaProc(String value) {
                    this.codGlosaProc = value;
                }

                /**
                 * Obtém o valor da propriedade justificativaProc.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJustificativaProc() {
                    return justificativaProc;
                }

                /**
                 * Define o valor da propriedade justificativaProc.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJustificativaProc(String value) {
                    this.justificativaProc = value;
                }

                /**
                 * Obtém o valor da propriedade valorRecursado.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorRecursado() {
                    return valorRecursado;
                }

                /**
                 * Define o valor da propriedade valorRecursado.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorRecursado(BigDecimal value) {
                    this.valorRecursado = value;
                }


                /**
                 * <p>Classe Java de anonymous complex type.
                 * 
                 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;choice>
                 *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                 *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
                 *       &lt;/choice>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "codDente",
                    "codRegiao"
                })
                public static class DenteRegiao {

                    protected String codDente;
                    @XmlSchemaType(name = "string")
                    protected DmRegiao codRegiao;

                    /**
                     * Obtém o valor da propriedade codDente.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodDente() {
                        return codDente;
                    }

                    /**
                     * Define o valor da propriedade codDente.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodDente(String value) {
                        this.codDente = value;
                    }

                    /**
                     * Obtém o valor da propriedade codRegiao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link DmRegiao }
                     *     
                     */
                    public DmRegiao getCodRegiao() {
                        return codRegiao;
                    }

                    /**
                     * Define o valor da propriedade codRegiao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link DmRegiao }
                     *     
                     */
                    public void setCodRegiao(DmRegiao value) {
                        this.codRegiao = value;
                    }

                }

            }

        }


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
         *         &lt;element name="codigoGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *         &lt;element name="justificativaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
            "codigoGlosaProtocolo",
            "justificativaProtocolo"
        })
        public static class RecursoProtocolo {

            @XmlElement(required = true)
            protected String codigoGlosaProtocolo;
            @XmlElement(required = true)
            protected String justificativaProtocolo;

            /**
             * Obtém o valor da propriedade codigoGlosaProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodigoGlosaProtocolo() {
                return codigoGlosaProtocolo;
            }

            /**
             * Define o valor da propriedade codigoGlosaProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodigoGlosaProtocolo(String value) {
                this.codigoGlosaProtocolo = value;
            }

            /**
             * Obtém o valor da propriedade justificativaProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getJustificativaProtocolo() {
                return justificativaProtocolo;
            }

            /**
             * Define o valor da propriedade justificativaProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setJustificativaProtocolo(String value) {
                this.justificativaProtocolo = value;
            }

        }

    }

}
