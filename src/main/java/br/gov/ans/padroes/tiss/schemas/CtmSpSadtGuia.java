
package br.gov.ans.padroes.tiss.schemas;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Classe Java de ctm_sp-sadtGuia complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ctm_sp-sadtGuia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cabecalhoGuia">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho">
 *                 &lt;sequence>
 *                   &lt;element name="guiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAutorizacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_autorizacaoSADT" minOccurs="0"/>
 *         &lt;element name="dadosBeneficiario" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_beneficiarioDados"/>
 *         &lt;element name="dadosSolicitante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosSolicitacao">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
 *                   &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
 *                   &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosExecutante">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
 *                   &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="dadosAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ctm_sp-sadtAtendimento"/>
 *         &lt;element name="procedimentosExecutados" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoSadt" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="outrasDespesas" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_outrasDespesas" minOccurs="0"/>
 *         &lt;element name="observacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaValorTotal"/>
 *         &lt;element name="assinaturaDigitalGuia" type="{http://www.ans.gov.br/padroes/tiss/schemas}Signature" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ctm_sp-sadtGuia", propOrder = {
    "cabecalhoGuia",
    "dadosAutorizacao",
    "dadosBeneficiario",
    "dadosSolicitante",
    "dadosSolicitacao",
    "dadosExecutante",
    "dadosAtendimento",
    "procedimentosExecutados",
    "outrasDespesas",
    "observacao",
    "valorTotal",
    "assinaturaDigitalGuia"
})
public class CtmSpSadtGuia {

    @XmlElement(required = true)
    protected CtmSpSadtGuia.CabecalhoGuia cabecalhoGuia;
    protected CtAutorizacaoSADT dadosAutorizacao;
    @XmlElement(required = true)
    protected CtBeneficiarioDados dadosBeneficiario;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosSolicitante dadosSolicitante;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosSolicitacao dadosSolicitacao;
    @XmlElement(required = true)
    protected CtmSpSadtGuia.DadosExecutante dadosExecutante;
    @XmlElement(required = true)
    protected CtmSpSadtAtendimento dadosAtendimento;
    protected CtmSpSadtGuia.ProcedimentosExecutados procedimentosExecutados;
    protected CtOutrasDespesas outrasDespesas;
    protected String observacao;
    @XmlElement(required = true)
    protected CtGuiaValorTotal valorTotal;
    protected Signature assinaturaDigitalGuia;

    /**
     * Obt�m o valor da propriedade cabecalhoGuia.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.CabecalhoGuia }
     *     
     */
    public CtmSpSadtGuia.CabecalhoGuia getCabecalhoGuia() {
        return cabecalhoGuia;
    }

    /**
     * Define o valor da propriedade cabecalhoGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.CabecalhoGuia }
     *     
     */
    public void setCabecalhoGuia(CtmSpSadtGuia.CabecalhoGuia value) {
        this.cabecalhoGuia = value;
    }

    /**
     * Obt�m o valor da propriedade dadosAutorizacao.
     * 
     * @return
     *     possible object is
     *     {@link CtAutorizacaoSADT }
     *     
     */
    public CtAutorizacaoSADT getDadosAutorizacao() {
        return dadosAutorizacao;
    }

    /**
     * Define o valor da propriedade dadosAutorizacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtAutorizacaoSADT }
     *     
     */
    public void setDadosAutorizacao(CtAutorizacaoSADT value) {
        this.dadosAutorizacao = value;
    }

    /**
     * Obt�m o valor da propriedade dadosBeneficiario.
     * 
     * @return
     *     possible object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public CtBeneficiarioDados getDadosBeneficiario() {
        return dadosBeneficiario;
    }

    /**
     * Define o valor da propriedade dadosBeneficiario.
     * 
     * @param value
     *     allowed object is
     *     {@link CtBeneficiarioDados }
     *     
     */
    public void setDadosBeneficiario(CtBeneficiarioDados value) {
        this.dadosBeneficiario = value;
    }

    /**
     * Obt�m o valor da propriedade dadosSolicitante.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.DadosSolicitante }
     *     
     */
    public CtmSpSadtGuia.DadosSolicitante getDadosSolicitante() {
        return dadosSolicitante;
    }

