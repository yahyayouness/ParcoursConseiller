package com.rmc.ws.accueil.dto;

/**
 * DTO permettant de restituer les données des infos sociétes.
 * 
 * @author yyahia
 * 
 */

/**
 * 
 Règles de gestion concernant les erreurs fonctionnelles 1er Cas : Le SIRET
 * trouvé correspond à établissement fermé ou en cessation d’activité La PSC
 * renvoie à CLOE un « 0 » dans la balise <STAEVE> se trouvant dans la balise
 * <DonneesRetour> et CLOE affichera le message d’alerte suivant au conseiller :
 * « Le SIRET n’est pas actif ».
 * 
 * PS : Un établissement fermé correspond à un statut faisant suite à un
 * événement de clôture.
 * 
 * 2ème cas : Le SIRET trouvé n’a pas un événement valide La PSC renvoie à CLOE
 * un « 99 » dans la balise <STAEVE> se trouvant dans la balise <DonneesRetour>
 * et CLOE affichera le message d’alerte suivant au conseiller : « Le SIRET n’a
 * pas d’événement valide ». 3ème cas : Le SIRET n’est pas trouvé La PSC renvoie
 * à CLOE un « -1 » dans la balise <FLG_EXIST> se trouvant dans la balise
 * <DonneesRetour> et CLOE affichera le message d’alerte suivant au conseiller :
 * « Le SIRET n’existe pas dans la base de données de société ».
 * 
 * 
 */
public class InfosSociete {

	/*************************************** INPUTS **********************************/

	private String siret;

	private String siren;

	private String raisonSociale;

	private String secteurActivite;

	private String codeNaf;

	private String libelleNaf;

	private String rlj;

	/*************************************** CONSTRUCTEURS *******************************/

	public InfosSociete() {
	}

	/*************************************** GETTERS & SETTERS ***************************/
	public String getSiret() {
		return siret;
	}

	public void setSiret(String siret) {
		this.siret = siret;
	}

	public String getSiren() {
		return siren;
	}

	public void setSiren(String siren) {
		this.siren = siren;
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public String getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(String secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public String getCodeNaf() {
		return codeNaf;
	}

	public void setCodeNaf(String codeNaf) {
		this.codeNaf = codeNaf;
	}

	public String getLibelleNaf() {
		return libelleNaf;
	}

	public void setLibelleNaf(String libelleNaf) {
		this.libelleNaf = libelleNaf;
	}

	public String getRlj() {
		return rlj;
	}

	public void setRlj(String rlj) {
		this.rlj = rlj;
	}

}
