package com.rmc.aspect.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmc.client.interfaces.IInfosSociete;
import com.rmc.exception.ExceptionUtils.ExceptionType;
import com.rmc.exception.fonctionnelle.accueil.SiretNotValidException;

/**
 * Test aspects du projet RMC
 * 
 * @author yyahia
 * 
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextCommun.xml",
		"classpath:applicationContextAop.xml" })
public class TestAspects {

	/**
	 * Exemple de SIRET.
	 */
	private static final String _SIRET = "404 833 048 00022";

	@Autowired
	private IInfosSociete infosSociete;

	@Test
	public void testAspectLoggingCasDroit() {
		infosSociete.chercherInfosSociete(_SIRET);
	}

	@Test
	public void testAspectLoggingValeurDeRetour() {
		infosSociete.chercherInfosSocieteAvecValeurRetour(_SIRET);
	}

	@Test
	public void testAspectLoggingCasErreur() {
		try {
			infosSociete.chercherInfosSocieteThrowException(_SIRET);
		} catch (SiretNotValidException e) {
			Assert.assertTrue(ExceptionType.ERROR.equals(e.getType()));
		}
	}
}
