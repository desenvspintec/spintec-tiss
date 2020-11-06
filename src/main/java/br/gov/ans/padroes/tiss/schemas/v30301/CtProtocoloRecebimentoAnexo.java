
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_protocoloRecebimentoAnexo complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_protocoloRecebimentoAnexo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="identificacaoOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_fontePagadora"/>
 *         &lt;element name="dadosPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="dataEnvioLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *         &lt;element name="detalheProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_protocoloDetalheAnexo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_protocoloRecebimentoAnexo", propOrder = {
    "numeroProtocolo",
    "identificacaoOperadora",
    "dadosPrestador",
    "numeroLote",
    "dataEnvioLote",
    "detalheProtocolo"
})
public class CtProtocoloRecebimentoAnexo {

    @XmlElement(required = true)
    protected String numeroProtocolo;
    @XmlElement(required = true)
    protected CtFontePagadora identificacaoOperadora;
    @XmlElement(required = true)
    protected CtContratadoDados dadosPrestador;
    @XmlElement(required = true)
    protected String numeroLote;
    @XmlElement(required = true)
    protected String dataEnvioLote;
    @XmlElement(required = true)
    protected CtProtocoloDetalheAnexo detalheProtocolo;

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
     * Obtém o valor da propriedade identificacaoOperadora.
     * 
     * @return
     *     possible object is
     *     {@link CtFontePagadora }
     *     
     */
    public CtFontePagadora getIdentificacaoOperadora() {
        return identificacaoOperadora;
    }

    /**
     * Define o valor da propriedade identificacaoOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link CtFontePagadora }
     *     
     */
    public void setIdentificacaoOperadora(CtFontePagadora value) {
        this.identificacaoOperadora = value;
    }

    /**
     * Obtém o valor da propriedade dadosPrestador.
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
     * Obtém o valor da propriedade dataEnvioLote.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataEnvioLote() {
        return dataEnvioLote;
    }

    /**
     * Define o valor da propriedade dataEnvioLote.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataEnvioLote(String value) {
        this.dataEnvioLote = value;
    }

    /**
     * Obtém o valor da propriedade detalheProtocolo.
     * 
     * @return
     *     possible object is
     *     {@link CtProtocoloDetalheAnexo }
     *     
     */
    public CtProtocoloDetalheAnexo getDetalheProtocolo() {
        return detalheProtocolo;
    }

    /**
     * Define o valor da propriedade detalheProtocolo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProtocoloDetalheAnexo }
     *     
     */
    public void setDetalheProtocolo(CtProtocoloDetalheAnexo value) {
        this.detalheProtocolo = value;
    }

}
