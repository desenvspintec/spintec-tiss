
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_descontos complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_descontos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="indicador" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_debitoCreditoIndicador"/>
 *         &lt;element name="tipoDebitoCredito" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_debitoCreditoTipo"/>
 *         &lt;element name="descricaoDbCr" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto40"/>
 *         &lt;element name="valorDbCr" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_descontos", propOrder = {
    "indicador",
    "tipoDebitoCredito",
    "descricaoDbCr",
    "valorDbCr"
})
public class CtDescontos {

    @XmlElement(required = true)
    protected String indicador;
    @XmlElement(required = true)
    protected String tipoDebitoCredito;
    @XmlElement(required = true)
    protected String descricaoDbCr;
    @XmlElement(required = true)
    protected BigDecimal valorDbCr;

    /**
     * Obt�m o valor da propriedade indicador.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndicador() {
        return indicador;
    }

    /**
     * Define o valor da propriedade indicador.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndicador(String value) {
        this.indicador = value;
    }

    /**
     * Obt�m o valor da propriedade tipoDebitoCredito.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipoDebitoCredito() {
        return tipoDebitoCredito;
    }

    /**
     * Define o valor da propriedade tipoDebitoCredito.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipoDebitoCredito(String value) {
        this.tipoDebitoCredito = value;
    }

    /**
     * Obt�m o valor da propriedade descricaoDbCr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescricaoDbCr() {
        return descricaoDbCr;
    }

    /**
     * Define o valor da propriedade descricaoDbCr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescricaoDbCr(String value) {
        this.descricaoDbCr = value;
    }

    /**
     * Obt�m o valor da propriedade valorDbCr.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDbCr() {
        return valorDbCr;
    }

    /**
     * Define o valor da propriedade valorDbCr.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDbCr(BigDecimal value) {
        this.valorDbCr = value;
    }

}
