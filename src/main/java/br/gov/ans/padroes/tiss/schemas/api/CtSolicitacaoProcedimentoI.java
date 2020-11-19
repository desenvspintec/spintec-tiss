package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.CtmInternacaoSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.CtmProrrogacaoSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.CtmSpSadtSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.CtoOdontoSolicitacaoGuia;

public interface CtSolicitacaoProcedimentoI {
    CtmSpSadtSolicitacaoGuia getSolicitacaoSPSADT();
    CtmInternacaoSolicitacaoGuia getSolicitacaoInternacao();
    CtmProrrogacaoSolicitacaoGuia getSolicitacaoProrrogacao();
    CtoOdontoSolicitacaoGuia getSolicitacaoOdontologia();
}
