package fr.maboite.plage.dao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.ReservationPojo;

@Component
public class ReservationDao {
	public ReservationPojo get(ReservationPojo resa) {
		System.out.println("méthode get Reservation");
		return resa;
	}
	
	public ReservationPojo save(ReservationPojo resa) {
		System.out.println("je dois sauvegarder une nouvelle resa");
		return resa;
		
	}
}
