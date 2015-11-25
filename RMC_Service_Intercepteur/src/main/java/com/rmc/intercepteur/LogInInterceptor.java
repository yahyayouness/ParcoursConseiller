package com.rmc.intercepteur;


import org.apache.cxf.common.logging.LogUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.interceptor.LoggingMessage;
import org.apache.cxf.message.Message;
import org.apache.cxf.phase.AbstractPhaseInterceptor;
import org.apache.cxf.phase.Phase;

import com.rmc.service.calculateur.CalculTempService;

public class LogInInterceptor extends AbstractPhaseInterceptor<Message> {

	/** The Constant LOG. */
	private static final java.util.logging.Logger LOG = LogUtils
			.getLogger(LogInInterceptor.class);

	public LogInInterceptor() {
		super(Phase.RECEIVE);
	}

	@Override
	public void handleMessage(Message message) throws Fault {
		
		CalculTempService.getInstance().start();
		
		  if (message.containsKey(LoggingMessage.ID_KEY)) {
	            return;
	        }
	        String id = (String)message.getExchange().get(LoggingMessage.ID_KEY);
	        if (id == null) {
	            id = LoggingMessage.nextId();
	            message.getExchange().put(LoggingMessage.ID_KEY, id);
	        }
	        message.put(LoggingMessage.ID_KEY, id);
	        
	        final LoggingMessage buffer 
	            = new LoggingMessage("Contenu de la requete \n------------------------------------------------------", id);

	        Integer responseCode = (Integer)message.get(Message.RESPONSE_CODE);
	        if (responseCode != null) {
	            buffer.getResponseCode().append(responseCode);
	        }

	        String encoding = (String)message.get(Message.ENCODING);

	        if (encoding != null) {
	            buffer.getEncoding().append(encoding);
	        }
	        String httpMethod = (String)message.get(Message.HTTP_REQUEST_METHOD);
	        if (httpMethod != null) {
	            buffer.getHttpMethod().append(httpMethod);
	        }
	        String ct = (String)message.get(Message.CONTENT_TYPE);
	        if (ct != null) {
	            buffer.getContentType().append(ct);
	        }
	        Object headers = message.get(Message.PROTOCOL_HEADERS);

	        if (headers != null) {
	            buffer.getHeader().append(headers);
	        }
	        String uri = (String)message.get(Message.REQUEST_URL);
	        if (uri != null) {
	            buffer.getAddress().append(uri);
	            String query = (String)message.get(Message.QUERY_STRING);
	            if (query != null) {
	                buffer.getAddress().append("?").append(query);
	            }
	        }
	            
	}

	protected java.util.logging.Logger getLogger() {
		return LOG;
	}
}