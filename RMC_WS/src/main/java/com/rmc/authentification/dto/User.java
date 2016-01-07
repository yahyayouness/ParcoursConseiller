package com.rmc.authentification.dto;

//@com.fasterxml.jackson.annotation.JsonIdentityInfo(generator = com.voodoodyne.jackson.jsog.JSOGGenerator.class)
public class User {

	/**
	 * Nom de l'utilisateur.
	 */
	private String name;

	/**
	 * Password de l'utilisateur.
	 */
	private String password;

	/**
	 * Constructeur par défault.
	 */
	public User() {
	}

	/**
	 * 
	 * @param name
	 * @param password
	 */
	public User(String name, String password) {
		super();
		this.name = name;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + "]";
	}

	
}
