package com.rmc.authentification.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

//@XmlRootElement
public class Token {
	String token;

	public Token(@JsonProperty("token") String token) {
		this.token = token;
	}

	public String getToken() {
		return token;
	}
}
