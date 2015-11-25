package com.rmc.exception;

import com.rmc.exception.ExceptionUtils.ExceptionType;

/**
 * Classe qui définit une exception technique.
 * 
 * @author yyahia
 * 
 */
public final class RmcTechnicalException extends RmcException {

	/**
	 * Id de serialisation.
	 */
	private static final long serialVersionUID = 1L;

	/******************************** CONSTRUCTEURS *********************************/
	
	public RmcTechnicalException(String code, String libelle) {
		super(ExceptionType.ERROR, code, libelle);
	}

}
