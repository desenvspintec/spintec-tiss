package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface OrigemI {

	IdentificacaoPrestadorI getIdentificacaoPrestador();

    String getRegistroANS();

    void setRegistroANS(String value);
}
