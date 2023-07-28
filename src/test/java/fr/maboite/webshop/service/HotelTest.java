package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.plage.service.HotelServices;
import fr.maboite.webshop.spring.simple.configuration.PlageSpringConfig;

@SpringJUnitConfig(PlageSpringConfig.class)
public class HotelTest {
	@Autowired
	private HotelServices hotelServices;
	
	@Test
	public void test() {
		Assertions.assertNotNull(hotelServices);
	}
}
