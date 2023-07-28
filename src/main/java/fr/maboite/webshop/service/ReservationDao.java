package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class ReservationDao {
	
	public void save() {
		System.out.println("Reservation is saved");
	}
	public void get() {
		System.out.println("Reservation is getted");
	}

}
