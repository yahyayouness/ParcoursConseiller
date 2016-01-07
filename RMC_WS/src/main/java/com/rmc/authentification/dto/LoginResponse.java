package com.rmc.authentification.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class LoginResponse {
	public String token;

	public LoginResponse(final String token) {
		this.token = token;
	}
}
