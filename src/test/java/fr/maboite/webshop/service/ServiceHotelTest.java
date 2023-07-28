package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.pojo.Hotel;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP;

@SpringJUnitConfig(ConfigurationTP.class)
public class ServiceHotelTest {

	@Autowired
	ServiceHotel serviceHotel;
	
	
	
	@Test
	public void testCorrespondingDaoExists() {
		Assertions.assertNotNull(serviceHotel.hotelDao);
	}
	
	@Test
	public void testGet() {
		Integer idTest = 21545;
		Hotel hotelTest = serviceHotel.hotelDao.get(idTest);
		Assertions.assertEquals(idTest, hotelTest.getId());
		Assertions.assertEquals("nomHotel", hotelTest.getNom());
		Assertions.assertEquals("villeHotel", hotelTest.getVille());
	}
	
	@Test
	public void testSave() {
		Hotel hotelBase = new Hotel();
		hotelBase.setId(14);
		hotelBase.setNom("Le Tokyohotel");
		hotelBase.setVille("Haute Aile");
		
		Hotel hotelTest = serviceHotel.save(hotelBase);
		
		Assertions.assertEquals(14, hotelTest.getId());
		Assertions.assertEquals("Le Tokyohotel", hotelTest.getNom());
		Assertions.assertEquals("Haute Aile", hotelTest.getVille());
	}
}
