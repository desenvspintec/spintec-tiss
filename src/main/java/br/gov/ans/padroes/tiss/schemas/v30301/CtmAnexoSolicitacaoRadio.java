
package br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_anexoSolicitacaoRadio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitacaoRadio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
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
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_anexoSolicitacaoRadio", propOrder = {
    "cabecalhoAnexo",
    "dadosBeneficiario",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoRadio",
    "tratamentosAnteriores",
    "numeroCampos",
    "doseCampo",
    "doseTotal",
    "nrDias",
    "dtPrevistaInicio",
    "observacao"
})
public class CtmAnexoSolicitacaoRadio {

    @XmlElement(required = true)
    protected CtAnexoCabecalho cabecalhoAnexo;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiarioRadio dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio diagnosticoOncologicoRadio;
    protected CtmAnexoSolicitacaoRadio.TratamentosAnteriores tratamentosAnteriores;
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
    protected String observacao;

    /**
     * Obtém o valor da propriedade cabecalhoAnexo.
     * 
     * @return
     *     possible object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public CtAnexoCabecalho getCabecalhoAnexo() {
        return cabecalhoAnexo;
    }

    /**
     * Define o valor da propriedade cabecalhoAnexo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAnexoCabecalho }
     *     
     */
    public void setCabecalhoAnexo(CtAnexoCabecalho value) {
        this.cabecalhoAnexo = value;
    }

    /**
     * Obtém o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
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
     *     {@link CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio getDiagnosticoOncologicoRadio() {
        return diagnosticoOncologicoRadio;
    }

    /**
     * Define o valor da propriedade diagnosticoOncologicoRadio.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio }
     *     
     */
    public void setDiagnosticoOncologicoRadio(CtmAnexoSolicitacaoRadio.DiagnosticoOncologicoRadio value) {
        this.diagnosticoOncologicoRadio = value;
    }

    /**
     * Obtém o valor da propriedade tratamentosAnteriores.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoRadio.TratamentosAnteriores }
     *     
     */
    public CtmAnexoSolicitacaoRadio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Define o valor da propriedade tratamentosAnteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoRadio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAnexoSolicitacaoRadio.TratamentosAnteriores value) {
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
     * Obtém o valor da propriedade observacao.
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
