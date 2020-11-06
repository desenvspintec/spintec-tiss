
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de ct_opmeDados complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_opmeDados">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="identificacaoOPME" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="nomeFabricante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_opmeDados", propOrder = {
    "identificacaoOPME",
    "nomeFabricante"
})
public class CtOpmeDados {

    @XmlElement(required = true)
    protected CtProcedimentoDados identificacaoOPME;
    @XmlElement(required = true)
    protected String nomeFabricante;

    /**
     * Obtém o valor da propriedade identificacaoOPME.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getIdentificacaoOPME() {
        return identificacaoOPME;
    }

    /**
     * Define o valor da propriedade identificacaoOPME.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setIdentificacaoOPME(CtProcedimentoDados value) {
        this.identificacaoOPME = value;
    }

    /**
     * Obtém o valor da propriedade nomeFabricante.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNomeFabricante() {
        return nomeFabricante;
    }

    /**
     * Define o valor da propriedade nomeFabricante.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNomeFabricante(String value) {
        this.nomeFabricante = value;
    }

}