    /**
     * Define o valor da propriedade dadosSolicitante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosSolicitante }
     *     
     */
    public void setDadosSolicitante(CtmSpSadtGuia.DadosSolicitante value) {
        this.dadosSolicitante = value;
    }

    /**
     * Obt�m o valor da propriedade dadosSolicitacao.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.DadosSolicitacao }
     *     
     */
    public CtmSpSadtGuia.DadosSolicitacao getDadosSolicitacao() {
        return dadosSolicitacao;
    }

    /**
     * Define o valor da propriedade dadosSolicitacao.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosSolicitacao }
     *     
     */
    public void setDadosSolicitacao(CtmSpSadtGuia.DadosSolicitacao value) {
        this.dadosSolicitacao = value;
    }

    /**
     * Obt�m o valor da propriedade dadosExecutante.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.DadosExecutante }
     *     
     */
    public CtmSpSadtGuia.DadosExecutante getDadosExecutante() {
        return dadosExecutante;
    }

    /**
     * Define o valor da propriedade dadosExecutante.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.DadosExecutante }
     *     
     */
    public void setDadosExecutante(CtmSpSadtGuia.DadosExecutante value) {
        this.dadosExecutante = value;
    }

    /**
     * Obt�m o valor da propriedade dadosAtendimento.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtAtendimento }
     *     
     */
    public CtmSpSadtAtendimento getDadosAtendimento() {
        return dadosAtendimento;
    }

    /**
     * Define o valor da propriedade dadosAtendimento.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtAtendimento }
     *     
     */
    public void setDadosAtendimento(CtmSpSadtAtendimento value) {
        this.dadosAtendimento = value;
    }

    /**
     * Obt�m o valor da propriedade procedimentosExecutados.
     * 
     * @return
     *     possible object is
     *     {@link CtmSpSadtGuia.ProcedimentosExecutados }
     *     
     */
    public CtmSpSadtGuia.ProcedimentosExecutados getProcedimentosExecutados() {
        return procedimentosExecutados;
    }

    /**
     * Define o valor da propriedade procedimentosExecutados.
     * 
     * @param value
     *     allowed object is
     *     {@link CtmSpSadtGuia.ProcedimentosExecutados }
     *     
     */
    public void setProcedimentosExecutados(CtmSpSadtGuia.ProcedimentosExecutados value) {
        this.procedimentosExecutados = value;
    }

    /**
     * Obt�m o valor da propriedade outrasDespesas.
     * 
     * @return
     *     possible object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public CtOutrasDespesas getOutrasDespesas() {
        return outrasDespesas;
    }

    /**
     * Define o valor da propriedade outrasDespesas.
     * 
     * @param value
     *     allowed object is
     *     {@link CtOutrasDespesas }
     *     
     */
    public void setOutrasDespesas(CtOutrasDespesas value) {
        this.outrasDespesas = value;
    }

    /**
     * Obt�m o valor da propriedade observacao.
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
     * Obt�m o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public CtGuiaValorTotal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link CtGuiaValorTotal }
     *     
     */
    public void setValorTotal(CtGuiaValorTotal value) {
        this.valorTotal = value;
    }

    /**
     * Obt�m o valor da propriedade assinaturaDigitalGuia.
     * 
     * @return
     *     possible object is
     *     {@link Signature }
     *     
     */
    public Signature getAssinaturaDigitalGuia() {
        return assinaturaDigitalGuia;
    }

