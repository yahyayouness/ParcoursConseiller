package com.rmc.exception;

import com.rmc.context.StaticContextAccessor;
import com.rmc.factory.RmcExceptionFactory;

/**
 * Classe à etendre pour bénéficier des mécanismes des gestion des exceptions.
 * 
 * @author yyahia
 * 
 */
public class ExceptionUtils {

	/*************************************** INPUTS **********************************/


	/**
	 * Différents type d'exception (Technique ,et fonctionnelle)
	 * 
	 * @author yyahia
	 * 
	 */
	public enum ExceptionType {
		ERROR, WARNING
	}


	/******************************** PUBLIC TOOLS **** *******************************/

	/**
	 * Permet de créer le message d'exception.
	 * 
	 * @param codeErreur
	 * @param libelleParams
	 * @return le message.
	 */
	protected String creerMessage(final String codeErreur,
			final Object[] libelleParams) {

		// Message obtenu par Spring
		String message = getMessage(codeErreur, libelleParams);
		return message;
	}

	/**
	 * Récupération du message.
	 * 
	 * @param code
	 *            le code de l'exception.
	 * @param libelleParams
	 *            les params de l'exception
	 * @return le message
	 */
	public static String getMessage(final String code,
			final Object[] libelleParams) {
		return StaticContextAccessor.getBean(RmcExceptionFactory.class).getMessage(code, libelleParams);
	}

}
