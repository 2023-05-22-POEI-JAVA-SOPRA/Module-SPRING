package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Plage;
import fr.maboite.webshop.model.Reservation;
import fr.maboite.webshop.spring.simple.configuration.TPConfiguration;

@SpringJUnitConfig(TPConfiguration.class)
public class TPTest {
	
	@Autowired
	ReservationService reservationService = new ReservationService();
	
	@Autowired
	HotelService hotelService = new HotelService();
	
	@Autowired
	PlageService plageService = new PlageService();
	
	@Test
	public void testReservationServiceSave() {
		Reservation reservation = new Reservation(5l,"Dupont",LocalDate.now(),LocalDate.now().plusDays(15));
		Reservation result = reservationService.save(reservation);
		assertNotNull(result);
		assertEquals(reservation.toString(), result.toString());
	}
	
	@Test
	public void testReservationServiceGet() {
		Reservation reservation = new Reservation(5l,"Dupont",LocalDate.now(),LocalDate.now().plusDays(15));
		Reservation result = reservationService.get(5l);
		assertNotNull(result);
		assertEquals(result.toString(), reservation.toString());
	}
	
	@Test
	public void testReservationServiceDemande() {
		DemandeReservation demande =
				new DemandeReservation("Dupond",LocalDate.now(),LocalDate.now().plusDays(10),"la plage","hotel");
		Reservation result = reservationService.demandeDeReservation(demande);
		Reservation reservation = new Reservation(2l,"Dupond",LocalDate.now(),LocalDate.now().plusDays(10));
		assertNotNull(result);
		assertEquals(result.toString(), reservation.toString());
	}
	
	@Test
	public void testHotelServiceSave() {
		Hotel hotel = new Hotel(5,"Grand Hotel","Nice");
		Hotel result = hotelService.save(hotel);
		assertNotNull(result);
		assertEquals(hotel.toString(), result.toString());
		
	}
	
	@Test
	public void testHotelServiceGet() {
		Hotel hotel = new Hotel(5,"Grand Hotel","Nice");
		Hotel result = hotelService.getById(5l);
		assertNotNull(result);
		assertEquals(result.toString(), hotel.toString());
	}
	
	@Test
	public void testPlageServiceSave() {
		Plage plage = new Plage(5,"La plage");
		Plage result = plageService.save(plage);
		assertNotNull(result);
		assertEquals(plage.toString(), result.toString());
	}
	
	@Test
	public void testPlageServiceGet() {
		Plage plage = new Plage(5,"La plage");
		Plage result = plageService.get(5);
		assertNotNull(result);
		assertEquals(result.toString(), plage.toString());
	}
	
	
	
}
