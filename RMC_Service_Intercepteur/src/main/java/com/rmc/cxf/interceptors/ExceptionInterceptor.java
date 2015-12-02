package com.rmc.cxf.interceptors;

import javax.xml.namespace.QName;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.common.injection.NoJSR250Annotations;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.apache.log4j.Logger;

import com.rmc.exception.RmcFunctionalException;

@NoJSR250Annotations
public class ExceptionInterceptor extends AbstractSoapInterceptor {

	/** The Constant LOG. */
	private static final Logger LOG = Logger
			.getLogger(ExceptionInterceptor.class);

	public ExceptionInterceptor() {
		super(Phase.PRE_LOGICAL);
	}

	public void handleMessage(SoapMessage message) throws Fault {
		Fault fault = (Fault) message.getContent(Exception.class);
		Throwable ex = fault.getCause();
		LOG.error("CAUGHT A FAULT");
		if (ex instanceof RmcFunctionalException) {
			RmcFunctionalException e = (RmcFunctionalException) ex;
			generateSoapFault(fault, e);
		} else {
			generateSoapFault(fault, null);
		}
	}

	private void generateSoapFault(Fault fault, Exception e) {
		fault.setFaultCode(createQName(8));
		fault.setMessage("Business Exception");
	}

	private static QName createQName(int errorCode) {
		return new QName("rmc.com", String.valueOf(errorCode));
	}
}
