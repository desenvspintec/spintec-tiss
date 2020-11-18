package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.v30301.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.v30301.CtGuiaCabecalho;
import br.gov.ans.padroes.tiss.schemas.v30301.CtmSpSadtSolicitacaoGuia;

import javax.xml.datatype.XMLGregorianCalendar;
import java.util.List;

public interface CtmSpSadtSolicitacaoGuiaI {
    CtGuiaCabecalho getCabecalhoSolicitacao();
    String getNumeroGuiaPrincipal();
    CtBeneficiarioDados getDadosBeneficiario();
    CtmSpSadtSolicitacaoGuia.DadosSolicitante getDadosSolicitante();
    String getCaraterAtendimento();
    XMLGregorianCalendar getDataSolicitacao();
    String getIndicacaoClinica();
    List<CtmSpSadtSolicitacaoGuia.ProcedimentosSolicitados> getProcedimentosSolicitados();
    CtmSpSadtSolicitacaoGuia.DadosExecutante getDadosExecutante();
    CtmSpSadtSolicitacaoGuia.AnexoClinico getAnexoClinico();
    String getObservacao();
}
