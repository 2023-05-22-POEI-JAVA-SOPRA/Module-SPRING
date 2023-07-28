package fr.maboite.webshop.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceReservation {
	
	private Integer id;
	private String nom;
	private LocalDate debut;
	private LocalDate fin;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public LocalDate getDebut() {
		return debut;
	}
	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}
	public LocalDate getFin() {
		return fin;
	}
	public void setFin(LocalDate fin) {
		this.fin = fin;
	}
	
	@Autowired
	private ReservationDao reservationDao;

	public void get() {
		System.out.println("Je suis l'hotel X");
	}
	public void save() {
		System.out.println("Je suis l'hotel X");
	}

	 public ServiceReservation() {
		System.out.println("good choice");
	}

	public ReservationDao reservationDao() {
		return reservationDao();
	}


}
