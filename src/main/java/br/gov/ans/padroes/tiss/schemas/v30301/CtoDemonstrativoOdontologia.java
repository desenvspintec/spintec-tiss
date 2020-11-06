
package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.v30301;

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
 * <p>Classe Java de cto_demonstrativoOdontologia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="cto_demonstrativoOdontologia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoDemonstrativoOdonto">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
 *                   &lt;element name="numeroDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                   &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cnpjOper" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                   &lt;element name="periodoProc">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosPrestador">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                   &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="cpfCNPJContratado">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
 *                             &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosPagamentoPorData" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dadosPagamento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                             &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
 *                             &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
 *                             &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="protocolos" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                             &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
 *                             &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                                       &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                                       &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
 *                                       &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                                       &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
 *                                       &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                                       &lt;element name="dadosPagamento" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *                                                 &lt;element name="denteRegiao" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;choice>
 *                                                           &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
 *                                                           &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
 *                                                         &lt;/choice>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
 *                                                 &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *                                                 &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
 *                                                 &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
 *                                                 &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *                                       &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                       &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="totaisPorProtocolo">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                       &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totaisPorData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="debCredPorDataPagamento" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="totalLiquidoPorData">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                             &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totaisBrutoDemonstrativo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="valorInformadoPorDemonstrativoData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorlProcessadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorlGlosaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valoFranquiaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                   &lt;element name="valorLiberadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="debCredDemonstrativo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="totalDebitosDemonstativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="totalCreditosDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="valorRecebidoDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "cto_demonstrativoOdontologia", propOrder = {
    "cabecalhoDemonstrativoOdonto",
    "dadosPrestador",
    "dadosPagamentoPorData",
    "totaisBrutoDemonstrativo",
    "debCredDemonstrativo",
    "totalDebitosDemonstativo",
    "totalCreditosDemonstrativo",
    "valorRecebidoDemonstrativo",
    "observacao"
})
public class CtoDemonstrativoOdontologia {

    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto cabecalhoDemonstrativoOdonto;
    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.DadosPrestador dadosPrestador;
    @XmlElement(required = true)
    protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData> dadosPagamentoPorData;
    @XmlElement(required = true)
    protected CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo totaisBrutoDemonstrativo;
    protected CtoDemonstrativoOdontologia.DebCredDemonstrativo debCredDemonstrativo;
    @XmlElement(required = true)
    protected BigDecimal totalDebitosDemonstativo;
    @XmlElement(required = true)
    protected BigDecimal totalCreditosDemonstrativo;
    @XmlElement(required = true)
    protected BigDecimal valorRecebidoDemonstrativo;
    protected String observacao;

    /**
     * Obtém o valor da propriedade cabecalhoDemonstrativoOdonto.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto }
     *     
     */
    public CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto getCabecalhoDemonstrativoOdonto() {
        return cabecalhoDemonstrativoOdonto;
    }

    /**
     * Define o valor da propriedade cabecalhoDemonstrativoOdonto.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto }
     *     
     */
    public void setCabecalhoDemonstrativoOdonto(CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto value) {
        this.cabecalhoDemonstrativoOdonto = value;
    }

    /**
     * Obtém o valor da propriedade dadosPrestador.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public CtoDemonstrativoOdontologia.DadosPrestador getDadosPrestador() {
        return dadosPrestador;
    }

    /**
     * Define o valor da propriedade dadosPrestador.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.DadosPrestador }
     *     
     */
    public void setDadosPrestador(CtoDemonstrativoOdontologia.DadosPrestador value) {
        this.dadosPrestador = value;
    }

    /**
     * Gets the value of the dadosPagamentoPorData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dadosPagamentoPorData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDadosPagamentoPorData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData }
     * 
     * 
     */
    public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData> getDadosPagamentoPorData() {
        if (dadosPagamentoPorData == null) {
            dadosPagamentoPorData = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData>();
        }
        return this.dadosPagamentoPorData;
    }

    /**
     * Obtém o valor da propriedade totaisBrutoDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo }
     *     
     */
    public CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo getTotaisBrutoDemonstrativo() {
        return totaisBrutoDemonstrativo;
    }

    /**
     * Define o valor da propriedade totaisBrutoDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo }
     *     
     */
    public void setTotaisBrutoDemonstrativo(CtoDemonstrativoOdontologia.TotaisBrutoDemonstrativo value) {
        this.totaisBrutoDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade debCredDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link CtoDemonstrativoOdontologia.DebCredDemonstrativo }
     *     
     */
    public CtoDemonstrativoOdontologia.DebCredDemonstrativo getDebCredDemonstrativo() {
        return debCredDemonstrativo;
    }

