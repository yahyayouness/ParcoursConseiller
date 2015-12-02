package com.rmc.ws.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.edf.psc._0022.consulterinfossociete.MosaiqueControllerPort;
import fr.edf.psc._0022.consulterinfossociete.RechercheMosaique;
import fr.edf.psc._0022.consulterinfossociete.RechercheMosaiqueInput;
import fr.edf.psc._0022.consulterinfossociete.RechercheMosaiqueOutput;



@Service
public class InfosSocieteClient {

	/** Le connecteur . */
	@Autowired
	private MosaiqueControllerPort connecteurWS;

	/**
	 * Appel au service Infos Societe
	 */
	public RechercheMosaiqueOutput chercherInfosSociete(final String siret) {

		// Init input param
		RechercheMosaiqueInput rechercheMosaiqueInput = new RechercheMosaiqueInput();
		RechercheMosaique mosaique = new RechercheMosaique();
		mosaique.setSIRET(siret);
		rechercheMosaiqueInput.setRechercheMosaique(mosaique);

		// Appel du service
		RechercheMosaiqueOutput infos = connecteurWS.rechercheMosaique(
				rechercheMosaiqueInput);
		
		return infos;
	}
}
