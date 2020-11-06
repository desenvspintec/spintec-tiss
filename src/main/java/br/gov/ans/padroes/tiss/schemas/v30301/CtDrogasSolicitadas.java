
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ct_drogasSolicitadas complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_drogasSolicitadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataProvavel" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="identificacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="qtDoses" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *         &lt;element name="unidadeMedida" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_unidadeMedida"/>
 *         &lt;element name="viaAdministracao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_viaAdministracao"/>
 *         &lt;element name="frequencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ct_drogasSolicitadas", propOrder = {
    "dataProvavel",
    "identificacao",
    "qtDoses",
    "unidadeMedida",
    "viaAdministracao",
    "frequencia"
})
public class CtDrogasSolicitadas {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataProvavel;
    @XmlElement(required = true)
    protected CtProcedimentoDados identificacao;
    @XmlElement(required = true)
    protected BigDecimal qtDoses;
    @XmlElement(required = true)
    protected String unidadeMedida;
    @XmlElement(required = true)
    protected String viaAdministracao;
    @XmlElement(required = true)
    protected BigInteger frequencia;

    /**
     * Obtém o valor da propriedade dataProvavel.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataProvavel() {
        return dataProvavel;
    }

    /**
     * Define o valor da propriedade dataProvavel.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataProvavel(XMLGregorianCalendar value) {
        this.dataProvavel = value;
    }

    /**
     * Obtém o valor da propriedade identificacao.
     * 
     * @return
     *     possible object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public CtProcedimentoDados getIdentificacao() {
        return identificacao;
    }

    /**
     * Define o valor da propriedade identificacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtProcedimentoDados }
     *     
     */
    public void setIdentificacao(CtProcedimentoDados value) {
        this.identificacao = value;
    }

    /**
     * Obtém o valor da propriedade qtDoses.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getQtDoses() {
        return qtDoses;
    }

    /**
     * Define o valor da propriedade qtDoses.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setQtDoses(BigDecimal value) {
        this.qtDoses = value;
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
     * Obtém o valor da propriedade viaAdministracao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaAdministracao() {
        return viaAdministracao;
    }

    /**
     * Define o valor da propriedade viaAdministracao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaAdministracao(String value) {
        this.viaAdministracao = value;
    }

    /**
     * Obtém o valor da propriedade frequencia.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFrequencia() {
        return frequencia;
    }

    /**
     * Define o valor da propriedade frequencia.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFrequencia(BigInteger value) {
        this.frequencia = value;
    }

}