    /**
     * Define o valor da propriedade debCredDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link CtoDemonstrativoOdontologia.DebCredDemonstrativo }
     *     
     */
    public void setDebCredDemonstrativo(CtoDemonstrativoOdontologia.DebCredDemonstrativo value) {
        this.debCredDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade totalDebitosDemonstativo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalDebitosDemonstativo() {
        return totalDebitosDemonstativo;
    }

    /**
     * Define o valor da propriedade totalDebitosDemonstativo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalDebitosDemonstativo(BigDecimal value) {
        this.totalDebitosDemonstativo = value;
    }

    /**
     * Obtém o valor da propriedade totalCreditosDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalCreditosDemonstrativo() {
        return totalCreditosDemonstrativo;
    }

    /**
     * Define o valor da propriedade totalCreditosDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalCreditosDemonstrativo(BigDecimal value) {
        this.totalCreditosDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade valorRecebidoDemonstrativo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorRecebidoDemonstrativo() {
        return valorRecebidoDemonstrativo;
    }

    /**
     * Define o valor da propriedade valorRecebidoDemonstrativo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorRecebidoDemonstrativo(BigDecimal value) {
        this.valorRecebidoDemonstrativo = value;
    }

    /**
     * Obtém o valor da propriedade observacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Define o valor da propriedade observacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setObservacao(String value) {
        this.observacao = value;
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
     *         &lt;element name="registroANS" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_registroANS"/>
     *         &lt;element name="numeroDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *         &lt;element name="nomeOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cnpjOper" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *         &lt;element name="periodoProc">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
    @XmlType(name = "", propOrder = {
        "registroANS",
        "numeroDemonstrativo",
        "nomeOperadora",
        "cnpjOper",
        "periodoProc"
    })
    public static class CabecalhoDemonstrativoOdonto {

        @XmlElement(required = true)
        protected String registroANS;
        @XmlElement(required = true)
        protected String numeroDemonstrativo;
        @XmlElement(required = true)
        protected String nomeOperadora;
        @XmlElement(required = true)
        protected String cnpjOper;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc periodoProc;

        /**
         * Obtém o valor da propriedade registroANS.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRegistroANS() {
            return registroANS;
        }

        /**
         * Define o valor da propriedade registroANS.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRegistroANS(String value) {
            this.registroANS = value;
        }

        /**
         * Obtém o valor da propriedade numeroDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroDemonstrativo() {
            return numeroDemonstrativo;
        }

        /**
         * Define o valor da propriedade numeroDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroDemonstrativo(String value) {
            this.numeroDemonstrativo = value;
        }

        /**
         * Obtém o valor da propriedade nomeOperadora.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeOperadora() {
            return nomeOperadora;
        }

        /**
         * Define o valor da propriedade nomeOperadora.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeOperadora(String value) {
            this.nomeOperadora = value;
        }

        /**
         * Obtém o valor da propriedade cnpjOper.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCnpjOper() {
            return cnpjOper;
        }

        /**
         * Define o valor da propriedade cnpjOper.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCnpjOper(String value) {
            this.cnpjOper = value;
        }

        /**
         * Obtém o valor da propriedade periodoProc.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc }
         *     
         */
        public CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc getPeriodoProc() {
            return periodoProc;
        }

        /**
         * Define o valor da propriedade periodoProc.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc }
         *     
         */
        public void setPeriodoProc(CtoDemonstrativoOdontologia.CabecalhoDemonstrativoOdonto.PeriodoProc value) {
            this.periodoProc = value;
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
         *         &lt;element name="datainicio" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="datafim" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
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
            "datainicio",
            "datafim"
        })
        public static class PeriodoProc {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datainicio;
            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar datafim;

            /**
             * Obtém o valor da propriedade datainicio.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatainicio() {
                return datainicio;
            }

            /**
             * Define o valor da propriedade datainicio.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatainicio(XMLGregorianCalendar value) {
                this.datainicio = value;
            }

            /**
             * Obtém o valor da propriedade datafim.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDatafim() {
                return datafim;
            }

            /**
             * Define o valor da propriedade datafim.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDatafim(XMLGregorianCalendar value) {
                this.datafim = value;
            }

        }

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
     *         &lt;element name="dadosPagamento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                   &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
     *                   &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
     *                   &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="protocolos" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *                   &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
     *                   &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                             &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *                             &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
     *                             &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                             &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
     *                             &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *                             &lt;element name="dadosPagamento" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
     *                                       &lt;element name="denteRegiao" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;choice>
     *                                                 &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
     *                                                 &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
     *                                               &lt;/choice>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
     *                                       &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
     *                                       &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
     *                                       &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
     *                                       &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
     *                             &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                             &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="totaisPorProtocolo">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                             &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totaisPorData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="debCredPorDataPagamento" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="totalLiquidoPorData">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *                   &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
    @XmlType(name = "", propOrder = {
        "dadosPagamento",
        "protocolos",
        "totaisPorData",
        "debCredPorDataPagamento",
        "totalLiquidoPorData"
    })
    public static class DadosPagamentoPorData {

        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento dadosPagamento;
        @XmlElement(required = true)
        protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos> protocolos;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData totaisPorData;
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento debCredPorDataPagamento;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData totalLiquidoPorData;

        /**
         * Obtém o valor da propriedade dadosPagamento.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento getDadosPagamento() {
            return dadosPagamento;
        }

        /**
         * Define o valor da propriedade dadosPagamento.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento }
         *     
         */
        public void setDadosPagamento(CtoDemonstrativoOdontologia.DadosPagamentoPorData.DadosPagamento value) {
            this.dadosPagamento = value;
        }

