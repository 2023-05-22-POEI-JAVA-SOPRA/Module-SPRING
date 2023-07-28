package fr.maboite.webshop.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Reservation;

@Component
@PropertySource("classpath:TP.properties")

public class ReservationDao {
	
	@Value(value="${Reservation.id}")
	private Integer idReservation;
	
	@Value(value="${Reservation.nom}")
	private String nomReservation;
	
	private LocalDate debut = LocalDate.now();
	
	private LocalDate fin = LocalDate.now().plusDays(15);

	public Reservation save(Reservation reservation) {
		System.out.println("Appel de save ReservationDao");
		reservation.setId(idReservation);
		reservation.setNom(nomReservation);
		reservation.setDebut(debut);
		reservation.setFin(fin);
		return reservation;
	}

	public Reservation get(Integer id) {
		System.out.println("Appel de get ReservationDao");
		Reservation reservation = new Reservation();
		reservation.setId(id);
		reservation.setNom(nomReservation);
		reservation.setDebut(debut);
		reservation.setFin(fin);
		return reservation;
	}

}
