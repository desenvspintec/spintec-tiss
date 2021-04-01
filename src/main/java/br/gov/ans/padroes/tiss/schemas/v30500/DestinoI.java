package br.gov.ans.padroes.tiss.schemas.v30500;

public interface DestinoI {
    String getRegistroANS();

    void setRegistroANS(String registroANS);

    CtPrestadorIdentificacaoI getIdentificacaoPrestador();
}
