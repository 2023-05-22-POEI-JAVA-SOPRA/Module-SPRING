package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.ReservationDao;
import fr.maboite.webshop.pojo.DemandeReservation;
import fr.maboite.webshop.pojo.Reservation;

@Component
public class ServiceReservation {


	@Autowired
	ReservationDao reservationDao;

	
	public Reservation get(Integer id) {
		System.out.println("coucou get service reservation");
		return reservationDao.get(id);
	}
	
	public Reservation save(Reservation reservation) {
		System.out.println("coucou save service reservation");
		return reservationDao.save(reservation);
	}
	
	
	
	public Reservation demandeReservation(DemandeReservation demande) {
		
		if(demande.getPlage() == null || !(demande.getPlage().endsWith("plage"))) {
			return null;
		} else if(demande.getHotel().startsWith("super")) {
			return null;
		} else {
			Reservation reservation = new Reservation();
			reservation.setId(demande.getId());
			reservation.setNom(demande.getNom());
			reservation.setDebut(demande.getDebut());
			reservation.setFin(demande.getFin());
			
			return reservation;
		}
	}
	
	
	
	
}
