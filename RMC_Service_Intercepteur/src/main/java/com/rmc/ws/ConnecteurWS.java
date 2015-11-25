package com.rmc.ws;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;

@WebService
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
public interface ConnecteurWS {

	/**
	 * Gets the msg.
	 * 
	 * @param msg
	 *            the msg
	 * @return the msg
	 */
	String getMsg(String msg);
}
