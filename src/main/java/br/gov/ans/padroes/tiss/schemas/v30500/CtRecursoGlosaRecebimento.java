
package br.gov.ans.padroes.tiss.schemas.v30500;

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
 * <p>Classe Java de ct_recursoGlosaRecebimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_recursoGlosaRecebimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nrProtocoloRecursoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="dataRecebimentoRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="nrProtocoloRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="recursoProtocolo" minOccurs="0">
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
 *         &lt;element name="qtGuiasRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *         &lt;element name="guiasRecurso" maxOccurs="100" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="opcaoRecursoGuia">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="recursoGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="itensGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                                       &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                       &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                                       &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
 *                                       &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
 *                                       &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotalRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_recursoGlosaRecebimento", propOrder = {
    "nrProtocoloRecursoGlosa",
    "dataEnvioRecurso",
    "dataRecebimentoRecurso",
    "numeroLote",
    "registroANS",
    "dadosPrestador",
    "nrProtocoloRecursado",
    "recursoProtocolo",
    "qtGuiasRecurso",
    "guiasRecurso",
    "observacao",
    "valorTotalRecursado"
})
public class CtRecursoGlosaRecebimento {

    @XmlElement(required = true)
    protected String nrProtocoloRecursoGlosa;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEnvioRecurso;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataRecebimentoRecurso;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String registroANS;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected String nrProtocoloRecursado;
    protected CtRecursoGlosaRecebimento.RecursoProtocolo recursoProtocolo;
    protected BigInteger qtGuiasRecurso;
    protected List<CtRecursoGlosaRecebimento.GuiasRecurso> guiasRecurso;
    protected String observacao;
    @XmlElement(required = true)
    protected BigDecimal valorTotalRecursado;

