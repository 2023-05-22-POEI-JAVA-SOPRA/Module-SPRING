package fr.tp.plage.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.tp.plage.entity.Hotel;
import fr.tp.plage.entity.Plage;
import fr.tp.plage.entity.Reservation;
import fr.tp.plage.service.HotelService;
import fr.tp.plage.service.PlageService;
import fr.tp.plage.service.ReservationService;
import fr.tp.plage.spring.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class TPPlageTest {
	
	@Autowired
	private ReservationService reservationService;
	
	@Autowired
	private HotelService hotelService;
	
	@Autowired 
	private PlageService plageService;
	
	
	LocalDate localDateNow = LocalDate.now();
	Reservation reservation = new Reservation(3,"Walid",localDateNow,localDateNow.plusDays(15));
	@Test
	public void test_save_reservation() {
		assertEquals(reservation.toString(),reservationService.save(reservation).toString());
	}
	
	@Test
	public void test_get_reservation() {
		assertEquals(reservation.getDebut(), reservationService.get(3).getDebut());
		assertEquals(reservation.getFin(), reservationService.get(3).getFin());
		assertEquals(reservation.getId(), reservationService.get(3).getId());
		assertEquals(reservation.getNom(), reservationService.get(3).getNom());
	}
	
	
	@Test
	public void test_save_hotel() {
		Hotel hotel = new Hotel(2,"LUXE RESORT","Addis-Abeba");
		assertEquals(hotel.toString(),hotelService.save(hotel).toString());
		
	}
	
	@Test
	public void test_get_hotel() {
		Hotel hotel = new Hotel(2,"LUXE RESORT","Addis-Abeba");
		assertEquals(hotel.getId(), hotelService.get(2).getId());
		assertEquals(hotel.getNom(), hotelService.get(2).getNom());
		assertEquals(hotel.getVille(), hotelService.get(2).getVille());
	}
	
	Plage plage = new Plage(1,"Cricket Waves");
	@Test
	public void test_save_plage() {
		
		assertEquals(plage.toString(), plageService.save(plage).toString());
	}
	
	@Test
	public void test_get_plage() {
		
		assertEquals(plage.getId(), plageService.get(1).getId());	
		assertEquals(plage.getNom(), plageService.get(1).getNom());
	
	}
	
	
	

}
