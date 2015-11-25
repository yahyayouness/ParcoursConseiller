package com.rmc.ws.accueil.utils;

import com.rmc.ws.accueil.dto.InfosSociete;

import fr.edf.psc._0022.consulterinfossociete.ETABLISSEMENT;
import fr.edf.psc._0022.consulterinfossociete.RechercheMosaiqueOutput;

/**
 * Classe utilitaire permettant de faire des copies d'objet.
 * 
 * @author yyahia
 * 
 */
public final class UtilsCopy {

	public static InfosSociete copy(RechercheMosaiqueOutput out) {

		// FIXME nullite et cas d erreur
		final ETABLISSEMENT etablissement = out
				.getConsulterInfosSocieteResponse().getDonneesRetour()
				.getMosaiqueMessageOut().getETABLISSEMENT().get(0);
		InfosSociete temp = new InfosSociete();
		return temp;
	}
}
