package com.rmc.intercepteur;

import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import com.rmc.service.calculateur.CalculTempService;

public class LogOutInterceptor extends AbstractPhaseInterceptor<Message> {

	private static final java.util.logging.Logger LOG = LogUtils
			.getLogger(LogOutInterceptor.class);

	public LogOutInterceptor() {
		super(Phase.SEND);
	}

	public void handleMessage(Message message) throws Fault {
		String uri = (String) message.get(Message.REQUEST_URL);

		CalculTempService.getExecTime(uri, uri);
	}

}