        /**
         * Gets the value of the protocolos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the protocolos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProtocolos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos }
         * 
         * 
         */
        public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos> getProtocolos() {
            if (protocolos == null) {
                protocolos = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos>();
            }
            return this.protocolos;
        }

        /**
         * Obtém o valor da propriedade totaisPorData.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData getTotaisPorData() {
            return totaisPorData;
        }

        /**
         * Define o valor da propriedade totaisPorData.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData }
         *     
         */
        public void setTotaisPorData(CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotaisPorData value) {
            this.totaisPorData = value;
        }

        /**
         * Obtém o valor da propriedade debCredPorDataPagamento.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento getDebCredPorDataPagamento() {
            return debCredPorDataPagamento;
        }

        /**
         * Define o valor da propriedade debCredPorDataPagamento.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento }
         *     
         */
        public void setDebCredPorDataPagamento(CtoDemonstrativoOdontologia.DadosPagamentoPorData.DebCredPorDataPagamento value) {
            this.debCredPorDataPagamento = value;
        }

        /**
         * Obtém o valor da propriedade totalLiquidoPorData.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData getTotalLiquidoPorData() {
            return totalLiquidoPorData;
        }

        /**
         * Define o valor da propriedade totalLiquidoPorData.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData }
         *     
         */
        public void setTotalLiquidoPorData(CtoDemonstrativoOdontologia.DadosPagamentoPorData.TotalLiquidoPorData value) {
            this.totalLiquidoPorData = value;
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
         *         &lt;element name="dataPagamento" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *         &lt;element name="banco" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto4" minOccurs="0"/>
         *         &lt;element name="agencia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7" minOccurs="0"/>
         *         &lt;element name="conta" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
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
            "dataPagamento",
            "banco",
            "agencia",
            "conta"
        })
        public static class DadosPagamento {

            @XmlElement(required = true)
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar dataPagamento;
            protected String banco;
            protected String agencia;
            protected String conta;

            /**
             * Obtém o valor da propriedade dataPagamento.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDataPagamento() {
                return dataPagamento;
            }

            /**
             * Define o valor da propriedade dataPagamento.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDataPagamento(XMLGregorianCalendar value) {
                this.dataPagamento = value;
            }

            /**
             * Obtém o valor da propriedade banco.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBanco() {
                return banco;
            }

            /**
             * Define o valor da propriedade banco.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBanco(String value) {
                this.banco = value;
            }

            /**
             * Obtém o valor da propriedade agencia.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgencia() {
                return agencia;
            }

            /**
             * Define o valor da propriedade agencia.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgencia(String value) {
                this.agencia = value;
            }

            /**
             * Obtém o valor da propriedade conta.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getConta() {
                return conta;
            }

            /**
             * Define o valor da propriedade conta.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setConta(String value) {
                this.conta = value;
            }

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
         *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
            "descontos"
        })
        public static class DebCredPorDataPagamento {

            @XmlElement(required = true)
            protected List<CtDescontos> descontos;

            /**
             * Gets the value of the descontos property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the descontos property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDescontos().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtDescontos }
             * 
             * 
             */
            public List<CtDescontos> getDescontos() {
                if (descontos == null) {
                    descontos = new ArrayList<CtDescontos>();
                }
                return this.descontos;
            }

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
         *         &lt;element name="numeroLote" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
         *         &lt;element name="numeroProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto12"/>
         *         &lt;element name="dadosPagamentoGuia" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *                   &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
         *                   &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
         *                   &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *                   &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
         *                   &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
         *                   &lt;element name="dadosPagamento" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
         *                             &lt;element name="denteRegiao" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;choice>
         *                                       &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
         *                                       &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
         *                                     &lt;/choice>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
         *                             &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
         *                             &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
         *                             &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
         *                             &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
         *                   &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                   &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="totaisPorProtocolo">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *                   &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        @XmlType(name = "", propOrder = {
            "numeroLote",
            "numeroProtocolo",
            "dadosPagamentoGuia",
            "totaisPorProtocolo"
        })
        public static class Protocolos {

            @XmlElement(required = true)
            protected String numeroLote;
            @XmlElement(required = true)
            protected String numeroProtocolo;
            @XmlElement(required = true)
            protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia> dadosPagamentoGuia;
            @XmlElement(required = true)
            protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo totaisPorProtocolo;

