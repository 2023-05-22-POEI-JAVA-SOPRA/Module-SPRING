package fr.maboite.webshop.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table
public class Reservation {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private LocalDate debut;
	private LocalDate fin;
	
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
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
	
	
	public Reservation() {
		super();
	}
	
	public Reservation(Long id, String nom, LocalDate debut, LocalDate fin) {
		super();
		this.id = id;
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
	}
	
	
	@Override
	public String toString() {
		return "Reservation [id=" + id + ", nom=" + nom + ", debut=" + debut + ", fin=" + fin + "]";
	}
	
	
	
}
