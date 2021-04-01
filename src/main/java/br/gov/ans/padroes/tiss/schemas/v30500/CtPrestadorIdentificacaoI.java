package br.gov.ans.padroes.tiss.schemas.v30500;

public interface CtPrestadorIdentificacaoI {
    String getCNPJ();

    void setCNPJ(String value);

    String getCPF();

    void setCPF(String value);

    String getCodigoPrestadorNaOperadora();

    void setCodigoPrestadorNaOperadora(String value);
}
