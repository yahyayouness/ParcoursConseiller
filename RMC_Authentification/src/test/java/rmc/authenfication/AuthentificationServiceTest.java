package rmc.authenfication;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.servlet.ServletException;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

//
import sun.misc.BASE64Encoder;

import com.rmc.authentification.TokenAuthentificationService;
import com.rmc.authentification.dto.User;

@Ignore
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextAuth.xml"})
public class AuthentificationServiceTest {

	/**
	 * Logger for the authentification service.
	 */
	private static final Logger LOG = LoggerFactory
			.getLogger(AuthentificationServiceTest.class);

	/**
	 * Service d'authentification
	 */
	@Autowired
	private TokenAuthentificationService tokenAuthentification ;
	

	public void testBasicAuthentification() {

		try {

			final String webPage = "http://localhost:8080/RMC_Authentification/auth/check/basic";
			final String name = "Yahya";
			final String password = "youyouAA111";
			final String authString = name + ":" + password;

			LOG.info("Auth string: " + authString);

			String authStringEnc = new BASE64Encoder().encode(authString
					.getBytes());

			LOG.info("Base64 encoded auth string: " + authStringEnc);

			URL url = new URL(webPage);
			URLConnection urlConnection = url.openConnection();
			urlConnection.setRequestProperty("Authorization", "Basic "
					+ authStringEnc);
			InputStream is = urlConnection.getInputStream();
			InputStreamReader isr = new InputStreamReader(is);

			int numCharsRead;
			char[] charArray = new char[1024];
			StringBuffer sb = new StringBuffer();
			while ((numCharsRead = isr.read(charArray)) > 0) {
				sb.append(charArray, 0, numCharsRead);
			}
			String result = sb.toString();

			LOG.info("---------------------------------------------");
			LOG.info("Response from the server: " + result);

		} catch (MalformedURLException e) {
			LOG.error(e.getMessage());
		} catch (IOException e) {
			LOG.error(e.getMessage());
		}
	}

	@Test
	public void testCreationToken() throws ServletException {
		User user = new User("yahya", "youness");	
		
		tokenAuthentification.creerToken(user);
	}

}
