package fr.maboite.webshop.tp_plages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.tp_plages.dao.reservationDao;
import fr.maboite.webshop.tp_plages.model.DemandeReservation;
import fr.maboite.webshop.tp_plages.model.Reservation;

@Service	
public class serviceReservation {
	
	
	@Autowired
	private reservationDao maReservationDao;
	
	public Reservation saveReservation(Reservation reservation) {
		System.out.println("serviceReservation --> Methode saveReservation appelee");
		return maReservationDao.saveReservation(reservation);
	}
	
	public Reservation getReservation(Integer id) {
		System.out.println("serviceReservation --> Methode getReservation appelee");
		return maReservationDao.getReservation(id);
	}
	
	
	//Merci MattieuF pour le coup de main et l'explication.
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
	
}
