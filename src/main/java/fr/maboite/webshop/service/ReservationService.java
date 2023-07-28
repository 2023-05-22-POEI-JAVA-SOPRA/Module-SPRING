package fr.maboite.webshop.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Reservation;

@Component
public class ReservationService {

	@Autowired
	private ReservationDao reservationDao;
	
	public Reservation save(Reservation reservation) {
		System.out.println("Appel de save ReservationService");
		return this.reservationDao.save(reservation);
	}
	
	public Reservation get(Integer id) {
		System.out.println("Appel de get ReservationService");
		return this.reservationDao.get(id);
	}
	
	public Reservation demandeDeReservation(DemandeReservation demandeReservation) {
		if(demandeReservation.getHotel()==null) {
			return null;
		}
		else if(demandeReservation.getHotel().startsWith("super")) {
			System.out.println("L'hôtel n'a plus de chambre disponible.");
			return null;
		}
		if(demandeReservation.getPlage()==null) {
			return null;
		}
		else if(demandeReservation.getPlage()!=null && !(demandeReservation.getPlage().endsWith("plage"))) {
			System.out.println("La réservation est impossible car cette plage n'existe pas.");
			return null;
		}
		return new Reservation(2,demandeReservation.getNom(),demandeReservation.getDebut(),demandeReservation.getFin());
	}
	
}
