package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.ConfigurationThomas;

@SpringJUnitConfig(ConfigurationThomas.class)
public class ThomasServiceTest {
	
	@Autowired
	PremierServiceThomas premierServiceThomas;
	
	//PremierServiceThomas premierServiceThomas = new PremierServiceThomas();
	
	
	@Test
	public void testAtValue() {
		Assertions.assertNotNull(premierServiceThomas.getDaoThomas());
	}

	@Test
	public void testAtValueEqualsCeQuilFaut() {
		Assertions.assertEquals("dao1", premierServiceThomas.getDaoThomas());
	}

	
	@Test
	public void testCoucou() {

		Assertions.assertEquals("coucou ni kamnida", premierServiceThomas.coucou());
	}
}
