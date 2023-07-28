package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.correction.service.MonService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;
import fr.maboite.webshop.spring.real.configuration.SpringSimpleConfiguration;

@SpringJUnitConfig(SpringSimpleConfiguration.class)
public class ExampleServiceTest {
	
	@Autowired
	private MonService monService;
	
	@Test
	public void test_difficult_calcul() {
		assertEquals(2, monService.calculusOptimus());
	}
	
	@Test
	public void test_monService_not_null() {
		assertNotNull(monService);
	}
	
	@Test
	public void test_monGetAttribut_saloute() {
		assertEquals("Salut !",monService.getMonMessage());
	}
	

}
