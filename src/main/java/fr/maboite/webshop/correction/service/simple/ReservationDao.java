package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;


import fr.maboite.webshop.model.Reservation;

@Component 
public class ReservationDao{
	
	private static Integer idReservation=0;
	
	public Reservation save(Reservation reservation)
	{
		reservation.setId(++idReservation);
		return reservation;
	}
	
	public Reservation get(Integer id )
	{
		Reservation reservationToGet = new Reservation();
		reservationToGet.setId(id);
		return reservationToGet;
	}
}