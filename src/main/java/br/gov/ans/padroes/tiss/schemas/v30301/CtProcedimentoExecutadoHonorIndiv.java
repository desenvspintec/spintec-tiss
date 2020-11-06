
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
 * <p>Classe Java de ct_procedimentoExecutadoHonorIndiv complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="ct_procedimentoExecutadoHonorIndiv">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="dataExecucao" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_data"/>
 *         &lt;element name="horaInicial" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="horaFinal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_hora" minOccurs="0"/>
 *         &lt;element name="procedimento" type="{http://www.ans.gov.br/padroes/tiss/schemas}ct_procedimentoDados"/>
 *         &lt;element name="quantidadeExecutada" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_numerico3"/>
 *         &lt;element name="viaAcesso" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_viaDeAcesso" minOccurs="0"/>
 *         &lt;element name="tecnicaUtilizada" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_tecnicaUtilizada" minOccurs="0"/>
 *         &lt;element name="reducaoAcrescimo" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal3-2"/>
 *         &lt;element name="valorUnitario" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="valorTotal" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_decimal8-2"/>
 *         &lt;element name="profissionais" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart"/>
 *                   &lt;element name="codProfissional">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
 *                             &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
 *                           &lt;/choice>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
 *                   &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
 *                   &lt;element name="numeroConselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
 *                   &lt;element name="UF" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
 *                   &lt;element name="CBO" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
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
@XmlType(name = "ct_procedimentoExecutadoHonorIndiv", propOrder = {
    "dataExecucao",
    "horaInicial",
    "horaFinal",
    "procedimento",
    "quantidadeExecutada",
    "viaAcesso",
    "tecnicaUtilizada",
    "reducaoAcrescimo",
    "valorUnitario",
    "valorTotal",
    "profissionais"
})
public class CtProcedimentoExecutadoHonorIndiv {

    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar dataExecucao;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaInicial;
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar horaFinal;
    @XmlElement(required = true)
    protected CtProcedimentoDados procedimento;
    @XmlElement(required = true)
    protected BigInteger quantidadeExecutada;
    protected String viaAcesso;
    protected String tecnicaUtilizada;
    @XmlElement(required = true)
    protected BigDecimal reducaoAcrescimo;
    @XmlElement(required = true)
    protected BigDecimal valorUnitario;
    @XmlElement(required = true)
    protected BigDecimal valorTotal;
    @XmlElement(required = true)
    protected List<CtProcedimentoExecutadoHonorIndiv.Profissionais> profissionais;

