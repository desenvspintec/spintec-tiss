
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_procedimentoExecutado complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutado">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataExecucao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="unidadeMedida" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_unidadeMedida" minOccurs="0"/>
 *         &lt;element name="quantidadeExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-4"/>
 *         &lt;element name="viaAcesso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_viaDeAcesso" minOccurs="0"/>
 *         &lt;element name="tecnicaUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tecnicaUtilizada" minOccurs="0"/>
 *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="codigoDespesa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_outrasDespesas" minOccurs="0"/>
 *         &lt;element name="fatorReducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal3-2" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_procedimentoExecutado", propOrder = {
    "dataExecucao",
    "horaInicial",
    "horaFinal",
    "procedimento",
    "unidadeMedida",
    "quantidadeExecutada",
    "viaAcesso",
    "tecnicaUtilizada",
    "valorUnitario",
    "valorTotal",
    "codigoDespesa",
    "fatorReducaoAcrescimo"
})
@XmlSeeAlso({
    CtGuiaDados.ProcedimentosRealizados.ProcedimentoRealizado.class
})
public class CtProcedimentoExecutado {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExecucao;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaInicial;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaFinal;
    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    protected String unidadeMedida;
    @XmlElement(required = true)
    protected BigDecimal quantidadeExecutada;
    protected String viaAcesso;
    protected String tecnicaUtilizada;
    @XmlElement(required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    protected String codigoDespesa;
    protected BigDecimal fatorReducaoAcrescimo;

    /**
     * Obtém o valor da propriedade dataExecucao.
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
     * Obtém o valor da propriedade horaInicial.
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
     * Obtém o valor da propriedade horaFinal.
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
     * Obtém o valor da propriedade procedimento.
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
     * Obtém o valor da propriedade unidadeMedida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    /**
     * Define o valor da propriedade unidadeMedida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnidadeMedida(String value) {
        this.unidadeMedida = value;
    }

    /**
     * Obtém o valor da propriedade quantidadeExecutada.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQuantidadeExecutada() {
        return quantidadeExecutada;
    }

    /**
     * Define o valor da propriedade quantidadeExecutada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQuantidadeExecutada(BigDecimal value) {
        this.quantidadeExecutada = value;
    }

    /**
     * Obtém o valor da propriedade viaAcesso.
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
     * Obtém o valor da propriedade tecnicaUtilizada.
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
     * Obtém o valor da propriedade valorUnitario.
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
     * Obtém o valor da propriedade valorTotal.
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
     * Obtém o valor da propriedade codigoDespesa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoDespesa() {
        return codigoDespesa;
    }

    /**
     * Define o valor da propriedade codigoDespesa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoDespesa(String value) {
        this.codigoDespesa = value;
    }

    /**
     * Obtém o valor da propriedade fatorReducaoAcrescimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getFatorReducaoAcrescimo() {
        return fatorReducaoAcrescimo;
    }

    /**
     * Define o valor da propriedade fatorReducaoAcrescimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setFatorReducaoAcrescimo(BigDecimal value) {
        this.fatorReducaoAcrescimo = value;
    }

}