            /**
             * Obtém o valor da propriedade numeroLote.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroLote() {
                return numeroLote;
            }

            /**
             * Define o valor da propriedade numeroLote.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroLote(String value) {
                this.numeroLote = value;
            }

            /**
             * Obtém o valor da propriedade numeroProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNumeroProtocolo() {
                return numeroProtocolo;
            }

            /**
             * Define o valor da propriedade numeroProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNumeroProtocolo(String value) {
                this.numeroProtocolo = value;
            }

            /**
             * Gets the value of the dadosPagamentoGuia property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the dadosPagamentoGuia property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDadosPagamentoGuia().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia }
             * 
             * 
             */
            public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia> getDadosPagamentoGuia() {
                if (dadosPagamentoGuia == null) {
                    dadosPagamentoGuia = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia>();
                }
                return this.dadosPagamentoGuia;
            }

            /**
             * Obtém o valor da propriedade totaisPorProtocolo.
             * 
             * @return
             *     possible object is
             *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo }
             *     
             */
            public CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo getTotaisPorProtocolo() {
                return totaisPorProtocolo;
            }

            /**
             * Define o valor da propriedade totaisPorProtocolo.
             * 
             * @param value
             *     allowed object is
             *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo }
             *     
             */
            public void setTotaisPorProtocolo(CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.TotaisPorProtocolo value) {
                this.totaisPorProtocolo = value;
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
             *         &lt;element name="numeroGuiaPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
             *         &lt;element name="numeroGuiaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
             *         &lt;element name="recurso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_simNao"/>
             *         &lt;element name="nomeExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
             *         &lt;element name="carteiraBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20"/>
             *         &lt;element name="nomeBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
             *         &lt;element name="dadosPagamento" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
             *                   &lt;element name="denteRegiao" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;choice>
             *                             &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
             *                             &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
             *                           &lt;/choice>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
             *                   &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
             *                   &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
             *                   &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
             *                   &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="observacaoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
             *         &lt;element name="valorTotalInformadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalProcessadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalGlosaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalFranquiaGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
             *         &lt;element name="valorTotalLiberadoGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
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
                "numeroGuiaPrestador",
                "numeroGuiaOperadora",
                "recurso",
                "nomeExecutante",
                "carteiraBeneficiario",
                "nomeBeneficiario",
                "dadosPagamento",
                "observacaoGuia",
                "valorTotalInformadoGuia",
                "valorTotalProcessadoGuia",
                "valorTotalGlosaGuia",
                "valorTotalFranquiaGuia",
                "valorTotalLiberadoGuia"
            })
            public static class DadosPagamentoGuia {

                @XmlElement(required = true)
                protected String numeroGuiaPrestador;
                protected String numeroGuiaOperadora;
                @XmlElement(required = true)
                @XmlSchemaType(name = "string")
                protected DmSimNao recurso;
                @XmlElement(required = true)
                protected String nomeExecutante;
                @XmlElement(required = true)
                protected String carteiraBeneficiario;
                @XmlElement(required = true)
                protected String nomeBeneficiario;
                @XmlElement(required = true)
                protected List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento> dadosPagamento;
                protected String observacaoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalInformadoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalProcessadoGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalGlosaGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalFranquiaGuia;
                @XmlElement(required = true)
                protected BigDecimal valorTotalLiberadoGuia;

                /**
                 * Obtém o valor da propriedade numeroGuiaPrestador.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroGuiaPrestador() {
                    return numeroGuiaPrestador;
                }

                /**
                 * Define o valor da propriedade numeroGuiaPrestador.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroGuiaPrestador(String value) {
                    this.numeroGuiaPrestador = value;
                }

                /**
                 * Obtém o valor da propriedade numeroGuiaOperadora.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNumeroGuiaOperadora() {
                    return numeroGuiaOperadora;
                }

                /**
                 * Define o valor da propriedade numeroGuiaOperadora.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNumeroGuiaOperadora(String value) {
                    this.numeroGuiaOperadora = value;
                }

                /**
                 * Obtém o valor da propriedade recurso.
                 * 
                 * @return
                 *     possible object is
                 *     {@link DmSimNao }
                 *     
                 */
                public DmSimNao getRecurso() {
                    return recurso;
                }

                /**
                 * Define o valor da propriedade recurso.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link DmSimNao }
                 *     
                 */
                public void setRecurso(DmSimNao value) {
                    this.recurso = value;
                }

                /**
                 * Obtém o valor da propriedade nomeExecutante.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomeExecutante() {
                    return nomeExecutante;
                }

                /**
                 * Define o valor da propriedade nomeExecutante.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomeExecutante(String value) {
                    this.nomeExecutante = value;
                }

                /**
                 * Obtém o valor da propriedade carteiraBeneficiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCarteiraBeneficiario() {
                    return carteiraBeneficiario;
                }

                /**
                 * Define o valor da propriedade carteiraBeneficiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCarteiraBeneficiario(String value) {
                    this.carteiraBeneficiario = value;
                }

                /**
                 * Obtém o valor da propriedade nomeBeneficiario.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getNomeBeneficiario() {
                    return nomeBeneficiario;
                }

                /**
                 * Define o valor da propriedade nomeBeneficiario.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setNomeBeneficiario(String value) {
                    this.nomeBeneficiario = value;
                }

                /**
                 * Gets the value of the dadosPagamento property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the dadosPagamento property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getDadosPagamento().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento }
                 * 
                 * 
                 */
                public List<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento> getDadosPagamento() {
                    if (dadosPagamento == null) {
                        dadosPagamento = new ArrayList<CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento>();
                    }
                    return this.dadosPagamento;
                }