    /**
     * Obtém o valor da propriedade dataExecucao.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDataExecucao() {
        return dataExecucao;
    }

    /**
     * Define o valor da propriedade dataExecucao.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDataExecucao(XMLGregorianCalendar value) {
        this.dataExecucao = value;
    }

    /**
     * Obtém o valor da propriedade horaInicial.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraInicial() {
        return horaInicial;
    }

    /**
     * Define o valor da propriedade horaInicial.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraInicial(XMLGregorianCalendar value) {
        this.horaInicial = value;
    }

    /**
     * Obtém o valor da propriedade horaFinal.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoraFinal() {
        return horaFinal;
    }

    /**
     * Define o valor da propriedade horaFinal.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoraFinal(XMLGregorianCalendar value) {
        this.horaFinal = value;
    }

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
     * Obtém o valor da propriedade quantidadeExecutada.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantidadeExecutada() {
        return quantidadeExecutada;
    }

    /**
     * Define o valor da propriedade quantidadeExecutada.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantidadeExecutada(BigInteger value) {
        this.quantidadeExecutada = value;
    }

    /**
     * Obtém o valor da propriedade viaAcesso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getViaAcesso() {
        return viaAcesso;
    }

    /**
     * Define o valor da propriedade viaAcesso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setViaAcesso(String value) {
        this.viaAcesso = value;
    }

    /**
     * Obtém o valor da propriedade tecnicaUtilizada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTecnicaUtilizada() {
        return tecnicaUtilizada;
    }

    /**
     * Define o valor da propriedade tecnicaUtilizada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTecnicaUtilizada(String value) {
        this.tecnicaUtilizada = value;
    }

    /**
     * Obtém o valor da propriedade reducaoAcrescimo.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getReducaoAcrescimo() {
        return reducaoAcrescimo;
    }

    /**
     * Define o valor da propriedade reducaoAcrescimo.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setReducaoAcrescimo(BigDecimal value) {
        this.reducaoAcrescimo = value;
    }

    /**
     * Obtém o valor da propriedade valorUnitario.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    /**
     * Define o valor da propriedade valorUnitario.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorUnitario(BigDecimal value) {
        this.valorUnitario = value;
    }

    /**
     * Obtém o valor da propriedade valorTotal.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    /**
     * Define o valor da propriedade valorTotal.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setValorTotal(BigDecimal value) {
        this.valorTotal = value;
    }

    /**
     * Gets the value of the profissionais property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profissionais property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfissionais().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CtProcedimentoExecutadoHonorIndiv.Profissionais }
     * 
     * 
     */
    public List<CtProcedimentoExecutadoHonorIndiv.Profissionais> getProfissionais() {
        if (profissionais == null) {
            profissionais = new ArrayList<CtProcedimentoExecutadoHonorIndiv.Profissionais>();
        }
        return this.profissionais;
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
     *         &lt;element name="grauParticipacao" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_grauPart"/>
     *         &lt;element name="codProfissional">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
     *                   &lt;element name="cpfContratado" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_CPF"/>
     *                 &lt;/choice>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="nomeProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto70"/>
     *         &lt;element name="conselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_conselhoProfissional"/>
     *         &lt;element name="numeroConselhoProfissional" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto15"/>
     *         &lt;element name="UF" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_UF"/>
     *         &lt;element name="CBO" type="{http://www.ans.gov.br/padroes/tiss/schemas}dm_CBOS"/>
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
        "grauParticipacao",
        "codProfissional",
        "nomeProfissional",
        "conselhoProfissional",
        "numeroConselhoProfissional",
        "uf",
        "cbo"
    })
    public static class Profissionais {

        @XmlElement(required = true)
        protected String grauParticipacao;
        @XmlElement(required = true)
        protected CtProcedimentoExecutadoHonorIndiv.Profissionais.CodProfissional codProfissional;
        @XmlElement(required = true)
        protected String nomeProfissional;
        @XmlElement(required = true)
        protected String conselhoProfissional;
        @XmlElement(required = true)
        protected String numeroConselhoProfissional;
        @XmlElement(name = "UF", required = true)
        protected String uf;
        @XmlElement(name = "CBO", required = true)
        protected String cbo;

        /**
         * Obtém o valor da propriedade grauParticipacao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrauParticipacao() {
            return grauParticipacao;
        }

        /**
         * Define o valor da propriedade grauParticipacao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrauParticipacao(String value) {
            this.grauParticipacao = value;
        }

        /**
         * Obtém o valor da propriedade codProfissional.
         * 
         * @return
         *     possible object is
         *     {@link CtProcedimentoExecutadoHonorIndiv.Profissionais.CodProfissional }
         *     
         */
        public CtProcedimentoExecutadoHonorIndiv.Profissionais.CodProfissional getCodProfissional() {
            return codProfissional;
        }

        /**
         * Define o valor da propriedade codProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link CtProcedimentoExecutadoHonorIndiv.Profissionais.CodProfissional }
         *     
         */
        public void setCodProfissional(CtProcedimentoExecutadoHonorIndiv.Profissionais.CodProfissional value) {
            this.codProfissional = value;
        }

        /**
         * Obtém o valor da propriedade nomeProfissional.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNomeProfissional() {
            return nomeProfissional;
        }

        /**
         * Define o valor da propriedade nomeProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNomeProfissional(String value) {
            this.nomeProfissional = value;
        }

        /**
         * Obtém o valor da propriedade conselhoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConselhoProfissional() {
            return conselhoProfissional;
        }

        /**
         * Define o valor da propriedade conselhoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConselhoProfissional(String value) {
            this.conselhoProfissional = value;
        }

        /**
         * Obtém o valor da propriedade numeroConselhoProfissional.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumeroConselhoProfissional() {
            return numeroConselhoProfissional;
        }

        /**
         * Define o valor da propriedade numeroConselhoProfissional.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumeroConselhoProfissional(String value) {
            this.numeroConselhoProfissional = value;
        }

        /**
         * Obtém o valor da propriedade uf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUF() {
            return uf;
        }

        /**
         * Define o valor da propriedade uf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUF(String value) {
            this.uf = value;
        }

        /**
         * Obtém o valor da propriedade cbo.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCBO() {
            return cbo;
        }

        /**
         * Define o valor da propriedade cbo.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCBO(String value) {
            this.cbo = value;
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
         *         &lt;element name="codigoPrestadorNaOperadora" type="{http://www.ans.gov.br/padroes/tiss/schemas}st_texto14"/>
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
            "codigoPrestadorNaOperadora",
            "cpfContratado"
        })
        public static class CodProfissional {

            protected String codigoPrestadorNaOperadora;
            protected String cpfContratado;

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

        }

    }

}
