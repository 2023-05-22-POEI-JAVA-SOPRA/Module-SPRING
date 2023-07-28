package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.MegaConfig;

@SpringJUnitConfig(MegaConfig.class)
public class ExampleServiceTest {
	@Autowired
	SuperService serviceTest;

	
	@Test
	public void service_not_null() {
		assertNotNull(serviceTest);
	}
	
	@Test
	public void check_name() {
		assertEquals(serviceTest.getName(), "numero1");
	}
	@Test
	public void check_method_returnTrue() {
		assertTrue(serviceTest.returnTrue());
	}
}
