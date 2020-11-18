package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.padroes.tiss.schemas.v30301.CtmInternacaoSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.v30301.CtmProrrogacaoSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.v30301.CtmSpSadtSolicitacaoGuia;
import br.gov.ans.padroes.tiss.schemas.v30301.CtoOdontoSolicitacaoGuia;

public interface CtSolicitacaoProcedimentoI {
    CtmSpSadtSolicitacaoGuia getSolicitacaoSPSADT();
    CtmInternacaoSolicitacaoGuia getSolicitacaoInternacao();
    CtmProrrogacaoSolicitacaoGuia getSolicitacaoProrrogacao();
    CtoOdontoSolicitacaoGuia getSolicitacaoOdontologia();
}
