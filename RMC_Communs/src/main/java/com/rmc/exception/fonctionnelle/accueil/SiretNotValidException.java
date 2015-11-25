package com.rmc.exception.fonctionnelle.accueil;

import com.rmc.exception.RmcException;


/**
 * Cas de SIRET non valid
 * 
 * 
 * Règles de gestion concernant les erreurs fonctionnelles 1er Cas : Le SIRET
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
 * @author yyahia
 * 
 */
public class SiretNotValidException extends RmcException {

	/**
	 * Serialisation Id
	 */
	private static final long serialVersionUID = 1L;

	public SiretNotValidException(String code, String libelle) {
		super(code, libelle);
	}

	
}
