package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.pojo.Plage;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP;

@SpringJUnitConfig(ConfigurationTP.class)
public class ServicePlageTest {

	@Autowired
	ServicePlage servicePlage;
	
	
	
	@Test
	public void testCorrespondingDaoExists() {
		Assertions.assertNotNull(servicePlage.plageDao);
	}
	
	@Test
	public void testGet() {
		Integer idTest = 123;
		Plage plageTest = servicePlage.plageDao.get(idTest);
		Assertions.assertEquals(idTest, plageTest.getId());
		Assertions.assertEquals("nomPlage", plageTest.getNom());
	}
	
	@Test
	public void testSave() {
		Plage plageBase = new Plage();
		plageBase.setId(-15);
		plageBase.setNom("La Plage FM");
		
		Plage plageTest = servicePlage.save(plageBase);
		
		Assertions.assertEquals(-15, plageTest.getId());
		Assertions.assertEquals("La Plage FM", plageTest.getNom());
	}
}
