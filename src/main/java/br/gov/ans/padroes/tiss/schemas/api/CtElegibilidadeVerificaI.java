package br.gov.ans.padroes.tiss.schemas.api;

import javax.xml.datatype.XMLGregorianCalendar;

public interface CtElegibilidadeVerificaI {

	CtContratadoDadosI getDadosPrestador();

    String getNumeroCarteira();

    void setNumeroCarteira(String value);

    String getNomeBeneficiario();

    void setNomeBeneficiario(String value);

    String getNumeroCNS();

    void setNumeroCNS(String value);

    byte[] getIdentificadorBeneficiario();

    void setIdentificadorBeneficiario(byte[] value);

    XMLGregorianCalendar getValidadeCarteira();

    void setValidadeCarteira(XMLGregorianCalendar value);
}
