package com.rmc.exception;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmc.factory.RmcExceptionFactory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextCommun.xml" })
public class RmcExceptionFactoryTest {

	/** The rmc exception factory. */
	@Autowired
	private RmcExceptionFactory rmcExceptionFactory;

	/**
	 * Teste et valide la bonne récupération des messages [cas droit et cas
	 * d'erreur].
	 * 
	 * @throws SecurityException
	 * @throws NoSuchMethodException
	 * @throws IllegalArgumentException
	 * @throws IllegalAccessException
	 * @throws InvocationTargetException
	 */
	@Test
	public void testGetMessage() throws SecurityException,
			NoSuchMethodException, IllegalArgumentException,
			IllegalAccessException, InvocationTargetException {
		String defaultMessage = "message par défaut";
		String code = "XXX-XXX-TIXX-E0000";
		String codeErrone = "AAA-AAA-AAAA-AAAAA";

		// récuperation de la methode prive
		Method methode = rmcExceptionFactory.getClass().getDeclaredMethod(
				"getMessage", new Class[] { String.class, Object[].class });

		// rendre accessible la methode prive
		methode.setAccessible(true);

		String returnString = (String) methode.invoke(rmcExceptionFactory,
				new Object[] { code, new String[] { "one", "two", "three" } });
		Assert.assertFalse(returnString.equalsIgnoreCase(defaultMessage));

		returnString = (String) methode.invoke(rmcExceptionFactory,
				new Object[] { codeErrone,
						new String[] { "one", "two", "three" } });
		Assert.assertTrue(returnString.equalsIgnoreCase(defaultMessage));
	}

	@Test
	public void testGetNewTechnicalException() {
		Assert.assertNotNull(rmcExceptionFactory);
		String code = "XXX-XXX-TIXX-E0000";

		try {
			// Provoque une exception.
			String test = null;
			test.equals("");

		} catch (Exception e) {

			RmcTechnicalException newTechnicalException = rmcExceptionFactory
					.getNewTechnicalException(code, new String[] { "one",
							"two", "three" }, e);

			Assert.assertNotNull(newTechnicalException);

			RmcFunctionalException newFunctionalException = rmcExceptionFactory
					.getNewFunctionalException(code, new String[] { "one",
							"two", "three" }, e);

			Assert.assertNotNull(newFunctionalException);

			newFunctionalException = rmcExceptionFactory
					.getNewFunctionalException("XXX-XXX-XXXX-X0000",
							new String[] { "one", "two", "three" }, e);

			Assert.assertNotNull(newFunctionalException);

		}

	}

}
