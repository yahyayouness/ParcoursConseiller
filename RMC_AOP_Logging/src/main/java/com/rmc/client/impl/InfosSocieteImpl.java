package com.rmc.client.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.rmc.annotations.Loggable;
import com.rmc.client.interfaces.IInfosSociete;
import com.rmc.exception.ExceptionUtils;
import com.rmc.exception.fonctionnelle.accueil.SiretNotValidException;

/**
 * Service pour gérer les clients et valider l'ensemble des aspects.
 * 
 * @author yyahia
 * 
 */
@Component
public class InfosSocieteImpl  implements IInfosSociete {

	/**
	 * Exemple de SIRET.
	 */
	private static final String _SIRET = "404 833 048 00022";
	/**
	 * Logger.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(InfosSocieteImpl.class);

	/**
	 * Constructeur par défault.
	 */
	public InfosSocieteImpl() {
	}

	@Loggable
	public void chercherInfosSociete(String Siret) {
		LOG.info("chercherInfosSociete() is running ");
	}

	@Loggable
	public String chercherInfosSocieteAvecValeurRetour(String Siret) {
		LOG.info("chercherInfosSocieteAvecValeurRetour() is running ");
		return _SIRET;
	}

	@Loggable
	public void chercherInfosSocieteThrowException(String Siret)
			throws SiretNotValidException {
		LOG.info("chercherInfosSocieteThrowException() is running ");
		Object[] libelleParams = new Object[] { _SIRET };

		final String message = ExceptionUtils.getMessage("XXX-XXX-TIXX-E0000", libelleParams);
		throw new SiretNotValidException("XXX-XXX-TIXX-E0000", message);
	}

	// @Loggable
	public void chercherInfosSocieteAround(String name) {
		LOG.info("chercherInfosSocieteAround() is running, args : " + name);
	}

}