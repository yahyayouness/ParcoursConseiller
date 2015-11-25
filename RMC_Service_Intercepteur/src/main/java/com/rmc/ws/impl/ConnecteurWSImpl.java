package com.rmc.ws.impl;

import javax.jws.WebService;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rmc.ws.ConnecteurWS;
import com.rmc.ws.service.EchoService;



@WebService(endpointInterface = "com.rmc.ws.ConnecteurWS", targetNamespace = "http://com.rmc.ws.service", name = "ConnecteurWS")
public final class ConnecteurWSImpl implements ConnecteurWS {

	/** The Constant NB_2. */
	private static final int NB_2 = 6;

	/** The Constant NB_1. */
	private static final int NB_1 = 3;

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger
			.getLogger(ConnecteurWSImpl.class);

	/** The echo service. */
	private EchoService echoService;

	/**
	 * Gets the echo service.
	 * 
	 * @return the echo service
	 */
	public EchoService getEchoService() {
		return echoService;
	}

	/**
	 * Sets the echo service.
	 * 
	 * @param echoService
	 *            the new echo service
	 */
	public void setEchoService(final EchoService echoService) {
		this.echoService = echoService;
	}

	/**
	 * Gets the context.
	 * 
	 * @return the context
	 */
	public ApplicationContext getContext() {
		return new ClassPathXmlApplicationContext("applicationContextIntercepteur.xml");
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.total.ecotaxe.ws.ConnecteurWS#getMsg(java.lang.String)
	 */
	@Override
	public String getMsg(final String msg) {
		LOGGER.info("message: " + msg);
		echoService = (EchoService) getContext().getBean("echoService");
		LOGGER.info("echoService: " + echoService);
		final int reponse = echoService.add(NB_1, NB_2);
		return msg + " " + reponse;
	}

}
