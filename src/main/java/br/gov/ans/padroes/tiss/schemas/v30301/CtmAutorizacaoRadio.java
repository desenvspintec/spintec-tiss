
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

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
 * <p>Classe Java de ctm_autorizacaoRadio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoRadio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoDados"/>
 *         &lt;element name="numeroCarteira" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *         &lt;element name="numeroCNS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15" minOccurs="0"/>
 *         &lt;element name="statusSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_statusSolicitacao"/>
 *         &lt;element name="dadosComplementaresBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosComplementaresBeneficiarioRadio"/>
 *         &lt;element name="medicoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_anexoSolicitante"/>
 *         &lt;element name="diagnosticoOncologicoRadio">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="diagRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
 *                   &lt;element name="diagnosticoImagem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_diagnosticoImagem" minOccurs="0"/>
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
 *                   &lt;element name="quimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
 *                   &lt;element name="dataQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="numeroCampos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="doseCampo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="doseTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="nrDias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="dtPrevistaInicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
@XmlType(name = "ctm_autorizacaoRadio", propOrder = {
    "dadosAutorizacao",
    "numeroCarteira",
    "nomeBeneficiario",
    "numeroCNS",
    "statusSolicitacao",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoRadio",
    "tratamentosAnteriores",
    "numeroCampos",
    "doseCampo",
    "doseTotal",
    "nrDias",
    "dtPrevistaInicio",
    "motivosNegativa"
})
public class CtmAutorizacaoRadio {

    @XmlElement(required = true)
    protected CtAutorizacaoDados dadosAutorizacao;
    @XmlElement(required = true)
    protected String numeroCarteira;
    @XmlElement(required = true)
    protected String nomeBeneficiario;
    protected String numeroCNS;
    @XmlElement(required = true)
    protected String statusSolicitacao;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiarioRadio dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAutorizacaoRadio.DiagnosticoOncologicoRadio diagnosticoOncologicoRadio;
    protected CtmAutorizacaoRadio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected BigInteger numeroCampos;
    @XmlElement(required = true)
    protected BigInteger doseCampo;
    @XmlElement(required = true)
    protected BigInteger doseTotal;
    @XmlElement(required = true)
    protected BigInteger nrDias;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dtPrevistaInicio;
    protected CtmAutorizacaoRadio.MotivosNegativa motivosNegativa;

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
     * Obtém o valor da propriedade dadosComplementaresBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtDadosComplementaresBeneficiarioRadio }
     *     
     */
    public CtDadosComplementaresBeneficiarioRadio getDadosComplementaresBeneficiario() {
        return dadosComplementaresBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosComplementaresBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDadosComplementaresBeneficiarioRadio }
     *     
     */
    public void setDadosComplementaresBeneficiario(CtDadosComplementaresBeneficiarioRadio value) {
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
     * Obtém o valor da propriedade diagnosticoOncologicoRadio.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public CtmAutorizacaoRadio.DiagnosticoOncologicoRadio getDiagnosticoOncologicoRadio() {
        return diagnosticoOncologicoRadio;
    }

    /**
     * Define o valor da propriedade diagnosticoOncologicoRadio.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public void setDiagnosticoOncologicoRadio(CtmAutorizacaoRadio.DiagnosticoOncologicoRadio value) {
        this.diagnosticoOncologicoRadio = value;
    }

    /**
     * Obtém o valor da propriedade tratamentosAnteriores.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoRadio.TratamentosAnteriores }
     *     
     */
    public CtmAutorizacaoRadio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Define o valor da propriedade tratamentosAnteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoRadio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAutorizacaoRadio.TratamentosAnteriores value) {
        this.tratamentosAnteriores = value;
    }

    /**
     * Obtém o valor da propriedade numeroCampos.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumeroCampos() {
        return numeroCampos;
    }

    /**
     * Define o valor da propriedade numeroCampos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumeroCampos(BigInteger value) {
        this.numeroCampos = value;
    }

    /**
     * Obtém o valor da propriedade doseCampo.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoseCampo() {
        return doseCampo;
    }

    /**
     * Define o valor da propriedade doseCampo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoseCampo(BigInteger value) {
        this.doseCampo = value;
    }

    /**
     * Obtém o valor da propriedade doseTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDoseTotal() {
        return doseTotal;
    }

    /**
     * Define o valor da propriedade doseTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDoseTotal(BigInteger value) {
        this.doseTotal = value;
    }

    /**
     * Obtém o valor da propriedade nrDias.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNrDias() {
        return nrDias;
    }

    /**
     * Define o valor da propriedade nrDias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNrDias(BigInteger value) {
        this.nrDias = value;
    }

    /**
     * Obtém o valor da propriedade dtPrevistaInicio.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDtPrevistaInicio() {
        return dtPrevistaInicio;
    }

    /**
     * Define o valor da propriedade dtPrevistaInicio.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDtPrevistaInicio(XMLGregorianCalendar value) {
        this.dtPrevistaInicio = value;
    }

    /**
     * Obtém o valor da propriedade motivosNegativa.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoRadio.MotivosNegativa }
     *     
     */
    public CtmAutorizacaoRadio.MotivosNegativa getMotivosNegativa() {
        return motivosNegativa;
    }

    /**
     * Define o valor da propriedade motivosNegativa.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoRadio.MotivosNegativa }
     *     
     */
    public void setMotivosNegativa(CtmAutorizacaoRadio.MotivosNegativa value) {
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
     *         &lt;element name="diagRadio" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_diagnosticoOncologico"/>
     *         &lt;element name="diagnosticoImagem" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_diagnosticoImagem" minOccurs="0"/>
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
        "diagRadio",
        "diagnosticoImagem"
    })
    public static class DiagnosticoOncologicoRadio {

        @XmlElement(required = true)
        protected CtDiagnosticoOncologico diagRadio;
        protected String diagnosticoImagem;

        /**
         * Obtém o valor da propriedade diagRadio.
         * 
         * @return
         *     possible object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public CtDiagnosticoOncologico getDiagRadio() {
            return diagRadio;
        }

        /**
         * Define o valor da propriedade diagRadio.
         * 
         * @param value
         *     allowed object is
         *     {@link CtDiagnosticoOncologico }
         *     
         */
        public void setDiagRadio(CtDiagnosticoOncologico value) {
            this.diagRadio = value;
        }

        /**
         * Obtém o valor da propriedade diagnosticoImagem.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosticoImagem() {
            return diagnosticoImagem;
        }

        /**
         * Define o valor da propriedade diagnosticoImagem.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosticoImagem(String value) {
            this.diagnosticoImagem = value;
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
     *         &lt;element name="quimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40" minOccurs="0"/>
     *         &lt;element name="dataQuimioterapia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
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
        "quimioterapia",
        "dataQuimioterapia"
    })
    public static class TratamentosAnteriores {

        protected String cirurgia;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datacirurgia;
        protected String quimioterapia;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataQuimioterapia;

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
         * Obtém o valor da propriedade quimioterapia.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuimioterapia() {
            return quimioterapia;
        }

        /**
         * Define o valor da propriedade quimioterapia.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuimioterapia(String value) {
            this.quimioterapia = value;
        }

        /**
         * Obtém o valor da propriedade dataQuimioterapia.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataQuimioterapia() {
            return dataQuimioterapia;
        }

        /**
         * Define o valor da propriedade dataQuimioterapia.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataQuimioterapia(XMLGregorianCalendar value) {
            this.dataQuimioterapia = value;
        }

    }

}
