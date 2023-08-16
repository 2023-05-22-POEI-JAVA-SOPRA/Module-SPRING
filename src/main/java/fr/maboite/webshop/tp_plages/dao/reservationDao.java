package fr.maboite.webshop.tp_plages.dao;

import org.springframework.stereotype.Repository;

import fr.maboite.webshop.tp_plages.model.Reservation;

@Repository
public class reservationDao {

	
	public Reservation saveReservation(Reservation reservation) {
		System.out.println("reservationDao --> Methode saveVille appelee");
		Reservation savedReservation=reservation;
		return savedReservation;
	}
	
	public Reservation getReservation(Integer id) {
		System.out.println("reservationDao --> Methode getReservation appelee");
		return new Reservation();
	}
}
