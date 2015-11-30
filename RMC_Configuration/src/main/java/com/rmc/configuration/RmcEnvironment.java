package com.rmc.configuration;

public enum RmcEnvironment {
	
	PRD("prd", "production"),
	REC("rec", "recette"),
	DEV("dev", "development"),
	DEVLOCAL("devlocal", "devlocal");
	
	/** Nom de l'environnement*/
	private String envName;
	
	/** Chemin relatif des fichiers de properties associés ŕ l'environnement */ 
	private String path;
	
	/** Constructeur privé */
	private RmcEnvironment(String envName, String path) {
		this.envName = envName;
		this.path = path;
	}

	/** Getter pour le nom de l'environnement */
	public String getEnvName() {
		return envName;
	}
	
	/** Getter pour le chemin du fichier de propriété */
	public String getPath() {
		return path;
	}
}
