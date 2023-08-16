package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfLP;

@SpringJUnitConfig(SpringSimpleConfLP.class)
public class maclasseTest {
	
	@Autowired
	//@Qualifier("monPremierServiceLP")
	private MonPremierServiceLP exampleService;
	
	@Test
	public void testBasique(){
		assertNotNull(exampleService); 
	}
	
	@Test
	public void test2Basique() {
		assertNotNull(exampleService.getMonPremierDaoLP()); 
		assertNotNull(exampleService.getMonSecondService());
	}
	
	
	
	
}
