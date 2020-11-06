package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface CtPrestadorIdentificacaoI {

	String getCNPJ();

    void setCNPJ(String value);

    String getCPF();

    void setCPF(String value);

    String getCodigoPrestadorNaOperadora();

    void setCodigoPrestadorNaOperadora(String value);
}
