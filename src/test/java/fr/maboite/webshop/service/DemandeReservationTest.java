package fr.maboite.webshop.service;

import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.pojo.DemandeReservation;
import fr.maboite.webshop.pojo.Reservation;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP;

@SpringJUnitConfig(ConfigurationTP.class)
public class DemandeReservationTest {

	@Autowired
	ServiceReservation serviceReservation;
	
		
	@Test
	public void testHotelBad_PlageGood() {
		LocalDate debut = LocalDate.now();
		LocalDate fin = LocalDate.now().plusDays(14);
		
		DemandeReservation demande = new DemandeReservation();
		demande.setDebut(debut);
		demande.setFin(fin);
		demande.setHotel("superHotel");
		demande.setId(651);
		demande.setNom("reservationTest");
		demande.setPlage("dijon plage"); //(oui, oui, ça existe)
		
		Reservation reervationTest = serviceReservation.demandeReservation(demande);

		Assertions.assertNull(reervationTest);
	}
	

	@Test
	public void testPlageBad_HotelGood() {
		LocalDate debut = LocalDate.now();
		LocalDate fin = LocalDate.now().plusDays(14);
		
		DemandeReservation demande = new DemandeReservation();
		demande.setDebut(debut);
		demande.setFin(fin);
		demande.setHotel("L'Hotel rit");
		demande.setId(651);
		demande.setNom("reservationTest");
		demande.setPlage("randomNom");
		
		Reservation reervationTest = serviceReservation.demandeReservation(demande);

		Assertions.assertNull(reervationTest);		
	}
	

	@Test
	public void testPlageNull_HotelGood() {
		LocalDate debut = LocalDate.now();
		LocalDate fin = LocalDate.now().plusDays(14);
		
		DemandeReservation demande = new DemandeReservation();
		demande.setDebut(debut);
		demande.setFin(fin);
		demande.setHotel("L'Hotel rit");
		demande.setId(651);
		demande.setNom("reservationTest");
		demande.setPlage(null);
		
		Reservation reervationTest = serviceReservation.demandeReservation(demande);

		Assertions.assertNull(reervationTest);	
	}
	

	@Test
	public void testPlageGood_HotelGood() {
		LocalDate debut = LocalDate.now();
		LocalDate fin = LocalDate.now().plusDays(14);
		
		DemandeReservation demande = new DemandeReservation();
		demande.setDebut(debut);
		demande.setFin(fin);
		demande.setHotel("L'Hotel rit");
		demande.setId(651);
		demande.setNom("reservationTest");
		demande.setPlage("dijon plage");
		
		Reservation reservationTest = serviceReservation.demandeReservation(demande);

		Assertions.assertNotNull(reservationTest);	

		Assertions.assertEquals(reservationTest.getId(), demande.getId());
		Assertions.assertEquals(reservationTest.getNom(), demande.getNom());
		Assertions.assertEquals(reservationTest.getDebut(), demande.getDebut());
		Assertions.assertEquals(reservationTest.getFin(), demande.getFin());
		
	}
}
