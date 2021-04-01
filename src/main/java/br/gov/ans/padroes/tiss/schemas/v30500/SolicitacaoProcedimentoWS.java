package br.gov.ans.padroes.tiss.schemas.v30500;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="cabecalho" type="{http://www.ans.gov.br/padroes/tiss/schemas}cabecalhoTransacao"/>
 *         &lt;element name="solicitacaoProcedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_solicitacaoProcedimento"/>
 *         &lt;element name="hash" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Signature" type="{http://www.ans.gov.br/padroes/tiss/schemas}Signature" minOccurs="0"/>
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
        "cabecalho",
        "solicitacaoProcedimento",
        "hash",
        "signature"
})
@XmlRootElement(name = "solicitacaoProcedimentoWS")
public class SolicitacaoProcedimentoWS implements PedidoSolicitacaoProcedimentoWSI {

    @XmlElement(required = true)
    protected CabecalhoTransacao cabecalho;
    @XmlElement(required = true)
    protected CtSolicitacaoProcedimento solicitacaoProcedimento;
    @XmlElement(required = true)
    protected String hash;
    @XmlElement(name = "Signature")
    protected Signature signature;

    /**
     * Obt�m o valor da propriedade cabecalho.
     *
     * @return
     *     possible object is
     *     {@link CabecalhoTransacaoTISSI }
     *
     */
    public CabecalhoTransacao getCabecalho() {
        return cabecalho;
    }

    /**
     * Define o valor da propriedade cabecalho.
     *
     * @param value
     *     allowed object is
     *     {@link CabecalhoTransacao }
     *
     */
    public void setCabecalho(CabecalhoTransacao value) {
        this.cabecalho = value;
    }

    /**
     * Obt�m o valor da propriedade solicitacaoProcedimento.
     *
     * @return
     *     possible object is
     *     {@link CtSolicitacaoProcedimento }
     *
     */
    public CtSolicitacaoProcedimento getSolicitacaoProcedimento() {
        return solicitacaoProcedimento;
    }

    /**
     * Define o valor da propriedade solicitacaoProcedimento.
     *
     * @param value
     *     allowed object is
     *     {@link CtSolicitacaoProcedimento }
     *
     */
    public void setSolicitacaoProcedimento(CtSolicitacaoProcedimento value) {
        this.solicitacaoProcedimento = value;
    }

    /**
     * Obt�m o valor da propriedade hash.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHash() {
        return hash;
    }

    /**
     * Define o valor da propriedade hash.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHash(String value) {
        this.hash = value;
    }

    /**
     * Obt�m o valor da propriedade signature.
     *
     * @return
     *     possible object is
     *     {@link Signature }
     *
     */
    public Signature getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     *
     * @param value
     *     allowed object is
     *     {@link Signature }
     *
     */
    public void setSignature(Signature value) {
        this.signature = value;
    }

}