    /**
     * Define o valor da propriedade assinaturaDigitalGuia.
     * 
     * @param value
     *     allowed object is
     *     {@link Signature }
     *     
     */
    public void setAssinaturaDigitalGuia(Signature value) {
        this.assinaturaDigitalGuia = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.ans.gov.br/padroes/tiss/schemas}ct_guiaCabecalho">
     *       &lt;sequence>
     *         &lt;element name="guiaPrincipal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto20" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guiaPrincipal"
    })
    public static class CabecalhoGuia
        extends CtGuiaCabecalho
    {

        protected String guiaPrincipal;

        /**
         * Obt�m o valor da propriedade guiaPrincipal.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGuiaPrincipal() {
            return guiaPrincipal;
        }

        /**
         * Define o valor da propriedade guiaPrincipal.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGuiaPrincipal(String value) {
            this.guiaPrincipal = value;
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
     *         &lt;element name="contratadoExecutante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="CNES" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto7"/>
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
        "contratadoExecutante",
        "cnes"
    })
    public static class DadosExecutante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoExecutante;
        @XmlElement(name = "CNES", required = true)
        protected String cnes;

        /**
         * Obt�m o valor da propriedade contratadoExecutante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoExecutante() {
            return contratadoExecutante;
        }

        /**
         * Define o valor da propriedade contratadoExecutante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoExecutante(CtContratadoDados value) {
            this.contratadoExecutante = value;
        }

        /**
         * Obt�m o valor da propriedade cnes.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNES() {
            return cnes;
        }

        /**
         * Define o valor da propriedade cnes.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNES(String value) {
            this.cnes = value;
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
     *         &lt;element name="dataSolicitacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data" minOccurs="0"/>
     *         &lt;element name="caraterAtendimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_caraterAtendimento"/>
     *         &lt;element name="indicacaoClinica" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto500" minOccurs="0"/>
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
        "dataSolicitacao",
        "caraterAtendimento",
        "indicacaoClinica"
    })
    public static class DadosSolicitacao {

        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dataSolicitacao;
        @XmlElement(required = true)
        protected String caraterAtendimento;
        protected String indicacaoClinica;

        /**
         * Obt�m o valor da propriedade dataSolicitacao.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDataSolicitacao() {
            return dataSolicitacao;
        }

        /**
         * Define o valor da propriedade dataSolicitacao.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDataSolicitacao(XMLGregorianCalendar value) {
            this.dataSolicitacao = value;
        }

        /**
         * Obt�m o valor da propriedade caraterAtendimento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCaraterAtendimento() {
            return caraterAtendimento;
        }

        /**
         * Define o valor da propriedade caraterAtendimento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCaraterAtendimento(String value) {
            this.caraterAtendimento = value;
        }

        /**
         * Obt�m o valor da propriedade indicacaoClinica.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIndicacaoClinica() {
            return indicacaoClinica;
        }

        /**
         * Define o valor da propriedade indicacaoClinica.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIndicacaoClinica(String value) {
            this.indicacaoClinica = value;
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
     *         &lt;element name="contratadoSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoDados"/>
     *         &lt;element name="profissionalSolicitante" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_contratadoProfissionalDados"/>
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
        "contratadoSolicitante",
        "profissionalSolicitante"
    })
    public static class DadosSolicitante {

        @XmlElement(required = true)
        protected CtContratadoDados contratadoSolicitante;
        @XmlElement(required = true)
        protected CtContratadoProfissionalDados profissionalSolicitante;

        /**
         * Obt�m o valor da propriedade contratadoSolicitante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoDados }
         *     
         */
        public CtContratadoDados getContratadoSolicitante() {
            return contratadoSolicitante;
        }

        /**
         * Define o valor da propriedade contratadoSolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoDados }
         *     
         */
        public void setContratadoSolicitante(CtContratadoDados value) {
            this.contratadoSolicitante = value;
        }

        /**
         * Obt�m o valor da propriedade profissionalSolicitante.
         * 
         * @return
         *     possible object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public CtContratadoProfissionalDados getProfissionalSolicitante() {
            return profissionalSolicitante;
        }

        /**
         * Define o valor da propriedade profissionalSolicitante.
         * 
         * @param value
         *     allowed object is
         *     {@link CtContratadoProfissionalDados }
         *     
         */
        public void setProfissionalSolicitante(CtContratadoProfissionalDados value) {
            this.profissionalSolicitante = value;
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
     *         &lt;element name="procedimentoExecutado" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoExecutadoSadt" maxOccurs="unbounded"/>
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
        "procedimentoExecutado"
    })
    public static class ProcedimentosExecutados {

        @XmlElement(required = true)
        protected List<CtProcedimentoExecutadoSadt> procedimentoExecutado;

        /**
         * Gets the value of the procedimentoExecutado property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the procedimentoExecutado property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProcedimentoExecutado().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CtProcedimentoExecutadoSadt }
         * 
         * 
         */
        public List<CtProcedimentoExecutadoSadt> getProcedimentoExecutado() {
            if (procedimentoExecutado == null) {
                procedimentoExecutado = new ArrayList<CtProcedimentoExecutadoSadt>();
            }
            return this.procedimentoExecutado;
        }

    }

}
