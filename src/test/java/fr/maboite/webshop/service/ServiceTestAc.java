package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.SpringAcConfigSimple;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

//permet de dire à JUnit de lire une configuration pour réaliser les tests
@SpringJUnitConfig(SpringAcConfigSimple.class)
public class ServiceTestAc {
	
	@Autowired
	private FirstServiceAc myFirstServiceAc;
	
	@Test
	public void test() {
		Assertions.assertNotNull(myFirstServiceAc);
	}
	
	@Test
	public void testSum() {
		int result = myFirstServiceAc.sum(3,4);
//		ATTENTION : valeur attendue
		Assertions.assertEquals(7, result);
		
	}
}

	

	