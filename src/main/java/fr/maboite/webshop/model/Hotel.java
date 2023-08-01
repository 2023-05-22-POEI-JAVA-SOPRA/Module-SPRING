package fr.maboite.webshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity @Table
public class Hotel {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nom;
	private String ville;

	
//	public Reservation getReservation() {
//		return reservation;
//	}
//
//	public void setReservation(Reservation reservation) {
//		this.reservation = reservation;
//	}

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
	
	public String getVille() {
		return ville;
	}
	
	public void setVille(String ville) {
		this.ville = ville;
	}

	
	public Hotel() {
		super();
	}

	public Hotel(Integer id, String nom, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
	}

	
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nom=" + nom + ", ville=" + ville + "]";
	}
	
	
}
