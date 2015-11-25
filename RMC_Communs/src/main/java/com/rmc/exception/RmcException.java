package com.rmc.exception;

import com.rmc.exception.ExceptionUtils.ExceptionType;

/**
 * Classe mère des exceptions du projet qui définit le code , type et libelle
 * d'exception.
 * 
 * @author yyahia
 * 
 */
public abstract class RmcException extends Exception {

	/*************************************** INPUTS **********************************/

	/** La Constante serialVersionUID. */
	private static final long serialVersionUID = -4708581767234753374L;

	/** Le type de l'exception. */
	private ExceptionType type;

	/** Le code de l'exception. */
	private String code;

	/** Le libelle de l'exception. */
	private String libelle;

	/******************************** CONSTRUCTEURS ***********************************/

	/**
	 * Instantiates a new rmc exception.
	 * 
	 * @param code
	 *            the code
	 * @param libelle
	 *            the libelle
	 */
	public RmcException(final ExceptionType type, final String code,
			final String libelle) {
		super();
		this.type = type;
		this.code = code;
		this.libelle = libelle;
	}

	public RmcException(final String code, final String libelle) {

		super();

		this.code = code;
		this.type = ExceptionType.ERROR;
		this.libelle = libelle;

	}
	/******************************** GETTERS & SETTERS *******************************/

	/**
	 * Récupère le libelle de l'exception.
	 * 
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}

	/**
	 * Sets le libelle.
	 * 
	 * @param libelle
	 *            the new libelle
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	/**
	 * Gets the type.
	 * 
	 * @return the type
	 */
	public ExceptionType getType() {
		return type;
	}

	/**
	 * Gets the code.
	 * 
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * Sets the code.
	 * 
	 * @param code
	 *            the new code
	 */
	public void setCode(final String code) {
		this.code = code;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Throwable#toString()
	 */
	@Override
	public String toString() {
		return "rmcException [code=" + code + ", libelle=" + libelle + "]";
	}

}
