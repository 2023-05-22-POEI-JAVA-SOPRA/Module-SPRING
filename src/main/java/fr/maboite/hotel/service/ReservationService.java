package fr.maboite.hotel.service;

import org.springframework.stereotype.Service;

import fr.maboite.hotel.dao.ReservationDao;
import fr.maboite.hotel.entity.DemandeReservation;
import fr.maboite.hotel.entity.Reservation;

@Service
public class ReservationService {

	private ReservationDao rDao;

	public Reservation getReservation(Integer id) {
		System.out.println("Get Reservation In Service");
		return rDao.get(id);
	}

	public Reservation saveReservation(Reservation reservation) {
		System.out.println("Save Reservation In Service");
		return rDao.save(reservation);
	}

	public ReservationService(ReservationDao rDao) {
		System.out.println("Reservation Service");
		this.rDao = rDao;
	}

	public Reservation saveDemande(DemandeReservation dRes) {
		Reservation resToSave = new Reservation();
		if (dRes.getHotel().startsWith("super")) {
			return null;
		} else if (dRes.getPlage().endsWith("plage") == false || dRes.getPlage() == null) {
			return null;
		} else {
			resToSave.setNom(dRes.getNom());
			resToSave.setDebut(dRes.getDebut());
			resToSave.setFin(dRes.getFin());
			return resToSave;
		}
	}
}
