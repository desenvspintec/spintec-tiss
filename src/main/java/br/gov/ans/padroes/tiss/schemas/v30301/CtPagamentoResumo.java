
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_pagamentoResumo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_pagamentoResumo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroFatura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12" minOccurs="0"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="valorTotalLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_valorTotal"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_pagamentoResumo", propOrder = {
    "numeroFatura",
    "numeroLote",
    "numeroProtocolo",
    "valorTotalLote"
})
public class CtPagamentoResumo {

    protected String numeroFatura;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected CtValorTotal valorTotalLote;

    /**
     * Obtém o valor da propriedade numeroFatura.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroFatura() {
        return numeroFatura;
    }

    /**
     * Define o valor da propriedade numeroFatura.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroFatura(String value) {
        this.numeroFatura = value;
    }

    /**
     * Obtém o valor da propriedade numeroLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroLote() {
        return numeroLote;
    }

    /**
     * Define o valor da propriedade numeroLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroLote(String value) {
        this.numeroLote = value;
    }

    /**
     * Obtém o valor da propriedade numeroProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumeroProtocolo() {
        return numeroProtocolo;
    }

    /**
     * Define o valor da propriedade numeroProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumeroProtocolo(String value) {
        this.numeroProtocolo = value;
    }

    /**
     * Obtém o valor da propriedade valorTotalLote.
     * 
     * @return
     *     possible object is
     *     {@link CtValorTotal }
     *     
     */
    public CtValorTotal getValorTotalLote() {
        return valorTotalLote;
    }

    /**
     * Define o valor da propriedade valorTotalLote.
     * 
     * @param value
     *     allowed object is
     *     {@link CtValorTotal }
     *     
     */
    public void setValorTotalLote(CtValorTotal value) {
        this.valorTotalLote = value;
    }

}
