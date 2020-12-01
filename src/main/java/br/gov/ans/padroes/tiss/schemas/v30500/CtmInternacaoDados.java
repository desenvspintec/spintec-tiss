
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_internacaoDados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_internacaoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *         &lt;element name="tipoFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoFaturamento"/>
 *         &lt;element name="dataInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicioFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *         &lt;element name="dataFinalFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaFinalFaturamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora"/>
 *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
 *         &lt;element name="regimeInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regimeInternacao"/>
 *         &lt;element name="declaracoes" maxOccurs="8" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="declaracaoNascido" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_declaracaoNascidoObito" minOccurs="0"/>
 *                   &lt;element name="diagnosticoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
 *                   &lt;element name="declaracaoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_declaracaoNascidoObito" minOccurs="0"/>
 *                   &lt;element name="indicadorDORN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
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
@XmlType(name = "ctm_internacaoDados", propOrder = {
    "caraterAtendimento",
    "tipoFaturamento",
    "dataInicioFaturamento",
    "horaInicioFaturamento",
    "dataFinalFaturamento",
    "horaFinalFaturamento",
    "tipoInternacao",
    "regimeInternacao",
    "declaracoes"
})
public class CtmInternacaoDados {

    @XmlElement(required = true)
    protected String caraterAtendimento;
    @XmlElement(required = true)
    protected String tipoFaturamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataInicioFaturamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaInicioFaturamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataFinalFaturamento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaFinalFaturamento;
    @XmlElement(required = true)
    protected String tipoInternacao;
    @XmlElement(required = true)
    protected String regimeInternacao;
    protected List<CtmInternacaoDados.Declaracoes> declaracoes;

    /**
     * Obt�m o valor da propriedade caraterAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCaraterAtendimento() {
        return caraterAtendimento;
    }

    /**
     * Define o valor da propriedade caraterAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCaraterAtendimento(String value) {
        this.caraterAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoFaturamento() {
        return tipoFaturamento;
    }

    /**
     * Define o valor da propriedade tipoFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoFaturamento(String value) {
        this.tipoFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade dataInicioFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataInicioFaturamento() {
        return dataInicioFaturamento;
    }

    /**
     * Define o valor da propriedade dataInicioFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataInicioFaturamento(XMLGregorianCalendar value) {
        this.dataInicioFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade horaInicioFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicioFaturamento() {
        return horaInicioFaturamento;
    }

    /**
     * Define o valor da propriedade horaInicioFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicioFaturamento(XMLGregorianCalendar value) {
        this.horaInicioFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade dataFinalFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataFinalFaturamento() {
        return dataFinalFaturamento;
    }

    /**
     * Define o valor da propriedade dataFinalFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataFinalFaturamento(XMLGregorianCalendar value) {
        this.dataFinalFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade horaFinalFaturamento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinalFaturamento() {
        return horaFinalFaturamento;
    }

    /**
     * Define o valor da propriedade horaFinalFaturamento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinalFaturamento(XMLGregorianCalendar value) {
        this.horaFinalFaturamento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoInternacao() {
        return tipoInternacao;
    }

    /**
     * Define o valor da propriedade tipoInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoInternacao(String value) {
        this.tipoInternacao = value;
    }

    /**
     * Obt�m o valor da propriedade regimeInternacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegimeInternacao() {
        return regimeInternacao;
    }

    /**
     * Define o valor da propriedade regimeInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegimeInternacao(String value) {
        this.regimeInternacao = value;
    }

    /**
     * Gets the value of the declaracoes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the declaracoes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDeclaracoes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtmInternacaoDados.Declaracoes }
     * 
     * 
     */
    public List<CtmInternacaoDados.Declaracoes> getDeclaracoes() {
        if (declaracoes == null) {
            declaracoes = new ArrayList<CtmInternacaoDados.Declaracoes>();
        }
        return this.declaracoes;
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
     *         &lt;element name="declaracaoNascido" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_declaracaoNascidoObito" minOccurs="0"/>
     *         &lt;element name="diagnosticoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
     *         &lt;element name="declaracaoObito" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_declaracaoNascidoObito" minOccurs="0"/>
     *         &lt;element name="indicadorDORN" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao" minOccurs="0"/>
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
        "declaracaoNascido",
        "diagnosticoObito",
        "declaracaoObito",
        "indicadorDORN"
    })
    public static class Declaracoes {

        protected String declaracaoNascido;
        protected String diagnosticoObito;
        protected String declaracaoObito;
        @XmlSchemaType(name = "string")
        protected DmSimNao indicadorDORN;

        /**
         * Obt�m o valor da propriedade declaracaoNascido.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclaracaoNascido() {
            return declaracaoNascido;
        }

        /**
         * Define o valor da propriedade declaracaoNascido.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclaracaoNascido(String value) {
            this.declaracaoNascido = value;
        }

        /**
         * Obt�m o valor da propriedade diagnosticoObito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiagnosticoObito() {
            return diagnosticoObito;
        }

        /**
         * Define o valor da propriedade diagnosticoObito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiagnosticoObito(String value) {
            this.diagnosticoObito = value;
        }

        /**
         * Obt�m o valor da propriedade declaracaoObito.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeclaracaoObito() {
            return declaracaoObito;
        }

        /**
         * Define o valor da propriedade declaracaoObito.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeclaracaoObito(String value) {
            this.declaracaoObito = value;
        }

        /**
         * Obt�m o valor da propriedade indicadorDORN.
         * 
         * @return
         *     possible object is
         *     {@link DmSimNao }
         *     
         */
        public DmSimNao getIndicadorDORN() {
            return indicadorDORN;
        }

        /**
         * Define o valor da propriedade indicadorDORN.
         * 
         * @param value
         *     allowed object is
         *     {@link DmSimNao }
         *     
         */
        public void setIndicadorDORN(DmSimNao value) {
            this.indicadorDORN = value;
        }

    }

}
