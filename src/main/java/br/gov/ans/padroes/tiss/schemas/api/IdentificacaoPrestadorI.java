package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

public interface IdentificacaoPrestadorI {

	String getCodigoPrestadorNaOperadora();

    String getCNPJ();

    void setCNPJ(String cnpj);

    String getCPF();

    void setCPF(String cpf);
}
