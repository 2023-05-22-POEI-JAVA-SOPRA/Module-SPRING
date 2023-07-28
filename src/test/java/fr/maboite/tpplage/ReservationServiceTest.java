package fr.maboite.tpplage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

@SpringJUnitConfig(Config.class)
public class ReservationServiceTest {
	@Autowired
	ReservationService service;
	
	@Test
	void get_not_null_id_1() {
		assertNotNull(service.get(1));
	}
	
	@Test
	void get_equals_id_1() {
		assertEquals(service.get(1), new Reservation(1 , "getReservation", LocalDate.of(2020, 8, 2), LocalDate.of(2022, 12, 17)));
	}
	
	@Test 
	void save_not_null() {
		assertNotNull(service.save());
	}
	
	@Test
	void save_equals() {
		assertEquals(service.save(), new Reservation(100, "saveReservation", LocalDate.of(2020, 1, 1), LocalDate.of(2022, 10, 10)));
	}
	
	//DemandeReservation
	void demande_reservation_valid() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "hotel", "plageOk");
		Reservation result = new Reservation(50, "test", debut, fin);
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_hotel_null() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, null, "plageOk");
		Reservation result = new Reservation(50, "test", debut, fin);
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_plage_null() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "hotel", null);
		Reservation result = new Reservation(50, "test", debut, fin);
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_plage_name_with_uppercase() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "hotel", "PLaGeOk");
		Reservation result = new Reservation(50, "test", debut, fin);
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_invalid_hotel_name_with_uppercase() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "SuPeRHotel", "plageOk");
		Reservation result = null;
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_plage_invalid() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "hotel", "nplage");
		Reservation result = null;
		assertEquals(service.validDemand(dm), result);
	}
	
	void demande_reservation_hotel_invalid() {
		LocalDate debut = LocalDate.of(2015, 1, 1);
		LocalDate fin = LocalDate.of(2020, 10, 10);
		DemandeReservation dm = new DemandeReservation("test", debut, fin, "superHotel", "plageOk");
		Reservation result = null;
		assertEquals(service.validDemand(dm), result);
	}
}
