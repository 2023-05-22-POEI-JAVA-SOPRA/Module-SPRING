package fr.maboite.tpplage;


import java.time.LocalDate;

import org.springframework.stereotype.Component;

@Component
public class ReservationDao {
	public Reservation save() {
		
		System.out.println("in ReservationDao : save");
		return new Reservation(100, "saveReservation", LocalDate.of(2020, 1, 1), LocalDate.of(2022, 10, 10));
	}

	public Reservation get(Integer id) {
		System.out.println("in ReservationDao : get");
		return new Reservation(id , "getReservation", LocalDate.of(2020, 8, 2), LocalDate.of(2022, 12, 17));
	}
}
