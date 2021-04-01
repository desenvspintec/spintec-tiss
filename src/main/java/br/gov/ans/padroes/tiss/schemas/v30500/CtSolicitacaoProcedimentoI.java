package br.gov.ans.padroes.tiss.schemas.v30500;

public interface CtSolicitacaoProcedimentoI {
    CtmSpSadtSolicitacaoGuia getSolicitacaoSPSADT();
    CtmInternacaoSolicitacaoGuia getSolicitacaoInternacao();
    CtmProrrogacaoSolicitacaoGuia getSolicitacaoProrrogacao();
    CtoOdontoSolicitacaoGuia getSolicitacaoOdontologia();
}