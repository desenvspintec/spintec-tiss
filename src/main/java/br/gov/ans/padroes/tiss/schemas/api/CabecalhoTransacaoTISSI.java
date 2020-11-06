package br.gov.ans.padroes.tiss.schemas.api;

import br.gov.ans.TipoTransacaoTiss;

public interface CabecalhoTransacaoTISSI {

	TipoTransacaoTiss getTransacao();

    String getCodigoPrestadorOrigem();

    String getCnpjPrestadorOrigem();

    String getCpfPrestadorOrigem();

    String getNrANSDestino();

    String getVersaoTiss();

    void setVersaoTiss(String versao);

    DestinoI getDestino();

    IdentificacaoTransacaoI getIdentificacaoTransacao();

    String getFalhaNegocio();

    OrigemI getOrigem();

    //CtLoginSenhaI getLoginSenhaPrestador();
}
