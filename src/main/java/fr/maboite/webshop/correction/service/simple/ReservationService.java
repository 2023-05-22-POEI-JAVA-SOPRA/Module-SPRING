package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Reservation;

@Component
public class ReservationService {

	@Autowired
	private ReservationDao reservationDao;

	public Reservation save(Reservation reservation) {
		return reservationDao.save(reservation);

	}

	public ReservationService() {
		System.out.println("ReservationService created");
	}

	public Reservation get(Integer id) {
		return reservationDao.get(id);

	}

	public Reservation createReservation(DemandeReservation demandeReservation) {

		//Reservation reservation = new Reservation();
		if (demandeReservation.getHotel().startsWith("super"))
			return null;
		if (demandeReservation.getPlage() != null && !demandeReservation.getPlage().endsWith("plage"))
			return null;
		
			return new Reservation(demandeReservation.getNom(),demandeReservation.getDebut(),demandeReservation.getFin());

	}

}
