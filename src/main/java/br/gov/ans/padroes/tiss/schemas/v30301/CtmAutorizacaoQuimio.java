
package br.gov.ans.padroes.tiss.schemas.v30301;

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
 * <p>Classe Java de ctm_autorizacaoQuimio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoQuimio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="dadosComplementaresBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosComplementaresBeneficiario"/>
 *         &lt;element name="medicoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitante"/>
 *         &lt;element name="diagnosticoOncologicoQuimioterapia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diagQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
 *                   &lt;element name="tumor" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tumor"/>
 *                   &lt;element name="nodulo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_nodulo"/>
 *                   &lt;element name="metastase" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_metastase"/>
 *                   &lt;element name="tipoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoQuimioterapia"/>
 *                   &lt;element name="planoTerapeutico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="drogasSolicitadas">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="drogaSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_drogasSolicitadas" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tratamentosAnteriores" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="datacirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="areaIrradiada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="dataIrradiacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroCiclos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *         &lt;element name="cicloAtual" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *         &lt;element name="diasCicloAtual" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="intervaloCiclos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="motivosNegativa" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
@XmlType(name = "ctm_autorizacaoQuimio", propOrder = {
    "dadosAutorizacao",
    "numeroCarteira",
    "statusSolicitacao",
    "nomeBeneficiario",
    "numeroCNS",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoQuimioterapia",
    "drogasSolicitadas",
    "tratamentosAnteriores",
    "numeroCiclos",
    "cicloAtual",
    "diasCicloAtual",
    "intervaloCiclos",
    "motivosNegativa"
})
public class CtmAutorizacaoQuimio {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiario dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia diagnosticoOncologicoQuimioterapia;
    @XmlElement(required = true)
    protected CtmAutorizacaoQuimio.DrogasSolicitadas drogasSolicitadas;
    protected CtmAutorizacaoQuimio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected BigInteger numeroCiclos;
    @XmlElement(required = true)
    protected BigInteger cicloAtual;
    @XmlElement(required = true)
    protected BigInteger diasCicloAtual;
    @XmlElement(required = true)
    protected BigInteger intervaloCiclos;
    protected CtmAutorizacaoQuimio.MotivosNegativa motivosNegativa;

    /**
     * Obtém o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public CtAutorizacaoDados getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoDados }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoDados value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obtém o valor da propriedade numeroCarteira.
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
     * Obtém o valor da propriedade statusSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusSolicitacao() {
        return statusSolicitacao;
    }

    /**
     * Define o valor da propriedade statusSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusSolicitacao(String value) {
        this.statusSolicitacao = value;
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
     * Obtém o valor da propriedade numeroCNS.
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
     * Obtém o valor da propriedade dadosComplementaresBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosComplementaresBeneficiario }
     *     
     */
    public CtDadosComplementaresBeneficiario getDadosComplementaresBeneficiario() {
        return dadosComplementaresBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosComplementaresBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosComplementaresBeneficiario }
     *     
     */
    public void setDadosComplementaresBeneficiario(CtDadosComplementaresBeneficiario value) {
        this.dadosComplementaresBeneficiario = value;
    }

    /**
     * Obtém o valor da propriedade medicoSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public CtmAnexoSolicitante getMedicoSolicitante() {
        return medicoSolicitante;
    }

    /**
     * Define o valor da propriedade medicoSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitante }
     *     
     */
    public void setMedicoSolicitante(CtmAnexoSolicitante value) {
        this.medicoSolicitante = value;
    }

    /**
     * Obtém o valor da propriedade diagnosticoOncologicoQuimioterapia.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia getDiagnosticoOncologicoQuimioterapia() {
        return diagnosticoOncologicoQuimioterapia;
    }

    /**
     * Define o valor da propriedade diagnosticoOncologicoQuimioterapia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public void setDiagnosticoOncologicoQuimioterapia(CtmAutorizacaoQuimio.DiagnosticoOncologicoQuimioterapia value) {
        this.diagnosticoOncologicoQuimioterapia = value;
    }

    /**
     * Obtém o valor da propriedade drogasSolicitadas.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.DrogasSolicitadas }
     *     
     */
    public CtmAutorizacaoQuimio.DrogasSolicitadas getDrogasSolicitadas() {
        return drogasSolicitadas;
    }

