package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.PremiereConfiguration;

@SpringJUnitConfig(PremiereConfiguration.class)
public class PremierTest {

	@Autowired
	PremierService premierService = new PremierService(1);
	
	@Test
	public void testCall() {
		assertNotNull(premierService);
		premierService.call();
	}
	
	@Test
	public void testMultiply() {
		Integer result = premierService.multiply(2,3);
		assertEquals(result, 6);
	}
	
}


