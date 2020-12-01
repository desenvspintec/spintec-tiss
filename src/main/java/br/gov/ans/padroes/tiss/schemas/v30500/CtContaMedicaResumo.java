
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * utilizado no demonstrativo de an�lise de conta
 * 
 * <p>Classe Java de ct_contaMedicaResumo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_contaMedicaResumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroLotePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="GlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" minOccurs="0"/>
 *         &lt;element name="situacaoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *         &lt;element name="relacaoGuias" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="senha" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                   &lt;element name="dataInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                   &lt;element name="horaInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="dataFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="horaFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *                   &lt;element name="motivoGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="situacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
 *                   &lt;element name="detalhesGuia" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                             &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
 *                             &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
 *                             &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                             &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
 *                   &lt;element name="valorInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorInformadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorProcessadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorLiberadoProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorGlosaProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contaMedicaResumo", propOrder = {
    "numeroLotePrestador",
    "numeroProtocolo",
    "dataProtocolo",
    "glosaProtocolo",
    "situacaoProtocolo",
    "relacaoGuias",
    "valorInformadoProtocolo",
    "valorProcessadoProtocolo",
    "valorLiberadoProtocolo",
    "valorGlosaProtocolo"
})
@XmlSeeAlso({
    br.gov.ans.padroes.tiss.schemas.v30500.CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo.class
})
public class CtContaMedicaResumo {

    @XmlElement(required = true)
    protected String numeroLotePrestador;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProtocolo;
    @XmlElement(name = "GlosaProtocolo")
    protected CtMotivoGlosa glosaProtocolo;
    @XmlElement(required = true)
    protected String situacaoProtocolo;
    protected List<CtContaMedicaResumo.RelacaoGuias> relacaoGuias;
    @XmlElement(required = true)
    protected BigDecimal valorInformadoProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoProtocolo;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoProtocolo;
    protected BigDecimal valorGlosaProtocolo;

