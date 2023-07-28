package fr.tp.plage.service;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

import fr.tp.plage.entity.DemandeReservation;
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
	
	public Reservation getDemandeRes(DemandeReservation demandeReservation) {
		System.out.println("check de la demande de reservation");
		Reservation res = new Reservation();
		String plage = demandeReservation.getPlage();
		String complet = demandeReservation.getHotel().substring(0, 4);
		String plageNul = plage.substring(plage.length()-6, plage.length()-1);
		
		if(complet.equals("super") || plage.equals(null) || !(plageNul.equals("plage")) ) {
			return null;
		}else {
			
			res.setNom(demandeReservation.getNom());
			res.setDebut(demandeReservation.getDebut());
			res.setFin(demandeReservation.getFin());
			
			return res;
		}
		
		
	}

}
