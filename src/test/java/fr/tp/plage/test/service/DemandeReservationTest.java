package fr.tp.plage.test.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.tp.plage.entity.DemandeReservation;
import fr.tp.plage.entity.Reservation;
import fr.tp.plage.service.ReservationService;
import fr.tp.plage.spring.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class DemandeReservationTest {
	
	@Autowired
	private ReservationService reservationService;
	
	LocalDate localDateNow = LocalDate.now();
	Reservation reservation = new Reservation(3,"Hotel",localDateNow,localDateNow.plusDays(15));
	DemandeReservation demandeReservation = new DemandeReservation("Hotel",localDateNow,localDateNow.plusDays(15),"mouetteplage", "Hotel");
	
	@Test
	public void test_get_demande_reservation_not_null() {
		
		assertNotNull(reservationService.getDemandeRes(demandeReservation));
	}
	
	@Test
	public void test_get_demande_reservation_result() {
		assertEquals(reservation.getDebut(), reservationService.getDemandeRes(demandeReservation).getDebut());
		assertEquals(reservation.getFin(), reservationService.getDemandeRes(demandeReservation).getFin());
		assertEquals(reservation.getNom(), reservationService.getDemandeRes(demandeReservation).getNom());
		
	}

}
