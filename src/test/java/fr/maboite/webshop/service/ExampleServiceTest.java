package fr.maboite.webshop.service;


import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.correction.service.simple.MonPremierService;
import fr.maboite.webshop.spring.real.configuration.MaConfigurationFacile;

@SpringJUnitConfig(MaConfigurationFacile.class)
public class ExampleServiceTest {
	
	@Autowired
	private MonPremierService monPremierService;
	
	@Test
	public void testCoucouNotNull() {
		monPremierService.afficherProp();
		assertNotNull(monPremierService);
	}

}
