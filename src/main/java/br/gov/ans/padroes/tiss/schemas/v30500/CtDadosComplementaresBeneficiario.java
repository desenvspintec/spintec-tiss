
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_dadosComplementaresBeneficiario complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_dadosComplementaresBeneficiario">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="peso" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *         &lt;element name="altura" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal5-2"/>
 *         &lt;element name="superficieCorporal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal4-2"/>
 *         &lt;element name="idade" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="sexo" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_sexo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_dadosComplementaresBeneficiario", propOrder = {
    "peso",
    "altura",
    "superficieCorporal",
    "idade",
    "sexo"
})
public class CtDadosComplementaresBeneficiario {

    @XmlElement(required = true)
    protected BigDecimal peso;
    @XmlElement(required = true)
    protected BigDecimal altura;
    @XmlElement(required = true)
    protected BigDecimal superficieCorporal;
    @XmlElement(required = true)
    protected BigInteger idade;
    @XmlElement(required = true)
    protected String sexo;

    /**
     * Obt�m o valor da propriedade peso.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPeso() {
        return peso;
    }

    /**
     * Define o valor da propriedade peso.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPeso(BigDecimal value) {
        this.peso = value;
    }

    /**
     * Obt�m o valor da propriedade altura.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAltura() {
        return altura;
    }

    /**
     * Define o valor da propriedade altura.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAltura(BigDecimal value) {
        this.altura = value;
    }

    /**
     * Obt�m o valor da propriedade superficieCorporal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSuperficieCorporal() {
        return superficieCorporal;
    }

    /**
     * Define o valor da propriedade superficieCorporal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSuperficieCorporal(BigDecimal value) {
        this.superficieCorporal = value;
    }

    /**
     * Obt�m o valor da propriedade idade.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getIdade() {
        return idade;
    }

    /**
     * Define o valor da propriedade idade.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setIdade(BigInteger value) {
        this.idade = value;
    }

    /**
     * Obt�m o valor da propriedade sexo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * Define o valor da propriedade sexo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSexo(String value) {
        this.sexo = value;
    }

}