                /**
                 * Obtém o valor da propriedade observacaoGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getObservacaoGuia() {
                    return observacaoGuia;
                }

                /**
                 * Define o valor da propriedade observacaoGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setObservacaoGuia(String value) {
                    this.observacaoGuia = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalInformadoGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalInformadoGuia() {
                    return valorTotalInformadoGuia;
                }

                /**
                 * Define o valor da propriedade valorTotalInformadoGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalInformadoGuia(BigDecimal value) {
                    this.valorTotalInformadoGuia = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalProcessadoGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalProcessadoGuia() {
                    return valorTotalProcessadoGuia;
                }

                /**
                 * Define o valor da propriedade valorTotalProcessadoGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalProcessadoGuia(BigDecimal value) {
                    this.valorTotalProcessadoGuia = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalGlosaGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalGlosaGuia() {
                    return valorTotalGlosaGuia;
                }

                /**
                 * Define o valor da propriedade valorTotalGlosaGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalGlosaGuia(BigDecimal value) {
                    this.valorTotalGlosaGuia = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalFranquiaGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalFranquiaGuia() {
                    return valorTotalFranquiaGuia;
                }

                /**
                 * Define o valor da propriedade valorTotalFranquiaGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalFranquiaGuia(BigDecimal value) {
                    this.valorTotalFranquiaGuia = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalLiberadoGuia.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalLiberadoGuia() {
                    return valorTotalLiberadoGuia;
                }

                /**
                 * Define o valor da propriedade valorTotalLiberadoGuia.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalLiberadoGuia(BigDecimal value) {
                    this.valorTotalLiberadoGuia = value;
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
                 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
                 *         &lt;element name="denteRegiao" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;choice>
                 *                   &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                 *                   &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
                 *                 &lt;/choice>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="denteFace" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto5" minOccurs="0"/>
                 *         &lt;element name="dataRealizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
                 *         &lt;element name="qtdProc" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico2"/>
                 *         &lt;element name="valorInformado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorProcessado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorGlosaEstorno" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorFranquia" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="valorLiberado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal7-2"/>
                 *         &lt;element name="codigosGlosa" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tipoGlosa" maxOccurs="unbounded" minOccurs="0"/>
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
                    "procedimento",
                    "denteRegiao",
                    "denteFace",
                    "dataRealizacao",
                    "qtdProc",
                    "valorInformado",
                    "valorProcessado",
                    "valorGlosaEstorno",
                    "valorFranquia",
                    "valorLiberado",
                    "codigosGlosa"
                })
                public static class DadosPagamento {

                    @XmlElement(required = true)
                    protected CtProcedimentoDados procedimento;
                    protected CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao denteRegiao;
                    protected String denteFace;
                    @XmlElement(required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar dataRealizacao;
                    @XmlElement(required = true)
                    protected BigInteger qtdProc;
                    @XmlElement(required = true)
                    protected BigDecimal valorInformado;
                    @XmlElement(required = true)
                    protected BigDecimal valorProcessado;
                    @XmlElement(required = true)
                    protected BigDecimal valorGlosaEstorno;
                    @XmlElement(required = true)
                    protected BigDecimal valorFranquia;
                    @XmlElement(required = true)
                    protected BigDecimal valorLiberado;
                    protected List<String> codigosGlosa;

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
                     * Obtém o valor da propriedade denteRegiao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao }
                     *     
                     */
                    public CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao getDenteRegiao() {
                        return denteRegiao;
                    }

                    /**
                     * Define o valor da propriedade denteRegiao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao }
                     *     
                     */
                    public void setDenteRegiao(CtoDemonstrativoOdontologia.DadosPagamentoPorData.Protocolos.DadosPagamentoGuia.DadosPagamento.DenteRegiao value) {
                        this.denteRegiao = value;
                    }

                    /**
                     * Obtém o valor da propriedade denteFace.
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDenteFace() {
                        return denteFace;
                    }

                    /**
                     * Define o valor da propriedade denteFace.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDenteFace(String value) {
                        this.denteFace = value;
                    }

                    /**
                     * Obtém o valor da propriedade dataRealizacao.
                     * 
                     * @return
                     *     possible object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public XMLGregorianCalendar getDataRealizacao() {
                        return dataRealizacao;
                    }

                    /**
                     * Define o valor da propriedade dataRealizacao.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link XMLGregorianCalendar }
                     *     
                     */
                    public void setDataRealizacao(XMLGregorianCalendar value) {
                        this.dataRealizacao = value;
                    }

