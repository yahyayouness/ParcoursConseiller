package com.rmc.ws.exception.handler;

import java.util.HashMap;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;

import com.rmc.exception.RmcException;
import com.rmc.exception.fonctionnelle.accueil.SiretNotValidException;

public class RmcExceptionHandler implements
		ExceptionMapper<RmcException> {
	/**
	 * Liste de mapping d'exception avec leur status.
	 */
	private static HashMap<String, Response.Status> exceptionStatus = new HashMap<String, Response.Status>();

	static {
		exceptionStatus.put(SiretNotValidException.class.getSimpleName(),
				Status.BAD_REQUEST);
	}

	@Override
	public Response toResponse(RmcException exception) {
		
		//init status de retour
		Status status = Status.BAD_REQUEST;
		
		// Chercher dans la Map les status correspondant à l'exception.
		if (null != exception) {
			status = exceptionStatus.get(exception.getClass().getSimpleName());
		}

		return Response.status(status).entity(exception).type("application/json").build();
	}
}
