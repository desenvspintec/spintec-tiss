
package br.gov.ans.padroes.tiss.schemas;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_beneficiarioComunicacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_beneficiarioComunicacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dataEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoEvento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoEvento"/>
 *         &lt;element name="dadosInternacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaida"/>
 *                   &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
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
@XmlType(name = "ctm_beneficiarioComunicacao", propOrder = {
    "dadosBeneficiario",
    "dataEvento",
    "tipoEvento",
    "dadosInternacao"
})
public class CtmBeneficiarioComunicacao {

    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataEvento;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected DmTipoEvento tipoEvento;
    @XmlElement(required = true)
    protected CtmBeneficiarioComunicacao.DadosInternacao dadosInternacao;

    /**
     * Obt�m o valor da propriedade dadosBeneficiario.
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
     * Obt�m o valor da propriedade dataEvento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataEvento() {
        return dataEvento;
    }

    /**
     * Define o valor da propriedade dataEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataEvento(XMLGregorianCalendar value) {
        this.dataEvento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoEvento.
     * 
     * @return
     *     possible object is
     *     {@link DmTipoEvento }
     *     
     */
    public DmTipoEvento getTipoEvento() {
        return tipoEvento;
    }

    /**
     * Define o valor da propriedade tipoEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link DmTipoEvento }
     *     
     */
    public void setTipoEvento(DmTipoEvento value) {
        this.tipoEvento = value;
    }

    /**
     * Obt�m o valor da propriedade dadosInternacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmBeneficiarioComunicacao.DadosInternacao }
     *     
     */
    public CtmBeneficiarioComunicacao.DadosInternacao getDadosInternacao() {
        return dadosInternacao;
    }

    /**
     * Define o valor da propriedade dadosInternacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmBeneficiarioComunicacao.DadosInternacao }
     *     
     */
    public void setDadosInternacao(CtmBeneficiarioComunicacao.DadosInternacao value) {
        this.dadosInternacao = value;
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
     *         &lt;element name="motivoEncerramento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_motivoSaida"/>
     *         &lt;element name="tipoInternacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoInternacao"/>
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
        "motivoEncerramento",
        "tipoInternacao"
    })
    public static class DadosInternacao {

        protected String motivoEncerramento;
        protected String tipoInternacao;

        /**
         * Obt�m o valor da propriedade motivoEncerramento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMotivoEncerramento() {
            return motivoEncerramento;
        }

        /**
         * Define o valor da propriedade motivoEncerramento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMotivoEncerramento(String value) {
            this.motivoEncerramento = value;
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

    }

}
