
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guiaDadosOdonto complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaDadosOdonto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *         &lt;element name="ausenciaCodValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_ausenciaCodValidacao" minOccurs="0"/>
 *         &lt;element name="codValidacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10" minOccurs="0"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="atendimentoRN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="tipoIdent" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoIdent" minOccurs="0"/>
 *         &lt;element name="identificadorBeneficiario" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="templateBiometrico" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="vlInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal" minOccurs="0"/>
 *         &lt;element name="glosaGuia" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="procedimentosRealizados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoRealizado" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOdonto">
 *                           &lt;sequence>
 *                             &lt;element name="glosasProcedimento" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
 *                                       &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
@XmlType(name = "ct_guiaDadosOdonto", propOrder = {
    "numeroGuiaPrestador",
    "numeroGuiaOperadora",
    "ausenciaCodValidacao",
    "codValidacao",
    "numeroCarteira",
    "atendimentoRN",
    "nomeBeneficiario",
    "numeroCNS",
    "tipoIdent",
    "identificadorBeneficiario",
    "templateBiometrico",
    "vlInformadoGuia",
    "glosaGuia",
    "procedimentosRealizados"
})
public class CtGuiaDadosOdonto {

    @XmlElement(required = true)
    protected String numeroGuiaPrestador;
    protected String numeroGuiaOperadora;
    protected String ausenciaCodValidacao;
    protected String codValidacao;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmSimNao atendimentoRN;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    protected String tipoIdent;
    protected byte[] identificadorBeneficiario;
    protected byte[] templateBiometrico;
    protected CtValorTotal vlInformadoGuia;
    protected CtGuiaDadosOdonto.GlosaGuia glosaGuia;
    protected CtGuiaDadosOdonto.ProcedimentosRealizados procedimentosRealizados;

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
     * Obt�m o valor da propriedade ausenciaCodValidacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAusenciaCodValidacao() {
        return ausenciaCodValidacao;
    }

    /**
     * Define o valor da propriedade ausenciaCodValidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAusenciaCodValidacao(String value) {
        this.ausenciaCodValidacao = value;
    }

    /**
     * Obt�m o valor da propriedade codValidacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodValidacao() {
        return codValidacao;
    }

    /**
     * Define o valor da propriedade codValidacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodValidacao(String value) {
        this.codValidacao = value;
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
     * Obt�m o valor da propriedade atendimentoRN.
     * 
     * @return
     *     possible object is
     *     {@link DmSimNao }
     *     
     */
    public DmSimNao getAtendimentoRN() {
        return atendimentoRN;
    }

    /**
     * Define o valor da propriedade atendimentoRN.
     * 
     * @param value
     *     allowed object is
     *     {@link DmSimNao }
     *     
     */
    public void setAtendimentoRN(DmSimNao value) {
        this.atendimentoRN = value;
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
     * Obt�m o valor da propriedade numeroCNS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroCNS() {
        return numeroCNS;
    }

    /**
     * Define o valor da propriedade numeroCNS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroCNS(String value) {
        this.numeroCNS = value;
    }

    /**
     * Obt�m o valor da propriedade tipoIdent.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoIdent() {
        return tipoIdent;
    }

    /**
     * Define o valor da propriedade tipoIdent.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoIdent(String value) {
        this.tipoIdent = value;
    }

    /**
     * Obt�m o valor da propriedade identificadorBeneficiario.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getIdentificadorBeneficiario() {
        return identificadorBeneficiario;
    }

    /**
     * Define o valor da propriedade identificadorBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setIdentificadorBeneficiario(byte[] value) {
        this.identificadorBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade templateBiometrico.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getTemplateBiometrico() {
        return templateBiometrico;
    }

    /**
     * Define o valor da propriedade templateBiometrico.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setTemplateBiometrico(byte[] value) {
        this.templateBiometrico = value;
    }

    /**
     * Obt�m o valor da propriedade vlInformadoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getVlInformadoGuia() {
        return vlInformadoGuia;
    }

    /**
     * Define o valor da propriedade vlInformadoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setVlInformadoGuia(CtValorTotal value) {
        this.vlInformadoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade glosaGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosOdonto.GlosaGuia }
     *     
     */
    public CtGuiaDadosOdonto.GlosaGuia getGlosaGuia() {
        return glosaGuia;
    }

    /**
     * Define o valor da propriedade glosaGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosOdonto.GlosaGuia }
     *     
     */
    public void setGlosaGuia(CtGuiaDadosOdonto.GlosaGuia value) {
        this.glosaGuia = value;
    }

    /**
     * Obt�m o valor da propriedade procedimentosRealizados.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaDadosOdonto.ProcedimentosRealizados }
     *     
     */
    public CtGuiaDadosOdonto.ProcedimentosRealizados getProcedimentosRealizados() {
        return procedimentosRealizados;
    }

    /**
     * Define o valor da propriedade procedimentosRealizados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaDadosOdonto.ProcedimentosRealizados }
     *     
     */
    public void setProcedimentosRealizados(CtGuiaDadosOdonto.ProcedimentosRealizados value) {
        this.procedimentosRealizados = value;
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
     *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
        "motivoGlosa"
    })
    public static class GlosaGuia {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoGlosa;