    /**
     * Define o valor da propriedade drogasSolicitadas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.DrogasSolicitadas }
     *     
     */
    public void setDrogasSolicitadas(CtmAutorizacaoQuimio.DrogasSolicitadas value) {
        this.drogasSolicitadas = value;
    }

    /**
     * Obtém o valor da propriedade tratamentosAnteriores.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.TratamentosAnteriores }
     *     
     */
    public CtmAutorizacaoQuimio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Define o valor da propriedade tratamentosAnteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAutorizacaoQuimio.TratamentosAnteriores value) {
        this.tratamentosAnteriores = value;
    }

    /**
     * Obtém o valor da propriedade numeroCiclos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCiclos() {
        return numeroCiclos;
    }

    /**
     * Define o valor da propriedade numeroCiclos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroCiclos(BigInteger value) {
        this.numeroCiclos = value;
    }

    /**
     * Obtém o valor da propriedade cicloAtual.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCicloAtual() {
        return cicloAtual;
    }

    /**
     * Define o valor da propriedade cicloAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCicloAtual(BigInteger value) {
        this.cicloAtual = value;
    }

    /**
     * Obtém o valor da propriedade diasCicloAtual.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiasCicloAtual() {
        return diasCicloAtual;
    }

    /**
     * Define o valor da propriedade diasCicloAtual.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiasCicloAtual(BigInteger value) {
        this.diasCicloAtual = value;
    }

    /**
     * Obtém o valor da propriedade intervaloCiclos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIntervaloCiclos() {
        return intervaloCiclos;
    }

    /**
     * Define o valor da propriedade intervaloCiclos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIntervaloCiclos(BigInteger value) {
        this.intervaloCiclos = value;
    }

    /**
     * Obtém o valor da propriedade motivosNegativa.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoQuimio.MotivosNegativa }
     *     
     */
    public CtmAutorizacaoQuimio.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Define o valor da propriedade motivosNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoQuimio.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtmAutorizacaoQuimio.MotivosNegativa value) {
        this.motivosNegativa = value;
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
     *         &lt;element name="diagQuimio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
     *         &lt;element name="tumor" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tumor"/>
     *         &lt;element name="nodulo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_nodulo"/>
     *         &lt;element name="metastase" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_metastase"/>
     *         &lt;element name="tipoQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoQuimioterapia"/>
     *         &lt;element name="planoTerapeutico" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto1000"/>
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
        "diagQuimio",
        "tumor",
        "nodulo",
        "metastase",
        "tipoQuimioterapia",
        "planoTerapeutico"
    })
    public static class DiagnosticoOncologicoQuimioterapia {

        @XmlElement(required = true)
        protected CtDiagnosticoOncologico diagQuimio;
        @XmlElement(required = true)
        protected String tumor;
        @XmlElement(required = true)
        protected String nodulo;
        @XmlElement(required = true)
        protected String metastase;
        @XmlElement(required = true)
        protected String tipoQuimioterapia;
        @XmlElement(required = true)
        protected String planoTerapeutico;

        /**
         * Obtém o valor da propriedade diagQuimio.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public CtDiagnosticoOncologico getDiagQuimio() {
            return diagQuimio;
        }

        /**
         * Define o valor da propriedade diagQuimio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public void setDiagQuimio(CtDiagnosticoOncologico value) {
            this.diagQuimio = value;
        }

        /**
         * Obtém o valor da propriedade tumor.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTumor() {
            return tumor;
        }

        /**
         * Define o valor da propriedade tumor.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTumor(String value) {
            this.tumor = value;
        }

        /**
         * Obtém o valor da propriedade nodulo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNodulo() {
            return nodulo;
        }

        /**
         * Define o valor da propriedade nodulo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNodulo(String value) {
            this.nodulo = value;
        }

        /**
         * Obtém o valor da propriedade metastase.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetastase() {
            return metastase;
        }

        /**
         * Define o valor da propriedade metastase.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetastase(String value) {
            this.metastase = value;
        }

        /**
         * Obtém o valor da propriedade tipoQuimioterapia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoQuimioterapia() {
            return tipoQuimioterapia;
        }

        /**
         * Define o valor da propriedade tipoQuimioterapia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoQuimioterapia(String value) {
            this.tipoQuimioterapia = value;
        }

        /**
         * Obtém o valor da propriedade planoTerapeutico.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanoTerapeutico() {
            return planoTerapeutico;
        }

        /**
         * Define o valor da propriedade planoTerapeutico.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanoTerapeutico(String value) {
            this.planoTerapeutico = value;
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
     *         &lt;element name="drogaSolicitada" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_drogasSolicitadas" maxOccurs="unbounded"/>
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
        "drogaSolicitada"
    })
    public static class DrogasSolicitadas {

        @XmlElement(required = true)
        protected List<CtDrogasSolicitadas> drogaSolicitada;

        /**
         * Gets the value of the drogaSolicitada property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the drogaSolicitada property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDrogaSolicitada().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDrogasSolicitadas }
         * 
         * 
         */
        public List<CtDrogasSolicitadas> getDrogaSolicitada() {
            if (drogaSolicitada == null) {
                drogaSolicitada = new ArrayList<CtDrogasSolicitadas>();
            }
            return this.drogaSolicitada;
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
     *         &lt;element name="motivoNegativa" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_motivoGlosa" maxOccurs="unbounded"/>
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
        "motivoNegativa"
    })
    public static class MotivosNegativa {

        @XmlElement(required = true)
        protected List<CtMotivoGlosa> motivoNegativa;

        /**
         * Gets the value of the motivoNegativa property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the motivoNegativa property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMotivoNegativa().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtMotivoGlosa }
         * 
         * 
         */
        public List<CtMotivoGlosa> getMotivoNegativa() {
            if (motivoNegativa == null) {
                motivoNegativa = new ArrayList<CtMotivoGlosa>();
            }
            return this.motivoNegativa;
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
     *         &lt;element name="cirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="datacirurgia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="areaIrradiada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="dataIrradiacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
        "cirurgia",
        "datacirurgia",
        "areaIrradiada",
        "dataIrradiacao"
    })
    public static class TratamentosAnteriores {

        protected String cirurgia;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datacirurgia;
        protected String areaIrradiada;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataIrradiacao;

        /**
         * Obtém o valor da propriedade cirurgia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCirurgia() {
            return cirurgia;
        }

        /**
         * Define o valor da propriedade cirurgia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCirurgia(String value) {
            this.cirurgia = value;
        }

        /**
         * Obtém o valor da propriedade datacirurgia.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatacirurgia() {
            return datacirurgia;
        }

        /**
         * Define o valor da propriedade datacirurgia.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatacirurgia(XMLGregorianCalendar value) {
            this.datacirurgia = value;
        }

        /**
         * Obtém o valor da propriedade areaIrradiada.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaIrradiada() {
            return areaIrradiada;
        }

        /**
         * Define o valor da propriedade areaIrradiada.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaIrradiada(String value) {
            this.areaIrradiada = value;
        }

        /**
         * Obtém o valor da propriedade dataIrradiacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataIrradiacao() {
            return dataIrradiacao;
        }

        /**
         * Define o valor da propriedade dataIrradiacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataIrradiacao(XMLGregorianCalendar value) {
            this.dataIrradiacao = value;
        }

    }

}
