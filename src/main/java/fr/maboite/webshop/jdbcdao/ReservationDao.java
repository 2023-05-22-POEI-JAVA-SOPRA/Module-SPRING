package fr.maboite.webshop.jdbcdao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.pojo.Reservation;

@Component
public class ReservationDao {


	/**
	 * Renvoie une reservation avec l'ID correspondant.
	 * @return reservation
	 */
	public Reservation get(Integer id) {
		Reservation reservation = new Reservation();
		reservation.setId(id);
		reservation.setNom("nomReservation");
		return reservation;
	}
	

	/**
	 * "Enregistre" une reservation et la renvoie.
	 * @return reservation
	 */
	public Reservation save(Reservation reservation) {
		Reservation reservationSaved = new Reservation();
		reservationSaved.setId(reservation.getId());
		reservationSaved.setNom(reservation.getNom());
		return reservationSaved;
	}
}
