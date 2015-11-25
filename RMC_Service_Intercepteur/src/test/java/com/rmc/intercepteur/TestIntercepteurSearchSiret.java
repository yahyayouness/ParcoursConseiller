package com.rmc.intercepteur;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rmc.intercepteur.ws.SearchSiretTestWs;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:applicationContextIntercepteur.xml" })
public class TestIntercepteurSearchSiret {

	@Autowired
	private SearchSiretTestWs searchSirhet;

	@Test
	public void test() {
		searchSirhet.searchSiret("9898");
	}

}
