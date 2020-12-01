
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
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
 * <p>Classe Java de ct_procedimentoExecutadoInt complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutadoInt">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sequencialItem" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico4"/>
 *         &lt;element name="dataExecucao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="quantidadeExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="viaAcesso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_viaDeAcesso" minOccurs="0"/>
 *         &lt;element name="tecnicaUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tecnicaUtilizada" minOccurs="0"/>
 *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal3-2"/>
 *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="identEquipe" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="identificacaoEquipe" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identEquipe"/>
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
@XmlType(name = "ct_procedimentoExecutadoInt", propOrder = {
    "sequencialItem",
    "dataExecucao",
    "horaInicial",
    "horaFinal",
    "procedimento",
    "quantidadeExecutada",
    "viaAcesso",
    "tecnicaUtilizada",
    "reducaoAcrescimo",
    "valorUnitario",
    "valorTotal",
    "identEquipe"
})
public class CtProcedimentoExecutadoInt {

    @XmlElement(required = true)
    protected BigInteger sequencialItem;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExecucao;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaInicial;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaFinal;
    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    @XmlElement(required = true)
    protected BigInteger quantidadeExecutada;
    protected String viaAcesso;
    protected String tecnicaUtilizada;
    @XmlElement(required = true)
    protected BigDecimal reducaoAcrescimo;
    @XmlElement(required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    protected List<CtProcedimentoExecutadoInt.IdentEquipe> identEquipe;

    /**
     * Obt�m o valor da propriedade sequencialItem.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequencialItem() {
        return sequencialItem;
    }

    /**
     * Define o valor da propriedade sequencialItem.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequencialItem(BigInteger value) {
        this.sequencialItem = value;
    }

    /**
     * Obt�m o valor da propriedade dataExecucao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExecucao() {
        return dataExecucao;
    }

    /**
     * Define o valor da propriedade dataExecucao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExecucao(XMLGregorianCalendar value) {
        this.dataExecucao = value;
    }

    /**
     * Obt�m o valor da propriedade horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define o valor da propriedade horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicial(XMLGregorianCalendar value) {
        this.horaInicial = value;
    }

    /**
     * Obt�m o valor da propriedade horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define o valor da propriedade horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinal(XMLGregorianCalendar value) {
        this.horaFinal = value;
    }

    /**
     * Obt�m o valor da propriedade procedimento.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getProcedimento() {
        return procedimento;
    }

    /**
     * Define o valor da propriedade procedimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setProcedimento(CtProcedimentoDados value) {
        this.procedimento = value;
    }

    /**
     * Obt�m o valor da propriedade quantidadeExecutada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeExecutada() {
        return quantidadeExecutada;
    }

    /**
     * Define o valor da propriedade quantidadeExecutada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeExecutada(BigInteger value) {
        this.quantidadeExecutada = value;
    }

    /**
     * Obt�m o valor da propriedade viaAcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaAcesso() {
        return viaAcesso;
    }

    /**
     * Define o valor da propriedade viaAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaAcesso(String value) {
        this.viaAcesso = value;
    }

    /**
     * Obt�m o valor da propriedade tecnicaUtilizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnicaUtilizada() {
        return tecnicaUtilizada;
    }

    /**
     * Define o valor da propriedade tecnicaUtilizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnicaUtilizada(String value) {
        this.tecnicaUtilizada = value;
    }

    /**
     * Obt�m o valor da propriedade reducaoAcrescimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducaoAcrescimo() {
        return reducaoAcrescimo;
    }

    /**
     * Define o valor da propriedade reducaoAcrescimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducaoAcrescimo(BigDecimal value) {
        this.reducaoAcrescimo = value;
    }

    /**
     * Obt�m o valor da propriedade valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Obt�m o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the identEquipe property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the identEquipe property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIdentEquipe().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtProcedimentoExecutadoInt.IdentEquipe }
     * 
     * 
     */
    public List<CtProcedimentoExecutadoInt.IdentEquipe> getIdentEquipe() {
        if (identEquipe == null) {
            identEquipe = new ArrayList<CtProcedimentoExecutadoInt.IdentEquipe>();
        }
        return this.identEquipe;
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
     *         &lt;element name="identificacaoEquipe" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_identEquipe"/>
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
        "identificacaoEquipe"
    })
    public static class IdentEquipe {

        @XmlElement(required = true)
        protected CtIdentEquipe identificacaoEquipe;

        /**
         * Obt�m o valor da propriedade identificacaoEquipe.
         * 
         * @return
         *     possible object is
         *     {@link CtIdentEquipe }
         *     
         */
        public CtIdentEquipe getIdentificacaoEquipe() {
            return identificacaoEquipe;
        }

        /**
         * Define o valor da propriedade identificacaoEquipe.
         * 
         * @param value
         *     allowed object is
         *     {@link CtIdentEquipe }
         *     
         */
        public void setIdentificacaoEquipe(CtIdentEquipe value) {
            this.identificacaoEquipe = value;
        }

    }

}
