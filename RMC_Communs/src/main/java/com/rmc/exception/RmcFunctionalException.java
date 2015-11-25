package com.rmc.exception;

import com.rmc.exception.ExceptionUtils.ExceptionType;

/**
 * Classe qui définit une exception fonctionnelle.
 * 
 * @author yyahia
 * 
 */
public  class RmcFunctionalException extends RmcException {

	/**
	 * Serialisation ID.
	 */
	private static final long serialVersionUID = 1L;

	/******************************** CONSTRUCTEURS *********************************/

	/**
	 * Instantie une exception fonctionnelle.
	 * 
	 * @param code
	 *            the code
	 * @param libelle
	 *            the libelle
	 */
	public RmcFunctionalException(final String code, final String libelle) {
		super(ExceptionType.ERROR, code, libelle);
	}
}
