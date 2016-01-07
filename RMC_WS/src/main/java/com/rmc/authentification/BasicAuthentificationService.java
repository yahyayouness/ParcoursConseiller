package com.rmc.authentification;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import sun.misc.BASE64Decoder;


@Path("/check")
public class BasicAuthentificationService {

	/**
	 * Logger d'authentification.
	 */
	private static final Logger LOG = LoggerFactory.getLogger(BasicAuthentificationService.class);

	/**
	 * Requete http.
	 */
	@Context
	private HttpServletRequest request;

	/**
	 * Testing http Header.
	 * 
	 * @return
	 */
	@GET
	@Path("basic")
	@Produces(MediaType.TEXT_PLAIN)
	public String authentificationBasicHTTPHeader() {

		String decoded;
		try {
			// Récupération de l'autorisation du header.
			String header = request.getHeader("authorization");

			// Récupération de la donnée cryptée
			String data = header.substring(header.indexOf(" ") + 1);

			// Decodage de la donnée cryptée
			byte[] bytes = new BASE64Decoder().decodeBuffer(data);
			decoded = new String(bytes);

			LOG.info(decoded);

		} catch (Exception e) {
			decoded = "Authentificaiton non autorisée";
		}

		return decoded;
	}

	@GET
	@Path("basic/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public String verifierUtilisateurById(@PathParam("id") Integer orderId,
			@HeaderParam("Authorization") String authString) {

		if (!isUserAuthenticated(authString)) {
			return "{\"erreur\":\"Utilisateur non authentifié\"}";
		}
		return "Succes";
	}

	/**
	 * Vérifie si l'utilisateur est connecté.
	 * 
	 * @param authString
	 *            : donnée d'authentification
	 * @return true si utilisateur authentifie false sinon
	 */
	private boolean isUserAuthenticated(String authString) {

		String decodedAuth = "";
		String[] authParts = authString.split("\\s+");
		String authInfo = authParts[1];
		// Decode the data back to original string
		byte[] bytes = null;
		try {
			bytes = new BASE64Decoder().decodeBuffer(authInfo);
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
		decodedAuth = new String(bytes);
		LOG.info(decodedAuth);

		/**
		 * Appel a Gardian pour vérifier les données utilisateurs.
		 * 
		 */

		return true;
	}

}
