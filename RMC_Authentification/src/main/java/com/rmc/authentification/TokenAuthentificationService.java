package com.rmc.authentification;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.SignatureException;

import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.rmc.annotations.Loggable;
import com.rmc.authentification.dto.*;

@Path("/auth")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class TokenAuthentificationService {

	/**
	 * Logger d'authentification.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(TokenAuthentificationService.class);
	/**
	 * Requete http.
	 */
	@Context
	private HttpServletRequest request;

	private final Map<String, List<String>> userDb = new HashMap<>();

	public TokenAuthentificationService() {
		userDb.put("yahya", Arrays.asList("yahya", "youness"));
		userDb.put("sylvain", Arrays.asList("sylvain", "boudes"));
	}

	/**
	 * Cree un token pour l'emetteur de la demande.
	 * 
	 * @return
	 * @throws ServletException
	 */
	@Loggable
	@POST
	@Path("login")
	public LoginResponse creerToken( User login) throws ServletException {

		if (login == null || !userDb.containsKey(login.getName())) {
			throw new ServletException("Invalid login");
		}
		LoginResponse loginResponse = new LoginResponse(Jwts.builder()
				.setSubject(login.getName())
				.claim("roles", userDb.get(login.getName()))
				.setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact());
		return loginResponse;
	}

	@GET
	@Path("token")
	public TokenValidity validerToken(
			@HeaderParam("Authorization") String authString)
			throws ServletException {

		final String authHeader = authString;

		if (authHeader == null || !authHeader.startsWith("Bearer ")) {
			throw new ServletException(
					"Missing or invalid Authorization header.");
		}

		final String token = authHeader.substring(7); 
														

		try {
			final Claims claims = Jwts.parser().setSigningKey("secretkey")
					.parseClaimsJws(token).getBody();
			request.setAttribute("claims", claims);
		} catch (final SignatureException e) {
			throw new ServletException("Invalid token.");
		}

		return new TokenValidity();
	}

}
