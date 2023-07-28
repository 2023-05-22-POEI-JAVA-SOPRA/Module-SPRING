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
}
