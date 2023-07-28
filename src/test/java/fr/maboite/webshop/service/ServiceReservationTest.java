package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.pojo.Reservation;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP;

@SpringJUnitConfig(ConfigurationTP.class)
public class ServiceReservationTest {

	@Autowired
	ServiceReservation serviceReservation;
	
	
	
	@Test
	public void testCorrespondingDaoExists() {
		Assertions.assertNotNull(serviceReservation.reservationDao);
	}
	
	@Test
	public void testGet() {
		Integer idTest = 2;
		Reservation reservationTest = serviceReservation.reservationDao.get(idTest);
		Assertions.assertEquals(idTest, reservationTest.getId());
		Assertions.assertEquals("nomReservation", reservationTest.getNom());
	}
	
	@Test
	public void testSave() {
		Reservation reservationBase = new Reservation();
		reservationBase.setId(36);
		reservationBase.setNom("La réserve à Scion");
		
		Reservation reservationTest = serviceReservation.save(reservationBase);
		
		Assertions.assertEquals(36, reservationTest.getId());
		Assertions.assertEquals("La réserve à Scion", reservationTest.getNom());
	}
}
