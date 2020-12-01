
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_consultaAtendimento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_consultaAtendimento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="tipoConsulta" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoConsulta"/>
 *         &lt;element name="procedimento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
 *                   &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
 *                   &lt;element name="valorProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
@XmlType(name = "ctm_consultaAtendimento", propOrder = {
    "dataAtendimento",
    "tipoConsulta",
    "procedimento"
})
public class CtmConsultaAtendimento {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataAtendimento;
    @XmlElement(required = true)
    protected String tipoConsulta;
    @XmlElement(required = true)
    protected CtmConsultaAtendimento.Procedimento procedimento;

    /**
     * Obt�m o valor da propriedade dataAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataAtendimento() {
        return dataAtendimento;
    }

    /**
     * Define o valor da propriedade dataAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataAtendimento(XMLGregorianCalendar value) {
        this.dataAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade tipoConsulta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoConsulta() {
        return tipoConsulta;
    }

    /**
     * Define o valor da propriedade tipoConsulta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoConsulta(String value) {
        this.tipoConsulta = value;
    }

    /**
     * Obt�m o valor da propriedade procedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtmConsultaAtendimento.Procedimento }
     *     
     */
    public CtmConsultaAtendimento.Procedimento getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmConsultaAtendimento.Procedimento }
     *     
     */
    public void setProcedimento(CtmConsultaAtendimento.Procedimento value) {
        this.procedimento = value;
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
     *         &lt;element name="codigoTabela" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tabela"/>
     *         &lt;element name="codigoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto10"/>
     *         &lt;element name="valorProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
        "codigoTabela",
        "codigoProcedimento",
        "valorProcedimento"
    })
    public static class Procedimento {

        @XmlElement(required = true)
        protected String codigoTabela;
        @XmlElement(required = true)
        protected String codigoProcedimento;
        @XmlElement(required = true)
        protected BigDecimal valorProcedimento;

        /**
         * Obt�m o valor da propriedade codigoTabela.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoTabela() {
            return codigoTabela;
        }

        /**
         * Define o valor da propriedade codigoTabela.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoTabela(String value) {
            this.codigoTabela = value;
        }

        /**
         * Obt�m o valor da propriedade codigoProcedimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoProcedimento() {
            return codigoProcedimento;
        }

        /**
         * Define o valor da propriedade codigoProcedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoProcedimento(String value) {
            this.codigoProcedimento = value;
        }

        /**
         * Obt�m o valor da propriedade valorProcedimento.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorProcedimento() {
            return valorProcedimento;
        }

        /**
         * Define o valor da propriedade valorProcedimento.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorProcedimento(BigDecimal value) {
            this.valorProcedimento = value;
        }

    }

}
