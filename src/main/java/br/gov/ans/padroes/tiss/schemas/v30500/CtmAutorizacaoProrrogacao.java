
package br.gov.ans.padroes.tiss.schemas.v30500;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ctm_autorizacaoProrrogacao complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_autorizacaoProrrogacao">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="autorizacaoDosServicos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_autorizacaoServico"/>
 *         &lt;element name="diariasAutorizadas" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3" minOccurs="0"/>
 *         &lt;element name="acomodacaoAutorizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoAcomodacao" minOccurs="0"/>
 *         &lt;element name="justificativaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_autorizacaoProrrogacao", propOrder = {
    "autorizacaoDosServicos",
    "diariasAutorizadas",
    "acomodacaoAutorizada",
    "justificativaOperadora"
})
public class CtmAutorizacaoProrrogacao {

    @XmlElement(required = true)
    protected CtmAutorizacaoServico autorizacaoDosServicos;
    protected BigInteger diariasAutorizadas;
    protected String acomodacaoAutorizada;
    protected String justificativaOperadora;

    /**
     * Obt�m o valor da propriedade autorizacaoDosServicos.
     * 
     * @return
     *     possible object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public CtmAutorizacaoServico getAutorizacaoDosServicos() {
        return autorizacaoDosServicos;
    }

    /**
     * Define o valor da propriedade autorizacaoDosServicos.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmAutorizacaoServico }
     *     
     */
    public void setAutorizacaoDosServicos(CtmAutorizacaoServico value) {
        this.autorizacaoDosServicos = value;
    }

    /**
     * Obt�m o valor da propriedade diariasAutorizadas.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDiariasAutorizadas() {
        return diariasAutorizadas;
    }

    /**
     * Define o valor da propriedade diariasAutorizadas.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDiariasAutorizadas(BigInteger value) {
        this.diariasAutorizadas = value;
    }

    /**
     * Obt�m o valor da propriedade acomodacaoAutorizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcomodacaoAutorizada() {
        return acomodacaoAutorizada;
    }

    /**
     * Define o valor da propriedade acomodacaoAutorizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcomodacaoAutorizada(String value) {
        this.acomodacaoAutorizada = value;
    }

    /**
     * Obt�m o valor da propriedade justificativaOperadora.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJustificativaOperadora() {
        return justificativaOperadora;
    }

    /**
     * Define o valor da propriedade justificativaOperadora.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJustificativaOperadora(String value) {
        this.justificativaOperadora = value;
    }

}
