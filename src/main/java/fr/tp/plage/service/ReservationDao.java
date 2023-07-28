package fr.tp.plage.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Reservation;

@Component
public class ReservationDao {

	LocalDate localDateNow = LocalDate.now();
	private Reservation reservations = new Reservation(3,"Walid",localDateNow,localDateNow.plusDays(15));

	public Reservation save(Reservation reservation) {

		System.out.println("appel a la methode save de la reservation");

		return reservation;
	}

	public Reservation get(Integer id) {

		System.out.println("appel a la methode get de la reservation");
		if(reservations.getId() == id)
		return this.reservations;
		
		return null;
	}

}
