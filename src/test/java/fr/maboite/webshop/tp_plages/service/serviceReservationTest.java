package fr.maboite.webshop.tp_plages.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.tp_plages.SpringConfigurationTp_Plages;
import fr.maboite.webshop.tp_plages.model.Reservation;

@SpringJUnitConfig(SpringConfigurationTp_Plages.class)
public class serviceReservationTest {
	
	@Autowired
	private serviceReservation monServiceReservation;

	@Test
	public void testSavedReserv() {
		Reservation reserv=new Reservation();
		reserv.setNom("maReserv");
		assertEquals("maReserv", reserv.getNom());
	}
	//Je ne sais pas trop comment tester cette méthode

	@Test
	public void testGetReserv() {
		Reservation reserv=new Reservation();
		}
	
}
