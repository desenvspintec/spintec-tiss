package com.spin.verificaelegibilidade.tiss.client.config;

import javax.xml.namespace.QName;

public interface MensagemTissWSConfig<PortType, Response, Mensagem> {
	
    Class<PortType> getTissPortTypeClass();

    String getUrlWs();

    String getUrlWsdl();

    QName getServiceName();

    QName getPortName();

    InterfaceTissWS<PortType, Response> getCallerFunciton(Mensagem mensagem);
}
