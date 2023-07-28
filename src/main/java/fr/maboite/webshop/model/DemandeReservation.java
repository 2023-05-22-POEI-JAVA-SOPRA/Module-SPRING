package fr.maboite.webshop.model;

import java.time.LocalDate;

public class DemandeReservation {

	
	private String nom;
	private LocalDate debut;
	private LocalDate fin;
	private String hotel;
	private String plage;
	public DemandeReservation() {
		super();
		// TODO Auto-generated constructor stub
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
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	public String getPlage() {
		return plage;
	}
	public void setPlage(String plage) {
		this.plage = plage;
	}
	public DemandeReservation(String nom, LocalDate debut, LocalDate fin, String hotel, String plage) {
		super();
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
		this.hotel = hotel;
		this.plage = plage;
	}
	
	
	
	

}
