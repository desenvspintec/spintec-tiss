package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.CtBeneficiarioDados;
import br.gov.ans.padroes.tiss.schemas.CtGuiaCabecalho;
import br.gov.ans.padroes.tiss.schemas.CtmSpSadtSolicitacaoGuia;

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
