package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class ExampleServiceTest {
	
	@Autowired
	private MonPremierService monPremierService;
	
	@Test
	public void test() {
		System.out.println("amine");
	}
	
	@Test
	public void test2() {
		assertNotNull(monPremierService);
	monPremierService.coucou();	
	}
	
	@Test
	public void testmean() {
		int resultat = monPremierService.mean(9,3);
	Assertions.assertEquals(resultat, 6);;
	
	}
	

}
