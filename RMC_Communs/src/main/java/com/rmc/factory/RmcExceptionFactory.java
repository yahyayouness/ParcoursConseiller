package com.rmc.factory;

import java.util.Locale;

import org.apache.log4j.Logger;
import org.springframework.context.MessageSourceResolvable;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

import com.rmc.exception.RmcFunctionalException;
import com.rmc.exception.RmcTechnicalException;
import com.rmc.resolver.CustomMessageSourceResolvable;

/**
 * Factory qui gère la création des rmc exceptions.
 * 
 * @author yyahia
 * 
 */
// @Service
public class RmcExceptionFactory {

	/** LOGGER factory des exceptions. */
	private static final Logger LOGGER = Logger
			.getLogger(RmcExceptionFactory.class);

	/** The message source. */

	private ReloadableResourceBundleMessageSource messageSource;

	// @Autowired
	// @Qualifier("messageSource")
	public void setMessageSource(
			ReloadableResourceBundleMessageSource messageSource) {
		this.messageSource = messageSource;
	}

	/**
	 * Crée une exception technique.
	 * 
	 * @param code
	 *            the code
	 * @param libelle
	 *            the libelle
	 * @return the new technical exception
	 */
	public RmcTechnicalException getNewTechnicalException(final String code,
			Object[] libelleParams, final Throwable throwable) {

		// Récupération du message.
		String message = getMessage(code, libelleParams);

		LOGGER.debug("message:" + message);

		// Retourne une nouvelle exception
		return new RmcTechnicalException(code, message);
	}

	/**
	 * Gets the new functional exception.
	 * 
	 * @param code
	 *            the code
	 * @param libelle
	 *            the libelle
	 * @return the new functional exception
	 */
	public RmcFunctionalException getNewFunctionalException(final String code,
			Object[] libelleParams, final Throwable throwable) {
		String message = getMessage(code, libelleParams);
		LOGGER.debug("message:" + message);
		// Retourne une nouvelle exception
		return new RmcFunctionalException(code, message);
	}

	/**
	 * Formatte le message selon les codes et params .
	 * 
	 * @param code
	 * @param libelleParams
	 * @return le message
	 */
	public String getMessage(final String code, Object[] libelleParams) {

		// Récupération du message avec une Locale en France.
		MessageSourceResolvable resolvable = new CustomMessageSourceResolvable(
				code, libelleParams);
		return messageSource.getMessage(resolvable, Locale.FRANCE);
	}

}
