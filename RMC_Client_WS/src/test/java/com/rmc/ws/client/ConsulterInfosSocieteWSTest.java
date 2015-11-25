package com.rmc.ws.client;

import java.util.List;

import org.apache.cxf.common.util.StringUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.edf.psc._0022.consulterinfossociete.ConsulterInfosSocieteResponse;
import fr.edf.psc._0022.consulterinfossociete.ETABLISSEMENT;
import fr.edf.psc._0022.consulterinfossociete.RechercheMosaiqueOutput;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextClientWs.xml" })
public class ConsulterInfosSocieteWSTest {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger
			.getLogger(ConsulterInfosSocieteWSTest.class);

	/**
	 * Exemple de SIRET.
	 */
	private static final String _SIRET = "404 833 048 00022";

	@Autowired
	private InfosSocieteClient consulterInfosSocieteWS;

	/**
	 * Scénarion Cas droit.
	 */
	@Test
	public void testChercherInfosSocieteCasDroit() {
		// Test injection
		Assert.assertNotNull(consulterInfosSocieteWS);
		try {

			// Appel au service
			final RechercheMosaiqueOutput reponse = consulterInfosSocieteWS
					.chercherInfosSociete(_SIRET);

			// Validation des elements de la réponse
			Assert.assertNotNull(reponse);

			// Pas d'exception remontée.
			Assert.assertTrue(StringUtils.isEmpty(reponse.getFaultcode()));
			Assert.assertTrue(StringUtils.isEmpty(reponse.getFaultstring()));

			final ConsulterInfosSocieteResponse infosSociete = reponse
					.getConsulterInfosSocieteResponse();

			// Récupération de la liste des établissements
			
			// FIXME check nullité
			final List<ETABLISSEMENT> etablissements = infosSociete.getDonneesRetour()
					.getMosaiqueMessageOut().getETABLISSEMENT();

			Assert.assertFalse(etablissements.isEmpty());
			final ETABLISSEMENT etablissement = etablissements.get(0);
			
			if(null != etablissement){
				Assert.assertTrue(_SIRET.equals(etablissement.getSIRET()));
			}
			

		} catch (Exception e) {
			LOGGER.error("Erreur lors de la recherche des infos societe : ", e);
			Assert.fail("Exception interceptée:" + e.getMessage());
		}
	}

}
