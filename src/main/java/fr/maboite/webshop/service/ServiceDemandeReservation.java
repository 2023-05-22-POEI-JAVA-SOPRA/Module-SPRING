package fr.maboite.webshop.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceDemandeReservation {
	
	private String nom;
	private LocalDate debut;
	private LocalDate fin;
	private String plage;
	private String hotel;
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
	public String getPlage() {
		return plage;
	}
	public void setPlage(String plage) {
		this.plage = plage;
	}
	public String getHotel() {
		return hotel;
	}
	public void setHotel(String hotel) {
		this.hotel = hotel;
	}
	
	@Autowired
	private DemandeReservationDao demandeReservationDao;

	public void checkdispo() {
		System.out.println("vérifier la dispo");
	}
	
	public ServiceDemandeReservation() {
		System.out.println("welcome to our hotel");
	}

	public DemandeReservationDao demandeReservationDao() {
		return demandeReservationDao();
	}
	public String egal(String a) {
		// TODO Auto-generated method stub
		return a;
	}
	

}
