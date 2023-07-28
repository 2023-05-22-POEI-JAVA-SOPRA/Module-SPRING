package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.plage.service.ReservationServices;
import fr.maboite.webshop.spring.simple.configuration.PlageSpringConfig;

@SpringJUnitConfig(PlageSpringConfig.class)
public class ResaTest {
	@Autowired
	private ReservationServices resaService;
	
	@Test
	public void test() {
		Assertions.assertNotNull(resaService);
	}
}
