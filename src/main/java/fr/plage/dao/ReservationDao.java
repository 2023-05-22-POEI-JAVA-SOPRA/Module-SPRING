package fr.plage.dao;

import org.springframework.stereotype.Component;

import fr.plage.entity.Reservation;

@Component
public class ReservationDao {
	
	public Reservation save(Reservation reservation) {
		Reservation savedRes = new Reservation(reservation);
		System.out.println("Une réservation a été créée : " + savedRes.toString());
		return savedRes;
	}
	
	public void getById(Integer id) {
		System.out.println("Res numéro : "+id+" a été trouvée.");
	}
	
	public void delById(Integer id) {
		System.out.println("Res numéro : "+id+" a été supprimée.");
	}
}
