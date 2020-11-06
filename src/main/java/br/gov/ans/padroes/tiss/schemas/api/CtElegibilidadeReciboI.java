package com.spin.verificaelegibilidade.tiss.br.gov.ans.padroes.tiss.schemas.api;

import javax.xml.datatype.XMLGregorianCalendar;

public interface CtElegibilidadeReciboI {

	String getRegistroANS();

    void setRegistroANS(String value);

    String getNumeroCarteira();

    void setNumeroCarteira(String value);

    XMLGregorianCalendar getValidadeCarteira();

    void setValidadeCarteira(XMLGregorianCalendar value);

    String getNomeBeneficiario();

    void setNomeBeneficiario(String value);

    String getNumeroCNS();

    void setNumeroCNS(String value);

    byte[] getIdentificadorBeneficiario();

    void setIdentificadorBeneficiario(byte[] value);

    DmSimNaoI getRespostaSolicitacao();

    MotivosNegativaI<?> getMotivosNegativa();
}
