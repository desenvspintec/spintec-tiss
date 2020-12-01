
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_guiaValorTotal complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_guiaValorTotal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="valorProcedimentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorDiarias" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorTaxasAlugueis" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorMateriais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorMedicamentos" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorGasesMedicinais" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2" minOccurs="0"/>
 *         &lt;element name="valorTotalGeral" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_guiaValorTotal", propOrder = {
    "valorProcedimentos",
    "valorDiarias",
    "valorTaxasAlugueis",
    "valorMateriais",
    "valorMedicamentos",
    "valorOPME",
    "valorGasesMedicinais",
    "valorTotalGeral"
})
public class CtGuiaValorTotal {

    protected BigDecimal valorProcedimentos;
    protected BigDecimal valorDiarias;
    protected BigDecimal valorTaxasAlugueis;
    protected BigDecimal valorMateriais;
    protected BigDecimal valorMedicamentos;
    protected BigDecimal valorOPME;
    protected BigDecimal valorGasesMedicinais;
    @XmlElement(required = true)
    protected BigDecimal valorTotalGeral;

    /**
     * Obt�m o valor da propriedade valorProcedimentos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorProcedimentos() {
        return valorProcedimentos;
    }

    /**
     * Define o valor da propriedade valorProcedimentos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorProcedimentos(BigDecimal value) {
        this.valorProcedimentos = value;
    }

    /**
     * Obt�m o valor da propriedade valorDiarias.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorDiarias() {
        return valorDiarias;
    }

    /**
     * Define o valor da propriedade valorDiarias.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorDiarias(BigDecimal value) {
        this.valorDiarias = value;
    }

    /**
     * Obt�m o valor da propriedade valorTaxasAlugueis.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTaxasAlugueis() {
        return valorTaxasAlugueis;
    }

    /**
     * Define o valor da propriedade valorTaxasAlugueis.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTaxasAlugueis(BigDecimal value) {
        this.valorTaxasAlugueis = value;
    }

    /**
     * Obt�m o valor da propriedade valorMateriais.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMateriais() {
        return valorMateriais;
    }

    /**
     * Define o valor da propriedade valorMateriais.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMateriais(BigDecimal value) {
        this.valorMateriais = value;
    }

    /**
     * Obt�m o valor da propriedade valorMedicamentos.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorMedicamentos() {
        return valorMedicamentos;
    }

    /**
     * Define o valor da propriedade valorMedicamentos.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorMedicamentos(BigDecimal value) {
        this.valorMedicamentos = value;
    }

    /**
     * Obt�m o valor da propriedade valorOPME.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorOPME() {
        return valorOPME;
    }

    /**
     * Define o valor da propriedade valorOPME.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorOPME(BigDecimal value) {
        this.valorOPME = value;
    }

    /**
     * Obt�m o valor da propriedade valorGasesMedicinais.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorGasesMedicinais() {
        return valorGasesMedicinais;
    }

    /**
     * Define o valor da propriedade valorGasesMedicinais.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorGasesMedicinais(BigDecimal value) {
        this.valorGasesMedicinais = value;
    }

    /**
     * Obt�m o valor da propriedade valorTotalGeral.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotalGeral() {
        return valorTotalGeral;
    }

    /**
     * Define o valor da propriedade valorTotalGeral.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotalGeral(BigDecimal value) {
        this.valorTotalGeral = value;
    }

}
