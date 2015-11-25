package com.rmc.client.interfaces;

import com.rmc.exception.fonctionnelle.accueil.SiretNotValidException;


public interface IInfosSociete {

	
	void chercherInfosSociete(String Siret);
	
	String chercherInfosSocieteAvecValeurRetour(String Siret);
	
	
	void chercherInfosSocieteThrowException(String Siret) throws SiretNotValidException;
	
	void chercherInfosSocieteAround(String name);
}