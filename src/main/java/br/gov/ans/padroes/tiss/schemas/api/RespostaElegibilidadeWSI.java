package br.gov.ans.padroes.tiss.schemas.api;

public interface RespostaElegibilidadeWSI {

	CabecalhoTransacaoTISSI getCabecalho();

    CtRespostaElegibilidadeI getRespostaElegibilidade();

    String getHash();

    void setHash(String value);
}