        /**
         * Gets the value of the motivoGlosa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoGlosa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoGlosa() {
            if (motivoGlosa == null) {
                motivoGlosa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoGlosa;
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
     *         &lt;element name="procedimentoRealizado" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOdonto">
     *                 &lt;sequence>
     *                   &lt;element name="glosasProcedimento" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
     *                             &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "procedimentoRealizado"
    })
    public static class ProcedimentosRealizados {

        @XmlElement(required = true)
        protected List<CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado> procedimentoRealizado;

        /**
         * Gets the value of the procedimentoRealizado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoRealizado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoRealizado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado }
         * 
         * 
         */
        public List<CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado> getProcedimentoRealizado() {
            if (procedimentoRealizado == null) {
                procedimentoRealizado = new ArrayList<CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado>();
            }
            return this.procedimentoRealizado;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoOdonto">
         *       &lt;sequence>
         *         &lt;element name="glosasProcedimento" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
         *                   &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "glosasProcedimento"
        })
        public static class ProcedimentoRealizado
            extends CtProcedimentoExecutadoOdonto
        {

            protected CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento glosasProcedimento;

            /**
             * Obt�m o valor da propriedade glosasProcedimento.
             * 
             * @return
             *     possible object is
             *     {@link CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento }
             *     
             */
            public CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento getGlosasProcedimento() {
                return glosasProcedimento;
            }

            /**
             * Define o valor da propriedade glosasProcedimento.
             * 
             * @param value
             *     allowed object is
             *     {@link CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento }
             *     
             */
            public void setGlosasProcedimento(CtGuiaDadosOdonto.ProcedimentosRealizados.ProcedimentoRealizado.GlosasProcedimento value) {
                this.glosasProcedimento = value;
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
             *         &lt;element name="motivoGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
             *         &lt;element name="valorGlosaProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "motivoGlosa",
                "valorGlosaProcedimento"
            })
            public static class GlosasProcedimento {

                @XmlElement(required = true)
                protected List<CtMotivoGlosa> motivoGlosa;
                @XmlElement(required = true)
                protected BigDecimal valorGlosaProcedimento;

                /**
                 * Gets the value of the motivoGlosa property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the motivoGlosa property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getMotivoGlosa().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtMotivoGlosa }
                 * 
                 * 
                 */
                public List<CtMotivoGlosa> getMotivoGlosa() {
                    if (motivoGlosa == null) {
                        motivoGlosa = new ArrayList<CtMotivoGlosa>();
                    }
                    return this.motivoGlosa;
                }

                /**
                 * Obt�m o valor da propriedade valorGlosaProcedimento.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorGlosaProcedimento() {
                    return valorGlosaProcedimento;
                }

                /**
                 * Define o valor da propriedade valorGlosaProcedimento.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorGlosaProcedimento(BigDecimal value) {
                    this.valorGlosaProcedimento = value;
                }

            }

        }

    }

}
