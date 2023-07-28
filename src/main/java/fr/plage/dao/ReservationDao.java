package fr.plage.dao;

import org.springframework.stereotype.Component;

import fr.plage.entity.DemandeReservation;
import fr.plage.entity.Reservation;

@Component
public class ReservationDao {
	
	public Reservation save(Reservation reservation) {
		Reservation savedRes = new Reservation(reservation);
		System.out.println("Une réservation a été créée : " + savedRes.toString());
		return savedRes;
	}
	
	public Reservation saveFromDemande(DemandeReservation demRes) {
		Reservation savedRes = new Reservation();

		if (demRes.getHotel().toLowerCase().startsWith("super")) {
			return null;
		}
		else if (!(demRes.getPlage().toLowerCase().endsWith("plage"))) {
			return null;
		}
		else {
			savedRes.setNom(demRes.getNom());
			savedRes.setDebut(demRes.getDebut());
			savedRes.setFin(demRes.getFin());
			return savedRes;
		}
	}
	
	public String getById(Integer id) {
		return "Res numéro : "+id+" a été trouvée.";
	}
	
	public String delById(Integer id) {
		return "Res numéro : "+id+" a été supprimée.";
	}
}
