package com.rmc.ws.accueil;

import javax.servlet.ServletException;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;

import com.rmc.annotations.Loggable;
import com.rmc.exception.ExceptionUtils;
import com.rmc.exception.fonctionnelle.accueil.SiretNotValidException;
import com.rmc.ws.accueil.dto.InfosSociete;
import com.rmc.ws.accueil.utils.UtilsCopy;
import com.rmc.ws.client.InfosSocieteClient;

import fr.edf.psc._0022.consulterinfossociete.RechercheMosaiqueOutput;

@Path("/infos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ConsulterInfosSocieteService {

	/**
	 * Liste de code des exceptions remontées par le service.
	 */
	private static final String XXX_XXX_TIXX_E0000 = "XXX-XXX-TIXX-E0000";
	/**
	 * 
	 * 
	 * Service client de recherche de societe.
	 */
	@Autowired
	private InfosSocieteClient consulterInfosSocieteWS;

	/**
	 * Cree un token pour l'emetteur de la demande.
	 * 
	 * @return
	 * @throws ServletException
	 * @throws SiretNotValidException
	 */
	@Loggable
	@GET
	@Path("siret/{num}/")
	public InfosSociete getInfosSociete(
			final @PathParam(value = "num") String siret)
			throws ServletException, SiretNotValidException {

		if (null == siret || siret.trim().isEmpty()) {

			Object[] params = new Object [] {siret};
			final String message = ExceptionUtils.getMessage(
					XXX_XXX_TIXX_E0000, params);
			throw new SiretNotValidException(XXX_XXX_TIXX_E0000, message);
		}
		final RechercheMosaiqueOutput reponse = consulterInfosSocieteWS
				.chercherInfosSociete(siret);

		// FIXME check erreurs de copy de donnée
		final InfosSociete infosSociete = UtilsCopy.copy(reponse);

		return infosSociete;
	}
}
