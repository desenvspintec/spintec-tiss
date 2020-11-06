package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface CtContratadoDadosI {

	String getNomeContratado();

    String getCnpjContratado();

    String getCpfContratado();

    String getCodigoPrestadorNaOperadora();

    void setNomeContratado(String value);

    void setCnpjContratado(String value);

    void setCpfContratado(String value);

    void setCodigoPrestadorNaOperadora(String value);
}
