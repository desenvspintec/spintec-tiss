package br.gov.ans.padroes.tiss.schemas.v30500;

public interface OrigemI {
    IdentificacaoPrestadorI getIdentificacaoPrestador();

    String getRegistroANS();

    void setRegistroANS(String value);
}