                    /**
                     * Obtém o valor da propriedade qtdProc.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getQtdProc() {
                        return qtdProc;
                    }

                    /**
                     * Define o valor da propriedade qtdProc.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setQtdProc(BigInteger value) {
                        this.qtdProc = value;
                    }

                    /**
                     * Obtém o valor da propriedade valorInformado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorInformado() {
                        return valorInformado;
                    }

                    /**
                     * Define o valor da propriedade valorInformado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorInformado(BigDecimal value) {
                        this.valorInformado = value;
                    }

                    /**
                     * Obtém o valor da propriedade valorProcessado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorProcessado() {
                        return valorProcessado;
                    }

                    /**
                     * Define o valor da propriedade valorProcessado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorProcessado(BigDecimal value) {
                        this.valorProcessado = value;
                    }

                    /**
                     * Obtém o valor da propriedade valorGlosaEstorno.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorGlosaEstorno() {
                        return valorGlosaEstorno;
                    }

                    /**
                     * Define o valor da propriedade valorGlosaEstorno.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorGlosaEstorno(BigDecimal value) {
                        this.valorGlosaEstorno = value;
                    }

                    /**
                     * Obtém o valor da propriedade valorFranquia.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorFranquia() {
                        return valorFranquia;
                    }

                    /**
                     * Define o valor da propriedade valorFranquia.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorFranquia(BigDecimal value) {
                        this.valorFranquia = value;
                    }

                    /**
                     * Obtém o valor da propriedade valorLiberado.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public BigDecimal getValorLiberado() {
                        return valorLiberado;
                    }

                    /**
                     * Define o valor da propriedade valorLiberado.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigDecimal }
                     *     
                     */
                    public void setValorLiberado(BigDecimal value) {
                        this.valorLiberado = value;
                    }

                    /**
                     * Gets the value of the codigosGlosa property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the codigosGlosa property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getCodigosGlosa().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getCodigosGlosa() {
                        if (codigosGlosa == null) {
                            codigosGlosa = new ArrayList<String>();
                        }
                        return this.codigosGlosa;
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
                     *       &lt;choice>
                     *         &lt;element name="codDente" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_dente"/>
                     *         &lt;element name="codRegiao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_regiao"/>
                     *       &lt;/choice>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "codDente",
                        "codRegiao"
                    })
                    public static class DenteRegiao {

                        protected String codDente;
                        @XmlSchemaType(name = "string")
                        protected DmRegiao codRegiao;

                        /**
                         * Obtém o valor da propriedade codDente.
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getCodDente() {
                            return codDente;
                        }

                        /**
                         * Define o valor da propriedade codDente.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setCodDente(String value) {
                            this.codDente = value;
                        }

                        /**
                         * Obtém o valor da propriedade codRegiao.
                         * 
                         * @return
                         *     possible object is
                         *     {@link DmRegiao }
                         *     
                         */
                        public DmRegiao getCodRegiao() {
                            return codRegiao;
                        }

