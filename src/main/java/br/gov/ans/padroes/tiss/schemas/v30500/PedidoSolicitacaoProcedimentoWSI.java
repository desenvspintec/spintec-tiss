package br.gov.ans.padroes.tiss.schemas.v30500;

public interface PedidoSolicitacaoProcedimentoWSI extends MensagemTissWSI {

    CtSolicitacaoProcedimento getSolicitacaoProcedimento();

    String getHash();
}