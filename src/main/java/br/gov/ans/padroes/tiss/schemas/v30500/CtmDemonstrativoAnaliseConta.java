
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_demonstrativoAnaliseConta complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_demonstrativoAnaliseConta">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoCabecalho"/>
 *         &lt;element name="dadosPrestador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosConta">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosProtocolo" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contaMedicaResumo">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="valorInformadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorProcessadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorLiberadoGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorGlosaGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_demonstrativoAnaliseConta", propOrder = {
    "cabecalhoDemonstrativo",
    "dadosPrestador",
    "dadosConta",
    "valorInformadoGeral",
    "valorProcessadoGeral",
    "valorLiberadoGeral",
    "valorGlosaGeral"
})
public class CtmDemonstrativoAnaliseConta {

    @XmlElement(required = true)
    protected CtDemonstrativoCabecalho cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtmDemonstrativoAnaliseConta.DadosPrestador dadosPrestador;
    @XmlElement(required = true)
    protected CtmDemonstrativoAnaliseConta.DadosConta dadosConta;
    @XmlElement(required = true)
    protected BigDecimal valorInformadoGeral;
    @XmlElement(required = true)
    protected BigDecimal valorProcessadoGeral;
    @XmlElement(required = true)
    protected BigDecimal valorLiberadoGeral;
    protected BigDecimal valorGlosaGeral;

    /**
     * Obt�m o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtDemonstrativoCabecalho }
     *     
     */
    public CtDemonstrativoCabecalho getCabecalhoDemonstrativo() {
        return cabecalhoDemonstrativo;
    }

    /**
     * Define o valor da propriedade cabecalhoDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtDemonstrativoCabecalho }
     *     
     */
    public void setCabecalhoDemonstrativo(CtDemonstrativoCabecalho value) {
        this.cabecalhoDemonstrativo = value;
    }

    /**
     * Obt�m o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoAnaliseConta.DadosPrestador }
     *     
     */
    public CtmDemonstrativoAnaliseConta.DadosPrestador getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoAnaliseConta.DadosPrestador }
     *     
     */
    public void setDadosPrestador(CtmDemonstrativoAnaliseConta.DadosPrestador value) {
        this.dadosPrestador = value;
    }

    /**
     * Obt�m o valor da propriedade dadosConta.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoAnaliseConta.DadosConta }
     *     
     */
    public CtmDemonstrativoAnaliseConta.DadosConta getDadosConta() {
        return dadosConta;
    }

    /**
     * Define o valor da propriedade dadosConta.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoAnaliseConta.DadosConta }
     *     
     */
    public void setDadosConta(CtmDemonstrativoAnaliseConta.DadosConta value) {
        this.dadosConta = value;
    }

    /**
     * Obt�m o valor da propriedade valorInformadoGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorInformadoGeral() {
        return valorInformadoGeral;
    }

    /**
     * Define o valor da propriedade valorInformadoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorInformadoGeral(BigDecimal value) {
        this.valorInformadoGeral = value;
    }

    /**
     * Obt�m o valor da propriedade valorProcessadoGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcessadoGeral() {
        return valorProcessadoGeral;
    }

    /**
     * Define o valor da propriedade valorProcessadoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcessadoGeral(BigDecimal value) {
        this.valorProcessadoGeral = value;
    }

    /**
     * Obt�m o valor da propriedade valorLiberadoGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorLiberadoGeral() {
        return valorLiberadoGeral;
    }

    /**
     * Define o valor da propriedade valorLiberadoGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorLiberadoGeral(BigDecimal value) {
        this.valorLiberadoGeral = value;
    }

    /**
     * Obt�m o valor da propriedade valorGlosaGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGlosaGeral() {
        return valorGlosaGeral;
    }

    /**
     * Define o valor da propriedade valorGlosaGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGlosaGeral(BigDecimal value) {
        this.valorGlosaGeral = value;
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
     *         &lt;element name="dadosProtocolo" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contaMedicaResumo">
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
        "dadosProtocolo"
    })
    public static class DadosConta {

        @XmlElement(required = true)
        protected List<CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo> dadosProtocolo;

        /**
         * Gets the value of the dadosProtocolo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the dadosProtocolo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDadosProtocolo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo }
         * 
         * 
         */
        public List<CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo> getDadosProtocolo() {
            if (dadosProtocolo == null) {
                dadosProtocolo = new ArrayList<CtmDemonstrativoAnaliseConta.DadosConta.DadosProtocolo>();
            }
            return this.dadosProtocolo;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         * 
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contaMedicaResumo">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DadosProtocolo
            extends CtContaMedicaResumo
        {


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
     *         &lt;element name="dadosContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "dadosContratado",
        "cnes"
    })
    public static class DadosPrestador {

        @XmlElement(required = true)
        protected CtContratadoDados dadosContratado;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Obt�m o valor da propriedade dadosContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosContratado() {
            return dadosContratado;
        }

        /**
         * Define o valor da propriedade dadosContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosContratado(CtContratadoDados value) {
            this.dadosContratado = value;
        }

        /**
         * Obt�m o valor da propriedade cnes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNES() {
            return cnes;
        }

        /**
         * Define o valor da propriedade cnes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNES(String value) {
            this.cnes = value;
        }

    }

}
