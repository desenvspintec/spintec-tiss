package br.gov.ans.padroes.tiss.schemas.v30500;

public interface IdentificacaoPrestadorI {
    String getCodigoPrestadorNaOperadora();

    String getCNPJ();

    void setCNPJ(String cnpj);

    String getCPF();

    void setCPF(String cpf);
}
