package AuthentificationServiceTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmc.configuration.RmcConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:applicationContexteConfig.xml" })
public class RmcConfigurationTest {
	
    static {
        System.setProperty("rmc.server.config.url", "file:D:/ParcoursConseiller/Logiciels/jboss-eap-6.4/standalone/conf/");
    }

	@Autowired
	private RmcConfiguration config;
	
	@Test
	public void testGetExternalConfig() {
		
		Assert.assertTrue("DEV".equals(config.getEnvironnement()));
		
	}
}
