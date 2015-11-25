package com.rmc.ws.service;

import org.springframework.stereotype.Service;

@Service("echoService")
public final class EchoService {

	/**
	 * Propose un service d'addition.
	 * 
	 * @param unNombre
	 *            un nombre
	 * @param unAutreNombre
	 *            un autre nombre
	 * @return int
	 */
	public int add(final int unNombre, final int unAutreNombre) {
		return unNombre + unAutreNombre;
	}
}
