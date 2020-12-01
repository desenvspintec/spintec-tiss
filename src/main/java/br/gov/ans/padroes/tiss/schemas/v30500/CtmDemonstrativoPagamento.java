
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_demonstrativoPagamento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_demonstrativoPagamento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_demonstrativoCabecalho"/>
 *         &lt;element name="dadosContratado">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="pagamentos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="pagamentosPorData" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
 *                             &lt;element name="dadosResumo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisBrutosPorData">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="debitosCreditosPorData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisLiquidosPorData">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totaisDemonstrativo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="totaisBrutosDemonstrativo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="debitosCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="totaisLiquidosDemonstrativo">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
@XmlType(name = "ctm_demonstrativoPagamento", propOrder = {
    "cabecalhoDemonstrativo",
    "dadosContratado",
    "pagamentos",
    "totaisDemonstrativo",
    "observacao"
})
public class CtmDemonstrativoPagamento {

    @XmlElement(required = true)
    protected CtDemonstrativoCabecalho cabecalhoDemonstrativo;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.DadosContratado dadosContratado;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.Pagamentos pagamentos;
    @XmlElement(required = true)
    protected CtmDemonstrativoPagamento.TotaisDemonstrativo totaisDemonstrativo;
    protected String observacao;

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
     * Obt�m o valor da propriedade dadosContratado.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.DadosContratado }
     *     
     */
    public CtmDemonstrativoPagamento.DadosContratado getDadosContratado() {
        return dadosContratado;
    }

    /**
     * Define o valor da propriedade dadosContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.DadosContratado }
     *     
     */
    public void setDadosContratado(CtmDemonstrativoPagamento.DadosContratado value) {
        this.dadosContratado = value;
    }

    /**
     * Obt�m o valor da propriedade pagamentos.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.Pagamentos }
     *     
     */
    public CtmDemonstrativoPagamento.Pagamentos getPagamentos() {
        return pagamentos;
    }

    /**
     * Define o valor da propriedade pagamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.Pagamentos }
     *     
     */
    public void setPagamentos(CtmDemonstrativoPagamento.Pagamentos value) {
        this.pagamentos = value;
    }

    /**
     * Obt�m o valor da propriedade totaisDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo }
     *     
     */
    public CtmDemonstrativoPagamento.TotaisDemonstrativo getTotaisDemonstrativo() {
        return totaisDemonstrativo;
    }

    /**
     * Define o valor da propriedade totaisDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo }
     *     
     */
    public void setTotaisDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo value) {
        this.totaisDemonstrativo = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
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
     *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
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
        "dadosPrestador",
        "cnes"
    })
    public static class DadosContratado {

        @XmlElement(required = true)
        protected CtContratadoDados dadosPrestador;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Obt�m o valor da propriedade dadosPrestador.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getDadosPrestador() {
            return dadosPrestador;
        }

        /**
         * Define o valor da propriedade dadosPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setDadosPrestador(CtContratadoDados value) {
            this.dadosPrestador = value;
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
     *         &lt;element name="pagamentosPorData" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
     *                   &lt;element name="dadosResumo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisBrutosPorData">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="debitosCreditosPorData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisLiquidosPorData">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "pagamentosPorData"
    })
    public static class Pagamentos {

        @XmlElement(required = true)
        protected List<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData> pagamentosPorData;

        /**
         * Gets the value of the pagamentosPorData property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the pagamentosPorData property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPagamentosPorData().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData }
         * 
         * 
         */
        public List<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData> getPagamentosPorData() {
            if (pagamentosPorData == null) {
                pagamentosPorData = new ArrayList<CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData>();
            }
            return this.pagamentosPorData;
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
         *         &lt;element name="dadosPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_pagamentoDados"/>
         *         &lt;element name="dadosResumo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisBrutosPorData">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="debitosCreditosPorData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisLiquidosPorData">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "dadosPagamento",
            "dadosResumo",
            "totaisBrutosPorData",
            "debitosCreditosPorData",
            "totaisLiquidosPorData"
        })
        public static class PagamentosPorData {

            @XmlElement(required = true)
            protected CtPagamentoDados dadosPagamento;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo dadosResumo;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData totaisBrutosPorData;
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData debitosCreditosPorData;
            @XmlElement(required = true)
            protected CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData totaisLiquidosPorData;

            /**
             * Obt�m o valor da propriedade dadosPagamento.
             * 
             * @return
             *     possible object is
             *     {@link CtPagamentoDados }
             *     
             */
            public CtPagamentoDados getDadosPagamento() {
                return dadosPagamento;
            }

            /**
             * Define o valor da propriedade dadosPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link CtPagamentoDados }
             *     
             */
            public void setDadosPagamento(CtPagamentoDados value) {
                this.dadosPagamento = value;
            }

            /**
             * Obt�m o valor da propriedade dadosResumo.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo getDadosResumo() {
                return dadosResumo;
            }

            /**
             * Define o valor da propriedade dadosResumo.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo }
             *     
             */
            public void setDadosResumo(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DadosResumo value) {
                this.dadosResumo = value;
            }

            /**
             * Obt�m o valor da propriedade totaisBrutosPorData.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData getTotaisBrutosPorData() {
                return totaisBrutosPorData;
            }

            /**
             * Define o valor da propriedade totaisBrutosPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData }
             *     
             */
            public void setTotaisBrutosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisBrutosPorData value) {
                this.totaisBrutosPorData = value;
            }

            /**
             * Obt�m o valor da propriedade debitosCreditosPorData.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData getDebitosCreditosPorData() {
                return debitosCreditosPorData;
            }

            /**
             * Define o valor da propriedade debitosCreditosPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData }
             *     
             */
            public void setDebitosCreditosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.DebitosCreditosPorData value) {
                this.debitosCreditosPorData = value;
            }

            /**
             * Obt�m o valor da propriedade totaisLiquidosPorData.
             * 
             * @return
             *     possible object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData }
             *     
             */
            public CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData getTotaisLiquidosPorData() {
                return totaisLiquidosPorData;
            }

            /**
             * Define o valor da propriedade totaisLiquidosPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData }
             *     
             */
            public void setTotaisLiquidosPorData(CtmDemonstrativoPagamento.Pagamentos.PagamentosPorData.TotaisLiquidosPorData value) {
                this.totaisLiquidosPorData = value;
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
             *         &lt;element name="relacaoProtocolos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_dadosResumoDemonstrativo" maxOccurs="unbounded"/>
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
                "relacaoProtocolos"
            })
            public static class DadosResumo {

                @XmlElement(required = true)
                protected List<CtDadosResumoDemonstrativo> relacaoProtocolos;

                /**
                 * Gets the value of the relacaoProtocolos property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the relacaoProtocolos property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getRelacaoProtocolos().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtDadosResumoDemonstrativo }
                 * 
                 * 
                 */
                public List<CtDadosResumoDemonstrativo> getRelacaoProtocolos() {
                    if (relacaoProtocolos == null) {
                        relacaoProtocolos = new ArrayList<CtDadosResumoDemonstrativo>();
                    }
                    return this.relacaoProtocolos;
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
             *         &lt;element name="debitosCreditos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
                "debitosCreditos"
            })
            public static class DebitosCreditosPorData {

                @XmlElement(required = true)
                protected List<CtDescontos> debitosCreditos;

                /**
                 * Gets the value of the debitosCreditos property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the debitosCreditos property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDebitosCreditos().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtDescontos }
                 * 
                 * 
                 */
                public List<CtDescontos> getDebitosCreditos() {
                    if (debitosCreditos == null) {
                        debitosCreditos = new ArrayList<CtDescontos>();
                    }
                    return this.debitosCreditos;
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
             *         &lt;element name="totalInformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totaLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "totalInformadoPorData",
                "totalProcessadoPorData",
                "totaLiberadoPorData",
                "totalGlosaPorData"
            })
            public static class TotaisBrutosPorData {

                @XmlElement(required = true)
                protected BigDecimal totalInformadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totalProcessadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totaLiberadoPorData;
                @XmlElement(required = true)
                protected BigDecimal totalGlosaPorData;

                /**
                 * Obt�m o valor da propriedade totalInformadoPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalInformadoPorData() {
                    return totalInformadoPorData;
                }

                /**
                 * Define o valor da propriedade totalInformadoPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalInformadoPorData(BigDecimal value) {
                    this.totalInformadoPorData = value;
                }

                /**
                 * Obt�m o valor da propriedade totalProcessadoPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalProcessadoPorData() {
                    return totalProcessadoPorData;
                }

                /**
                 * Define o valor da propriedade totalProcessadoPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalProcessadoPorData(BigDecimal value) {
                    this.totalProcessadoPorData = value;
                }

                /**
                 * Obt�m o valor da propriedade totaLiberadoPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotaLiberadoPorData() {
                    return totaLiberadoPorData;
                }

                /**
                 * Define o valor da propriedade totaLiberadoPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotaLiberadoPorData(BigDecimal value) {
                    this.totaLiberadoPorData = value;
                }

                /**
                 * Obt�m o valor da propriedade totalGlosaPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalGlosaPorData() {
                    return totalGlosaPorData;
                }

                /**
                 * Define o valor da propriedade totalGlosaPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalGlosaPorData(BigDecimal value) {
                    this.totalGlosaPorData = value;
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
             *         &lt;element name="totalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="totalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="liquidoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "totalDebitosPorData",
                "totalCreditosPorData",
                "liquidoPorData"
            })
            public static class TotaisLiquidosPorData {

                @XmlElement(required = true)
                protected BigDecimal totalDebitosPorData;
                @XmlElement(required = true)
                protected BigDecimal totalCreditosPorData;
                @XmlElement(required = true)
                protected BigDecimal liquidoPorData;

                /**
                 * Obt�m o valor da propriedade totalDebitosPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalDebitosPorData() {
                    return totalDebitosPorData;
                }

                /**
                 * Define o valor da propriedade totalDebitosPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalDebitosPorData(BigDecimal value) {
                    this.totalDebitosPorData = value;
                }

                /**
                 * Obt�m o valor da propriedade totalCreditosPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getTotalCreditosPorData() {
                    return totalCreditosPorData;
                }

                /**
                 * Define o valor da propriedade totalCreditosPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setTotalCreditosPorData(BigDecimal value) {
                    this.totalCreditosPorData = value;
                }

                /**
                 * Obt�m o valor da propriedade liquidoPorData.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getLiquidoPorData() {
                    return liquidoPorData;
                }

                /**
                 * Define o valor da propriedade liquidoPorData.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setLiquidoPorData(BigDecimal value) {
                    this.liquidoPorData = value;
                }

            }

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
     *         &lt;element name="totaisBrutosDemonstrativo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="debitosCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="totaisLiquidosDemonstrativo">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "totaisBrutosDemonstrativo",
        "debitosCreditosDemonstrativo",
        "totaisLiquidosDemonstrativo"
    })
    public static class TotaisDemonstrativo {

        @XmlElement(required = true)
        protected CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo totaisBrutosDemonstrativo;
        protected List<CtDescontos> debitosCreditosDemonstrativo;
        @XmlElement(required = true)
        protected CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo totaisLiquidosDemonstrativo;

        /**
         * Obt�m o valor da propriedade totaisBrutosDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo }
         *     
         */
        public CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo getTotaisBrutosDemonstrativo() {
            return totaisBrutosDemonstrativo;
        }

        /**
         * Define o valor da propriedade totaisBrutosDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo }
         *     
         */
        public void setTotaisBrutosDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisBrutosDemonstrativo value) {
            this.totaisBrutosDemonstrativo = value;
        }

        /**
         * Gets the value of the debitosCreditosDemonstrativo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the debitosCreditosDemonstrativo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDebitosCreditosDemonstrativo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontos }
         * 
         * 
         */
        public List<CtDescontos> getDebitosCreditosDemonstrativo() {
            if (debitosCreditosDemonstrativo == null) {
                debitosCreditosDemonstrativo = new ArrayList<CtDescontos>();
            }
            return this.debitosCreditosDemonstrativo;
        }

        /**
         * Obt�m o valor da propriedade totaisLiquidosDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo }
         *     
         */
        public CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo getTotaisLiquidosDemonstrativo() {
            return totaisLiquidosDemonstrativo;
        }

        /**
         * Define o valor da propriedade totaisLiquidosDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo }
         *     
         */
        public void setTotaisLiquidosDemonstrativo(CtmDemonstrativoPagamento.TotaisDemonstrativo.TotaisLiquidosDemonstrativo value) {
            this.totaisLiquidosDemonstrativo = value;
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
         *         &lt;element name="valorInformadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorProcessadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorLiberadoBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorGlosaBruto" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorInformadoBruto",
            "valorProcessadoBruto",
            "valorLiberadoBruto",
            "valorGlosaBruto"
        })
        public static class TotaisBrutosDemonstrativo {

            @XmlElement(required = true)
            protected BigDecimal valorInformadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorProcessadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorLiberadoBruto;
            @XmlElement(required = true)
            protected BigDecimal valorGlosaBruto;

            /**
             * Obt�m o valor da propriedade valorInformadoBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorInformadoBruto() {
                return valorInformadoBruto;
            }

            /**
             * Define o valor da propriedade valorInformadoBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorInformadoBruto(BigDecimal value) {
                this.valorInformadoBruto = value;
            }

            /**
             * Obt�m o valor da propriedade valorProcessadoBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorProcessadoBruto() {
                return valorProcessadoBruto;
            }

            /**
             * Define o valor da propriedade valorProcessadoBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorProcessadoBruto(BigDecimal value) {
                this.valorProcessadoBruto = value;
            }

            /**
             * Obt�m o valor da propriedade valorLiberadoBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorLiberadoBruto() {
                return valorLiberadoBruto;
            }

            /**
             * Define o valor da propriedade valorLiberadoBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorLiberadoBruto(BigDecimal value) {
                this.valorLiberadoBruto = value;
            }

            /**
             * Obt�m o valor da propriedade valorGlosaBruto.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorGlosaBruto() {
                return valorGlosaBruto;
            }

            /**
             * Define o valor da propriedade valorGlosaBruto.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorGlosaBruto(BigDecimal value) {
                this.valorGlosaBruto = value;
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
         *         &lt;element name="totalDebitosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="totalCreditosdemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorLiberadoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "totalDebitosDemonstrativo",
            "totalCreditosdemonstrativo",
            "valorLiberadoDemonstrativo"
        })
        public static class TotaisLiquidosDemonstrativo {

            @XmlElement(required = true)
            protected BigDecimal totalDebitosDemonstrativo;
            @XmlElement(required = true)
            protected BigDecimal totalCreditosdemonstrativo;
            @XmlElement(required = true)
            protected BigDecimal valorLiberadoDemonstrativo;

            /**
             * Obt�m o valor da propriedade totalDebitosDemonstrativo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalDebitosDemonstrativo() {
                return totalDebitosDemonstrativo;
            }

            /**
             * Define o valor da propriedade totalDebitosDemonstrativo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalDebitosDemonstrativo(BigDecimal value) {
                this.totalDebitosDemonstrativo = value;
            }

            /**
             * Obt�m o valor da propriedade totalCreditosdemonstrativo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getTotalCreditosdemonstrativo() {
                return totalCreditosdemonstrativo;
            }

            /**
             * Define o valor da propriedade totalCreditosdemonstrativo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setTotalCreditosdemonstrativo(BigDecimal value) {
                this.totalCreditosdemonstrativo = value;
            }

            /**
             * Obt�m o valor da propriedade valorLiberadoDemonstrativo.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorLiberadoDemonstrativo() {
                return valorLiberadoDemonstrativo;
            }

            /**
             * Define o valor da propriedade valorLiberadoDemonstrativo.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorLiberadoDemonstrativo(BigDecimal value) {
                this.valorLiberadoDemonstrativo = value;
            }

        }

    }

}