    /**
     * Obt�m o valor da propriedade numeroLotePrestador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLotePrestador() {
        return numeroLotePrestador;
    }

    /**
     * Define o valor da propriedade numeroLotePrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLotePrestador(String value) {
        this.numeroLotePrestador = value;
    }

    /**
     * Obt�m o valor da propriedade numeroProtocolo.
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
     * Obt�m o valor da propriedade dataProtocolo.
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
     * Obt�m o valor da propriedade glosaProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public CtMotivoGlosa getGlosaProtocolo() {
        return glosaProtocolo;
    }

    /**
     * Define o valor da propriedade glosaProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtMotivoGlosa }
     *     
     */
    public void setGlosaProtocolo(CtMotivoGlosa value) {
        this.glosaProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade situacaoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSituacaoProtocolo() {
        return situacaoProtocolo;
    }

    /**
     * Define o valor da propriedade situacaoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSituacaoProtocolo(String value) {
        this.situacaoProtocolo = value;
    }

    /**
     * Gets the value of the relacaoGuias property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the relacaoGuias property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRelacaoGuias().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtContaMedicaResumo.RelacaoGuias }
     * 
     * 
     */
    public List<CtContaMedicaResumo.RelacaoGuias> getRelacaoGuias() {
        if (relacaoGuias == null) {
            relacaoGuias = new ArrayList<CtContaMedicaResumo.RelacaoGuias>();
        }
        return this.relacaoGuias;
    }

    /**
     * Obt�m o valor da propriedade valorInformadoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInformadoProtocolo() {
        return valorInformadoProtocolo;
    }

    /**
     * Define o valor da propriedade valorInformadoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInformadoProtocolo(BigDecimal value) {
        this.valorInformadoProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade valorProcessadoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoProtocolo() {
        return valorProcessadoProtocolo;
    }

    /**
     * Define o valor da propriedade valorProcessadoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoProtocolo(BigDecimal value) {
        this.valorProcessadoProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade valorLiberadoProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoProtocolo() {
        return valorLiberadoProtocolo;
    }

    /**
     * Define o valor da propriedade valorLiberadoProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoProtocolo(BigDecimal value) {
        this.valorLiberadoProtocolo = value;
    }

    /**
     * Obt�m o valor da propriedade valorGlosaProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaProtocolo() {
        return valorGlosaProtocolo;
    }

    /**
     * Define o valor da propriedade valorGlosaProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaProtocolo(BigDecimal value) {
        this.valorGlosaProtocolo = value;
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
     *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *         &lt;element name="dataInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *         &lt;element name="horaInicioFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="dataFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="horaFimFat" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
     *         &lt;element name="motivoGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="situacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusProtocolo"/>
     *         &lt;element name="detalhesGuia" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
     *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                   &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
     *                   &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
     *                   &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                   &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
     *         &lt;element name="valorInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
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
        "numeroCarteira",
        "dataInicioFat",
        "horaInicioFat",
        "dataFimFat",
        "horaFimFat",
        "motivoGlosaGuia",
        "situacaoGuia",
        "detalhesGuia",
        "valorInformadoGuia",
        "valorProcessadoGuia",
        "valorLiberadoGuia",
        "valorGlosaGuia"
    })
    public static class RelacaoGuias {

        @XmlElement(required = true)
        protected String numeroGuiaPrestador;
        protected String numeroGuiaOperadora;
        protected String senha;
        @XmlElement(required = true)
        protected String nomeBeneficiario;
        @XmlElement(required = true)
        protected String numeroCarteira;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataInicioFat;
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar horaInicioFat;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataFimFat;
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar horaFimFat;
        protected List<CtMotivoGlosa> motivoGlosaGuia;
        @XmlElement(required = true)
        protected String situacaoGuia;
        protected List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia> detalhesGuia;
        @XmlElement(required = true)
        protected BigDecimal valorInformadoGuia;
        @XmlElement(required = true)
        protected BigDecimal valorProcessadoGuia;
        @XmlElement(required = true)
        protected BigDecimal valorLiberadoGuia;
        protected BigDecimal valorGlosaGuia;

        /**
         * Obt�m o valor da propriedade numeroGuiaPrestador.
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
         * Obt�m o valor da propriedade nomeBeneficiario.
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
         * Obt�m o valor da propriedade numeroCarteira.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroCarteira() {
            return numeroCarteira;
        }

        /**
         * Define o valor da propriedade numeroCarteira.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroCarteira(String value) {
            this.numeroCarteira = value;
        }

        /**
         * Obt�m o valor da propriedade dataInicioFat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataInicioFat() {
            return dataInicioFat;
        }

        /**
         * Define o valor da propriedade dataInicioFat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataInicioFat(XMLGregorianCalendar value) {
            this.dataInicioFat = value;
        }

        /**
         * Obt�m o valor da propriedade horaInicioFat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraInicioFat() {
            return horaInicioFat;
        }

        /**
         * Define o valor da propriedade horaInicioFat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraInicioFat(XMLGregorianCalendar value) {
            this.horaInicioFat = value;
        }

        /**
         * Obt�m o valor da propriedade dataFimFat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataFimFat() {
            return dataFimFat;
        }

        /**
         * Define o valor da propriedade dataFimFat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataFimFat(XMLGregorianCalendar value) {
            this.dataFimFat = value;
        }

        /**
         * Obt�m o valor da propriedade horaFimFat.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getHoraFimFat() {
            return horaFimFat;
        }

        /**
         * Define o valor da propriedade horaFimFat.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setHoraFimFat(XMLGregorianCalendar value) {
            this.horaFimFat = value;
        }

        /**
         * Gets the value of the motivoGlosaGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosaGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosaGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosaGuia() {
            if (motivoGlosaGuia == null) {
                motivoGlosaGuia = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosaGuia;
        }

        /**
         * Obt�m o valor da propriedade situacaoGuia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSituacaoGuia() {
            return situacaoGuia;
        }

        /**
         * Define o valor da propriedade situacaoGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSituacaoGuia(String value) {
            this.situacaoGuia = value;
        }

        /**
         * Gets the value of the detalhesGuia property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the detalhesGuia property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDetalhesGuia().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtContaMedicaResumo.RelacaoGuias.DetalhesGuia }
         * 
         * 
         */
        public List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia> getDetalhesGuia() {
            if (detalhesGuia == null) {
                detalhesGuia = new ArrayList<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia>();
            }
            return this.detalhesGuia;
        }

        /**
         * Obt�m o valor da propriedade valorInformadoGuia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorInformadoGuia() {
            return valorInformadoGuia;
        }

        /**
         * Define o valor da propriedade valorInformadoGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorInformadoGuia(BigDecimal value) {
            this.valorInformadoGuia = value;
        }

        /**
         * Obt�m o valor da propriedade valorProcessadoGuia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProcessadoGuia() {
            return valorProcessadoGuia;
        }

        /**
         * Define o valor da propriedade valorProcessadoGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProcessadoGuia(BigDecimal value) {
            this.valorProcessadoGuia = value;
        }

        /**
         * Obt�m o valor da propriedade valorLiberadoGuia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorLiberadoGuia() {
            return valorLiberadoGuia;
        }

        /**
         * Define o valor da propriedade valorLiberadoGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorLiberadoGuia(BigDecimal value) {
            this.valorLiberadoGuia = value;
        }

        /**
         * Obt�m o valor da propriedade valorGlosaGuia.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorGlosaGuia() {
            return valorGlosaGuia;
        }

        /**
         * Define o valor da propriedade valorGlosaGuia.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorGlosaGuia(BigDecimal value) {
            this.valorGlosaGuia = value;
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
         *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *         &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart" minOccurs="0"/>
         *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="qtdExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
         *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *         &lt;element name="relacaoGlosa" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
            "sequencialItem",
            "dataRealizacao",
            "procedimento",
            "grauParticipacao",
            "valorInformado",
            "qtdExecutada",
            "valorProcessado",
            "valorLiberado",
            "relacaoGlosa"
        })
        public static class DetalhesGuia {

            @XmlElement(required = true)
            protected BigInteger sequencialItem;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dataRealizacao;
            @XmlElement(required = true)
            protected CtProcedimentoDados procedimento;
            protected String grauParticipacao;
            @XmlElement(required = true)
            protected BigDecimal valorInformado;
            @XmlElement(required = true)
            protected BigDecimal qtdExecutada;
            @XmlElement(required = true)
            protected BigDecimal valorProcessado;
            @XmlElement(required = true)
            protected BigDecimal valorLiberado;
            protected List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa> relacaoGlosa;

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
             * Obt�m o valor da propriedade dataRealizacao.
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
             * Obt�m o valor da propriedade procedimento.
             * 
             * @return
             *     possible object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public CtProcedimentoDados getProcedimento() {
                return procedimento;
            }

            /**
             * Define o valor da propriedade procedimento.
             * 
             * @param value
             *     allowed object is
             *     {@link CtProcedimentoDados }
             *     
             */
            public void setProcedimento(CtProcedimentoDados value) {
                this.procedimento = value;
            }

            /**
             * Obt�m o valor da propriedade grauParticipacao.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGrauParticipacao() {
                return grauParticipacao;
            }

            /**
             * Define o valor da propriedade grauParticipacao.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGrauParticipacao(String value) {
                this.grauParticipacao = value;
            }

            /**
             * Obt�m o valor da propriedade valorInformado.
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
             * Obt�m o valor da propriedade qtdExecutada.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getQtdExecutada() {
                return qtdExecutada;
            }

            /**
             * Define o valor da propriedade qtdExecutada.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setQtdExecutada(BigDecimal value) {
                this.qtdExecutada = value;
            }

            /**
             * Obt�m o valor da propriedade valorProcessado.
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
             * Obt�m o valor da propriedade valorLiberado.
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
             * Gets the value of the relacaoGlosa property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the relacaoGlosa property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRelacaoGlosa().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa }
             * 
             * 
             */
            public List<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa> getRelacaoGlosa() {
                if (relacaoGlosa == null) {
                    relacaoGlosa = new ArrayList<CtContaMedicaResumo.RelacaoGuias.DetalhesGuia.RelacaoGlosa>();
                }
                return this.relacaoGlosa;
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
             *         &lt;element name="valorGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="tipoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa"/>
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
                "valorGlosa",
                "tipoGlosa"
            })
            public static class RelacaoGlosa {

                @XmlElement(required = true)
                protected BigDecimal valorGlosa;
                @XmlElement(required = true)
                protected String tipoGlosa;

                /**
                 * Obt�m o valor da propriedade valorGlosa.
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

                /**
                 * Obt�m o valor da propriedade tipoGlosa.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTipoGlosa() {
                    return tipoGlosa;
                }

                /**
                 * Define o valor da propriedade tipoGlosa.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTipoGlosa(String value) {
                    this.tipoGlosa = value;
                }

            }

        }

    }

}