                        /**
                         * Define o valor da propriedade codRegiao.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link DmRegiao }
                         *     
                         */
                        public void setCodRegiao(DmRegiao value) {
                            this.codRegiao = value;
                        }

                    }

                }

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
             *         &lt;element name="valorTotalInformadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalProcessadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalGlosaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalFranquiaPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
             *         &lt;element name="valorTotalLiberadoPorProtocolo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
                "valorTotalInformadoPorProtocolo",
                "valorTotalProcessadoPorProtocolo",
                "valorTotalGlosaPorProtocolo",
                "valorTotalFranquiaPorProtocolo",
                "valorTotalLiberadoPorProtocolo"
            })
            public static class TotaisPorProtocolo {

                @XmlElement(required = true)
                protected BigDecimal valorTotalInformadoPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalProcessadoPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalGlosaPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalFranquiaPorProtocolo;
                @XmlElement(required = true)
                protected BigDecimal valorTotalLiberadoPorProtocolo;

                /**
                 * Obtém o valor da propriedade valorTotalInformadoPorProtocolo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalInformadoPorProtocolo() {
                    return valorTotalInformadoPorProtocolo;
                }

                /**
                 * Define o valor da propriedade valorTotalInformadoPorProtocolo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalInformadoPorProtocolo(BigDecimal value) {
                    this.valorTotalInformadoPorProtocolo = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalProcessadoPorProtocolo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalProcessadoPorProtocolo() {
                    return valorTotalProcessadoPorProtocolo;
                }

                /**
                 * Define o valor da propriedade valorTotalProcessadoPorProtocolo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalProcessadoPorProtocolo(BigDecimal value) {
                    this.valorTotalProcessadoPorProtocolo = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalGlosaPorProtocolo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalGlosaPorProtocolo() {
                    return valorTotalGlosaPorProtocolo;
                }

                /**
                 * Define o valor da propriedade valorTotalGlosaPorProtocolo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalGlosaPorProtocolo(BigDecimal value) {
                    this.valorTotalGlosaPorProtocolo = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalFranquiaPorProtocolo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalFranquiaPorProtocolo() {
                    return valorTotalFranquiaPorProtocolo;
                }

                /**
                 * Define o valor da propriedade valorTotalFranquiaPorProtocolo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalFranquiaPorProtocolo(BigDecimal value) {
                    this.valorTotalFranquiaPorProtocolo = value;
                }

                /**
                 * Obtém o valor da propriedade valorTotalLiberadoPorProtocolo.
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigDecimal }
                 *     
                 */
                public BigDecimal getValorTotalLiberadoPorProtocolo() {
                    return valorTotalLiberadoPorProtocolo;
                }

                /**
                 * Define o valor da propriedade valorTotalLiberadoPorProtocolo.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigDecimal }
                 *     
                 */
                public void setValorTotalLiberadoPorProtocolo(BigDecimal value) {
                    this.valorTotalLiberadoPorProtocolo = value;
                }

            }

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
         *         &lt;element name="valorBrutonformadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoProcessadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoGlosaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoFranquiaPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorBrutoLiberadoPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorBrutonformadoPorData",
            "valorBrutoProcessadoPorData",
            "valorBrutoGlosaPorData",
            "valorBrutoFranquiaPorData",
            "valorBrutoLiberadoPorData"
        })
        public static class TotaisPorData {

            @XmlElement(required = true)
            protected BigDecimal valorBrutonformadoPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoProcessadoPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoGlosaPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoFranquiaPorData;
            @XmlElement(required = true)
            protected BigDecimal valorBrutoLiberadoPorData;

            /**
             * Obtém o valor da propriedade valorBrutonformadoPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutonformadoPorData() {
                return valorBrutonformadoPorData;
            }

            /**
             * Define o valor da propriedade valorBrutonformadoPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutonformadoPorData(BigDecimal value) {
                this.valorBrutonformadoPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorBrutoProcessadoPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoProcessadoPorData() {
                return valorBrutoProcessadoPorData;
            }

            /**
             * Define o valor da propriedade valorBrutoProcessadoPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoProcessadoPorData(BigDecimal value) {
                this.valorBrutoProcessadoPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorBrutoGlosaPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoGlosaPorData() {
                return valorBrutoGlosaPorData;
            }

            /**
             * Define o valor da propriedade valorBrutoGlosaPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoGlosaPorData(BigDecimal value) {
                this.valorBrutoGlosaPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorBrutoFranquiaPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoFranquiaPorData() {
                return valorBrutoFranquiaPorData;
            }

            /**
             * Define o valor da propriedade valorBrutoFranquiaPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoFranquiaPorData(BigDecimal value) {
                this.valorBrutoFranquiaPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorBrutoLiberadoPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorBrutoLiberadoPorData() {
                return valorBrutoLiberadoPorData;
            }

            /**
             * Define o valor da propriedade valorBrutoLiberadoPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorBrutoLiberadoPorData(BigDecimal value) {
                this.valorBrutoLiberadoPorData = value;
            }

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
         *         &lt;element name="valorTotalDebitosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorTotalCreditosPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
         *         &lt;element name="valorFinalAReceberPorData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
            "valorTotalDebitosPorData",
            "valorTotalCreditosPorData",
            "valorFinalAReceberPorData"
        })
        public static class TotalLiquidoPorData {

            @XmlElement(required = true)
            protected BigDecimal valorTotalDebitosPorData;
            @XmlElement(required = true)
            protected BigDecimal valorTotalCreditosPorData;
            @XmlElement(required = true)
            protected BigDecimal valorFinalAReceberPorData;

            /**
             * Obtém o valor da propriedade valorTotalDebitosPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorTotalDebitosPorData() {
                return valorTotalDebitosPorData;
            }

            /**
             * Define o valor da propriedade valorTotalDebitosPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorTotalDebitosPorData(BigDecimal value) {
                this.valorTotalDebitosPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorTotalCreditosPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorTotalCreditosPorData() {
                return valorTotalCreditosPorData;
            }

            /**
             * Define o valor da propriedade valorTotalCreditosPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorTotalCreditosPorData(BigDecimal value) {
                this.valorTotalCreditosPorData = value;
            }

            /**
             * Obtém o valor da propriedade valorFinalAReceberPorData.
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getValorFinalAReceberPorData() {
                return valorFinalAReceberPorData;
            }

            /**
             * Define o valor da propriedade valorFinalAReceberPorData.
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setValorFinalAReceberPorData(BigDecimal value) {
                this.valorFinalAReceberPorData = value;
            }

        }

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
     *         &lt;element name="codigoPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *         &lt;element name="nomePrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="cpfCNPJContratado">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
     *                   &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
     *                 &lt;/choice>
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
    @XmlType(name = "", propOrder = {
        "codigoPrestador",
        "nomePrestador",
        "cpfCNPJContratado"
    })
    public static class DadosPrestador {

        @XmlElement(required = true)
        protected String codigoPrestador;
        @XmlElement(required = true)
        protected String nomePrestador;
        @XmlElement(required = true)
        protected CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado cpfCNPJContratado;

        /**
         * Obtém o valor da propriedade codigoPrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigoPrestador() {
            return codigoPrestador;
        }

        /**
         * Define o valor da propriedade codigoPrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigoPrestador(String value) {
            this.codigoPrestador = value;
        }

        /**
         * Obtém o valor da propriedade nomePrestador.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomePrestador() {
            return nomePrestador;
        }

        /**
         * Define o valor da propriedade nomePrestador.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomePrestador(String value) {
            this.nomePrestador = value;
        }

        /**
         * Obtém o valor da propriedade cpfCNPJContratado.
         * 
         * @return
         *     possible object is
         *     {@link CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado }
         *     
         */
        public CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado getCpfCNPJContratado() {
            return cpfCNPJContratado;
        }

        /**
         * Define o valor da propriedade cpfCNPJContratado.
         * 
         * @param value
         *     allowed object is
         *     {@link CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado }
         *     
         */
        public void setCpfCNPJContratado(CtoDemonstrativoOdontologia.DadosPrestador.CpfCNPJContratado value) {
            this.cpfCNPJContratado = value;
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
         *       &lt;choice>
         *         &lt;element name="cnpjPrestador" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CNPJ"/>
         *         &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
         *       &lt;/choice>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cnpjPrestador",
            "cpfContratado"
        })
        public static class CpfCNPJContratado {

            protected String cnpjPrestador;
            protected String cpfContratado;

            /**
             * Obtém o valor da propriedade cnpjPrestador.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCnpjPrestador() {
                return cnpjPrestador;
            }

            /**
             * Define o valor da propriedade cnpjPrestador.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCnpjPrestador(String value) {
                this.cnpjPrestador = value;
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

        }

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
     *         &lt;element name="descontos" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_descontos" maxOccurs="unbounded"/>
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
        "descontos"
    })
    public static class DebCredDemonstrativo {

        @XmlElement(required = true)
        protected List<CtDescontos> descontos;

        /**
         * Gets the value of the descontos property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the descontos property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescontos().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtDescontos }
         * 
         * 
         */
        public List<CtDescontos> getDescontos() {
            if (descontos == null) {
                descontos = new ArrayList<CtDescontos>();
            }
            return this.descontos;
        }

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
     *         &lt;element name="valorInformadoPorDemonstrativoData" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorlProcessadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorlGlosaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valoFranquiaPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
     *         &lt;element name="valorLiberadoPorDemonstrativo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal10-2"/>
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
        "valorInformadoPorDemonstrativoData",
        "valorlProcessadoPorDemonstrativo",
        "valorlGlosaPorDemonstrativo",
        "valoFranquiaPorDemonstrativo",
        "valorLiberadoPorDemonstrativo"
    })
    public static class TotaisBrutoDemonstrativo {

        @XmlElement(required = true)
        protected BigDecimal valorInformadoPorDemonstrativoData;
        @XmlElement(required = true)
        protected BigDecimal valorlProcessadoPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valorlGlosaPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valoFranquiaPorDemonstrativo;
        @XmlElement(required = true)
        protected BigDecimal valorLiberadoPorDemonstrativo;

        /**
         * Obtém o valor da propriedade valorInformadoPorDemonstrativoData.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorInformadoPorDemonstrativoData() {
            return valorInformadoPorDemonstrativoData;
        }

        /**
         * Define o valor da propriedade valorInformadoPorDemonstrativoData.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorInformadoPorDemonstrativoData(BigDecimal value) {
            this.valorInformadoPorDemonstrativoData = value;
        }

        /**
         * Obtém o valor da propriedade valorlProcessadoPorDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorlProcessadoPorDemonstrativo() {
            return valorlProcessadoPorDemonstrativo;
        }

        /**
         * Define o valor da propriedade valorlProcessadoPorDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorlProcessadoPorDemonstrativo(BigDecimal value) {
            this.valorlProcessadoPorDemonstrativo = value;
        }

        /**
         * Obtém o valor da propriedade valorlGlosaPorDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorlGlosaPorDemonstrativo() {
            return valorlGlosaPorDemonstrativo;
        }

        /**
         * Define o valor da propriedade valorlGlosaPorDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorlGlosaPorDemonstrativo(BigDecimal value) {
            this.valorlGlosaPorDemonstrativo = value;
        }

        /**
         * Obtém o valor da propriedade valoFranquiaPorDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValoFranquiaPorDemonstrativo() {
            return valoFranquiaPorDemonstrativo;
        }

        /**
         * Define o valor da propriedade valoFranquiaPorDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValoFranquiaPorDemonstrativo(BigDecimal value) {
            this.valoFranquiaPorDemonstrativo = value;
        }

        /**
         * Obtém o valor da propriedade valorLiberadoPorDemonstrativo.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValorLiberadoPorDemonstrativo() {
            return valorLiberadoPorDemonstrativo;
        }

        /**
         * Define o valor da propriedade valorLiberadoPorDemonstrativo.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValorLiberadoPorDemonstrativo(BigDecimal value) {
            this.valorLiberadoPorDemonstrativo = value;
        }

    }

}
