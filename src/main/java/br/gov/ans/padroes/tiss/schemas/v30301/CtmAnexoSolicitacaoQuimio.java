
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
 * <p>Classe Java de ctm_anexoSolicitacaoQuimio complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_anexoSolicitacaoQuimio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoAnexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_anexoCabecalho"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
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
@XmlType(name = "ctm_anexoSolicitacaoQuimio", propOrder = {
    "cabecalhoAnexo",
    "dadosBeneficiario",
    "dadosComplementaresBeneficiario",
    "medicoSolicitante",
    "diagnosticoOncologicoQuimioterapia",
    "drogasSolicitadas",
    "tratamentosAnteriores",
    "numeroCiclos",
    "cicloAtual",
    "diasCicloAtual",
    "intervaloCiclos",
    "observacao"
})
public class CtmAnexoSolicitacaoQuimio {

    @XmlElement(required = true)
    protected CtAnexoCabecalho cabecalhoAnexo;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtDadosComplementaresBeneficiario dadosComplementaresBeneficiario;
    @XmlElement(required = true)
    protected CtmAnexoSolicitante medicoSolicitante;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia diagnosticoOncologicoQuimioterapia;
    @XmlElement(required = true)
    protected CtmAnexoSolicitacaoQuimio.DrogasSolicitadas drogasSolicitadas;
    protected CtmAnexoSolicitacaoQuimio.TratamentosAnteriores tratamentosAnteriores;
    @XmlElement(required = true)
    protected BigInteger numeroCiclos;
    @XmlElement(required = true)
    protected BigInteger cicloAtual;
    @XmlElement(required = true)
    protected BigInteger diasCicloAtual;
    @XmlElement(required = true)
    protected BigInteger intervaloCiclos;
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
     *     {@link CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia getDiagnosticoOncologicoQuimioterapia() {
        return diagnosticoOncologicoQuimioterapia;
    }

    /**
     * Define o valor da propriedade diagnosticoOncologicoQuimioterapia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia }
     *     
     */
    public void setDiagnosticoOncologicoQuimioterapia(CtmAnexoSolicitacaoQuimio.DiagnosticoOncologicoQuimioterapia value) {
        this.diagnosticoOncologicoQuimioterapia = value;
    }

    /**
     * Obtém o valor da propriedade drogasSolicitadas.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoQuimio.DrogasSolicitadas }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.DrogasSolicitadas getDrogasSolicitadas() {
        return drogasSolicitadas;
    }

    /**
     * Define o valor da propriedade drogasSolicitadas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.DrogasSolicitadas }
     *     
     */
    public void setDrogasSolicitadas(CtmAnexoSolicitacaoQuimio.DrogasSolicitadas value) {
        this.drogasSolicitadas = value;
    }

    /**
     * Obtém o valor da propriedade tratamentosAnteriores.
     * 
     * @return
     *     possible object is
     *     {@link CtmAnexoSolicitacaoQuimio.TratamentosAnteriores }
     *     
     */
    public CtmAnexoSolicitacaoQuimio.TratamentosAnteriores getTratamentosAnteriores() {
        return tratamentosAnteriores;
    }

    /**
     * Define o valor da propriedade tratamentosAnteriores.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAnexoSolicitacaoQuimio.TratamentosAnteriores }
     *     
     */
    public void setTratamentosAnteriores(CtmAnexoSolicitacaoQuimio.TratamentosAnteriores value) {
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
