package com.rmc.resolver;

import org.springframework.context.MessageSourceResolvable;

/**
 * Resolver customisé utilisé par le bean message source pour récupération des
 * messages.
 * 
 * @author yyahia
 * 
 */
public final class CustomMessageSourceResolvable implements
		MessageSourceResolvable {

	/*************************************** INPUTS **********************************/

	/** Message par défault quand le message n'est pas trouvé. */
	public static final String DEFAULT_MESSAGE = "message par défaut";

	/** Le code de l'exception. */
	private String code;

	/** Les arguments permettant de constuire le message. */
	private Object[] args;

	/**
	 * Instantie un nouveau <custom message source resolvable>.
	 * 
	 * @param code
	 *            le code du message
	 * @param args
	 *            les arguments du messages.
	 */
	public CustomMessageSourceResolvable(final String code, final Object[] args) {
		super();
		this.code = code;
		if (args == null) {
			this.args = new String[] {};
		} else {
			this.args = args.clone();
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.MessageSourceResolvable#getCodes()
	 */
	@Override
	public String[] getCodes() {
		String[] liste = new String[] { code,
				code.substring(0, code.length() - 1),
				code.substring(0, code.length() - 2) };
		// for (String unElt : liste) {
		// LOGGER.debug("elt:" + unElt);
		// }
		return liste;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.context.MessageSourceResolvable#getArguments()
	 */
	@Override
	public Object[] getArguments() {
		return args;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.springframework.context.MessageSourceResolvable#getDefaultMessage()
	 */
	@Override
	public String getDefaultMessage() {
		return DEFAULT_MESSAGE;
	}

}