    /**
     * Obt�m o valor da propriedade nrProtocoloRecursoGlosa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProtocoloRecursoGlosa() {
        return nrProtocoloRecursoGlosa;
    }

    /**
     * Define o valor da propriedade nrProtocoloRecursoGlosa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProtocoloRecursoGlosa(String value) {
        this.nrProtocoloRecursoGlosa = value;
    }

    /**
     * Obt�m o valor da propriedade dataEnvioRecurso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEnvioRecurso() {
        return dataEnvioRecurso;
    }

    /**
     * Define o valor da propriedade dataEnvioRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEnvioRecurso(XMLGregorianCalendar value) {
        this.dataEnvioRecurso = value;
    }

    /**
     * Obt�m o valor da propriedade dataRecebimentoRecurso.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataRecebimentoRecurso() {
        return dataRecebimentoRecurso;
    }

    /**
     * Define o valor da propriedade dataRecebimentoRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataRecebimentoRecurso(XMLGregorianCalendar value) {
        this.dataRecebimentoRecurso = value;
    }

    /**
     * Obt�m o valor da propriedade numeroLote.
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
     * Obt�m o valor da propriedade registroANS.
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
     * Obt�m o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtContratadoDados }
     *     
     */
    public CtContratadoDados getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtContratadoDados }
     *     
     */
    public void setDadosPrestador(CtContratadoDados value) {
        this.dadosPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade nrProtocoloRecursado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNrProtocoloRecursado() {
        return nrProtocoloRecursado;
    }

    /**
     * Define o valor da propriedade nrProtocoloRecursado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNrProtocoloRecursado(String value) {
        this.nrProtocoloRecursado = value;
    }

    /**
     * Obt�m o valor da propriedade recursoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtRecursoGlosaRecebimento.RecursoProtocolo }
     *     
     */
    public CtRecursoGlosaRecebimento.RecursoProtocolo getRecursoProtocolo() {
        return recursoProtocolo;
    }

    /**
     * Define o valor da propriedade recursoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtRecursoGlosaRecebimento.RecursoProtocolo }
     *     
     */
    public void setRecursoProtocolo(CtRecursoGlosaRecebimento.RecursoProtocolo value) {
        this.recursoProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade qtGuiasRecurso.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQtGuiasRecurso() {
        return qtGuiasRecurso;
    }

    /**
     * Define o valor da propriedade qtGuiasRecurso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQtGuiasRecurso(BigInteger value) {
        this.qtGuiasRecurso = value;
    }

    /**
     * Gets the value of the guiasRecurso property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guiasRecurso property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuiasRecurso().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtRecursoGlosaRecebimento.GuiasRecurso }
     * 
     * 
     */
    public List<CtRecursoGlosaRecebimento.GuiasRecurso> getGuiasRecurso() {
        if (guiasRecurso == null) {
            guiasRecurso = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso>();
        }
        return this.guiasRecurso;
    }

    /**
     * Obt�m o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
    }

    /**
     * Obt�m o valor da propriedade valorTotalRecursado.
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="numeroGuiaOrigem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *         &lt;element name="opcaoRecursoGuia">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="recursoGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="itensGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *                             &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                             &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *                             &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
     *                             &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
     *                             &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
        "numeroGuiaOrigem",
        "numeroGuiaOperadora",
        "senha",
        "opcaoRecursoGuia"
    })
    public static class GuiasRecurso {

        @XmlElement(required = true)
        protected String numeroGuiaOrigem;
        protected String numeroGuiaOperadora;
        protected String senha;
        @XmlElement(required = true)
        protected CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia opcaoRecursoGuia;

        /**
         * Obt�m o valor da propriedade numeroGuiaOrigem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroGuiaOrigem() {
            return numeroGuiaOrigem;
        }

        /**
         * Define o valor da propriedade numeroGuiaOrigem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroGuiaOrigem(String value) {
            this.numeroGuiaOrigem = value;
        }

        /**
         * Obt�m o valor da propriedade numeroGuiaOperadora.
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
         * Obt�m o valor da propriedade senha.
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
         * Obt�m o valor da propriedade opcaoRecursoGuia.
         * 
         * @return
         *     possible object is
         *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia }
         *     
         */
        public CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia getOpcaoRecursoGuia() {
            return opcaoRecursoGuia;
        }

        /**
         * Define o valor da propriedade opcaoRecursoGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia }
         *     
         */
        public void setOpcaoRecursoGuia(CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia value) {
            this.opcaoRecursoGuia = value;
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
         *         &lt;element name="recursoGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="itensGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
         *                   &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *                   &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
         *                   &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
         *                   &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
         *                   &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
            "recursoGuia",
            "itensGuia"
        })
        public static class OpcaoRecursoGuia {

            protected List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia> recursoGuia;
            protected List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia> itensGuia;

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
             * {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia }
             * 
             * 
             */
            public List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia> getRecursoGuia() {
                if (recursoGuia == null) {
                    recursoGuia = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.RecursoGuia>();
                }
                return this.recursoGuia;
            }

            /**
             * Gets the value of the itensGuia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the itensGuia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getItensGuia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia }
             * 
             * 
             */
            public List<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia> getItensGuia() {
                if (itensGuia == null) {
                    itensGuia = new ArrayList<CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia>();
                }
                return this.itensGuia;
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
             *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
             *         &lt;element name="dataInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
             *         &lt;element name="dataFim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
             *         &lt;element name="procRecurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
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
             *         &lt;element name="codGlosaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="valorRecursado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="justificativaItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
                "sequencialItem",
                "dataInicio",
                "dataFim",
                "procRecurso",
                "denteRegiao",
                "denteFace",
                "codGlosaItem",
                "valorRecursado",
                "justificativaItem"
            })
            public static class ItensGuia {

                @XmlElement(required = true)
                protected BigInteger sequencialItem;
                @XmlElement(required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dataInicio;
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar dataFim;
                @XmlElement(required = true)
                protected CtProcedimentoDados procRecurso;
                protected CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao denteRegiao;
                protected String denteFace;
                @XmlElement(required = true)
                protected String codGlosaItem;
                @XmlElement(required = true)
                protected BigDecimal valorRecursado;
                @XmlElement(required = true)
                protected String justificativaItem;

                /**
                 * Obt�m o valor da propriedade sequencialItem.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSequencialItem() {
                    return sequencialItem;
                }

                /**
                 * Define o valor da propriedade sequencialItem.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSequencialItem(BigInteger value) {
                    this.sequencialItem = value;
                }

                /**
                 * Obt�m o valor da propriedade dataInicio.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataInicio() {
                    return dataInicio;
                }

                /**
                 * Define o valor da propriedade dataInicio.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataInicio(XMLGregorianCalendar value) {
                    this.dataInicio = value;
                }

                /**
                 * Obt�m o valor da propriedade dataFim.
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getDataFim() {
                    return dataFim;
                }

                /**
                 * Define o valor da propriedade dataFim.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setDataFim(XMLGregorianCalendar value) {
                    this.dataFim = value;
                }

                /**
                 * Obt�m o valor da propriedade procRecurso.
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
                 * Obt�m o valor da propriedade denteRegiao.
                 * 
                 * @return
                 *     possible object is
                 *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao }
                 *     
                 */
                public CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao getDenteRegiao() {
                    return denteRegiao;
                }

                /**
                 * Define o valor da propriedade denteRegiao.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao }
                 *     
                 */
                public void setDenteRegiao(CtRecursoGlosaRecebimento.GuiasRecurso.OpcaoRecursoGuia.ItensGuia.DenteRegiao value) {
                    this.denteRegiao = value;
                }

                /**
                 * Obt�m o valor da propriedade denteFace.
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
                 * Obt�m o valor da propriedade codGlosaItem.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodGlosaItem() {
                    return codGlosaItem;
                }

                /**
                 * Define o valor da propriedade codGlosaItem.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodGlosaItem(String value) {
                    this.codGlosaItem = value;
                }

                /**
                 * Obt�m o valor da propriedade valorRecursado.
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
                 * Obt�m o valor da propriedade justificativaItem.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJustificativaItem() {
                    return justificativaItem;
                }

                /**
                 * Define o valor da propriedade justificativaItem.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJustificativaItem(String value) {
                    this.justificativaItem = value;
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
                     * Obt�m o valor da propriedade codDente.
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
                     * Obt�m o valor da propriedade codRegiao.
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
             *         &lt;element name="codGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
             *         &lt;element name="justificativaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto150"/>
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
                "codGlosaGuia",
                "justificativaGuia"
            })
            public static class RecursoGuia {

                @XmlElement(required = true)
                protected String codGlosaGuia;
                @XmlElement(required = true)
                protected String justificativaGuia;

                /**
                 * Obt�m o valor da propriedade codGlosaGuia.
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
                 * Obt�m o valor da propriedade justificativaGuia.
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
         * Obt�m o valor da propriedade codigoGlosaProtocolo.
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
         * Obt�m o valor da propriedade justificativaProtocolo.
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
