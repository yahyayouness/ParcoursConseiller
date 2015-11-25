package com.rmc.intercepteur.ws;

import javax.jws.WebService;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.springframework.stereotype.Service;

@WebService
@Service
@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
public class SearchSirhetTestWsImpl implements SearchSiretTestWs {

	@Override
	public String searchSiret(String numSirhet) {
		System.out.println("je cherche le sirhet");
		return "8738787878787";
	}

	
}
