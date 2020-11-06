
package br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

import br.gov.ans.padroes.tiss.schemas.api.CtContratadoDadosI;


/**
 * <p>Classe Java de ct_contratadoDados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_contratadoDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *           &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *           &lt;element name="cnpjContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *         &lt;/choice>
 *         &lt;element name="nomeContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_contratadoDados", propOrder = {
    "codigoPrestadorNaOperadora",
    "cpfContratado",
    "cnpjContratado",
    "nomeContratado"
})
@XmlSeeAlso({
    CtmConsultaGuia.ContratadoExecutante.class
})
public class CtContratadoDados implements CtContratadoDadosI{

    protected String codigoPrestadorNaOperadora;
    protected String cpfContratado;
    protected String cnpjContratado;
    @XmlElement(required = true)
    protected String nomeContratado;

    /**
     * Obtém o valor da propriedade codigoPrestadorNaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoPrestadorNaOperadora() {
        return codigoPrestadorNaOperadora;
    }

    /**
     * Define o valor da propriedade codigoPrestadorNaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoPrestadorNaOperadora(String value) {
        this.codigoPrestadorNaOperadora = value;
    }

    /**
     * Obtém o valor da propriedade cpfContratado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCpfContratado() {
        return cpfContratado;
    }

    /**
     * Define o valor da propriedade cpfContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCpfContratado(String value) {
        this.cpfContratado = value;
    }

    /**
     * Obtém o valor da propriedade cnpjContratado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnpjContratado() {
        return cnpjContratado;
    }

    /**
     * Define o valor da propriedade cnpjContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnpjContratado(String value) {
        this.cnpjContratado = value;
    }

    /**
     * Obtém o valor da propriedade nomeContratado.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeContratado() {
        return nomeContratado;
    }

    /**
     * Define o valor da propriedade nomeContratado.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeContratado(String value) {
        this.nomeContratado = value;
    }

}
