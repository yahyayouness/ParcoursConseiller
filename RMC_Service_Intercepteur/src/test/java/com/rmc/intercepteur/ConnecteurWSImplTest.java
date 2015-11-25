package com.rmc.intercepteur;

import org.apache.cxf.interceptor.InInterceptors;
import org.apache.cxf.interceptor.OutInterceptors;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmc.ws.ConnecteurWS;

@InInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingInInterceptor")
@OutInterceptors(interceptors = "org.apache.cxf.interceptor.LoggingOutInterceptor")
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextIntercepteur.xml",
		"classpath:applicationContext-test-ws.xml" })
public class ConnecteurWSImplTest {

	/** The Constant LOGGER. */
	private static final Logger LOGGER = Logger
			.getLogger(ConnecteurWSImplTest.class);

	/** The connecteur ws. */
	@Autowired
	private ConnecteurWS connecteurWS;

	/**
	 * Test method for.
	 * 
	 * {@link com.total.ecotaxe.ws.impl.ConnecteurWSImpl#getMsg(java.lang.String)}
	 * .
	 */
	@Test
	public void testGetMsg() {
		Assert.assertNotNull(connecteurWS);
		final String msg = connecteurWS.getMsg("yahya test");
		Assert.assertNotNull(msg);
		Assert.assertEquals("yahya test 9", msg);
		LOGGER.debug("reponse: " + msg);
	}

}
