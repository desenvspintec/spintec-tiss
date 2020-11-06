package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface DestinoI {

	String getRegistroANS();

    void setRegistroANS(String registroANS);

    CtPrestadorIdentificacaoI getIdentificacaoPrestador();
}
