package fr.maboite.hotel.dao;

import org.springframework.stereotype.Component;

import fr.maboite.hotel.entity.Reservation;

@Component
public class ReservationDao {
	
	public Reservation get(Integer id) {
		System.out.println("Get Reservation Dao " + id);
		return new Reservation();
	}
	
	public Reservation save(Reservation reservation) {
		System.out.println("Save Reservation Dao");
		return reservation;
	}

}
