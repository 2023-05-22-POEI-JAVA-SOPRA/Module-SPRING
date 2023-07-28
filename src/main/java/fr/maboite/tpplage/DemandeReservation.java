package fr.maboite.tpplage;

import java.time.LocalDate;

public class DemandeReservation {
	String nom;
	LocalDate debut;
	LocalDate fin;
	String plage;
	String hotel;
	
	
	public DemandeReservation(String nom, LocalDate debut, LocalDate fin, String plage, String hotel) {
		super();
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
		this.plage = plage;
		this.hotel = hotel;
	}


	public String getNom() {
		return nom;
	}


	public LocalDate getDebut() {
		return debut;
	}


	public LocalDate getFin() {
		return fin;
	}


	public String getPlage() {
		return plage;
	}


	public String getHotel() {
		return hotel;
	}
}
