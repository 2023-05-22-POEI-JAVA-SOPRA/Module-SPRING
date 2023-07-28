package fr.maboite.webshop.model;

import java.time.LocalDate;

public class Reservation {
	

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

	public Reservation( String nom, LocalDate debut, LocalDate fin) {
		super();
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
	}

	public Reservation() {
		super();

	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", nom=" + nom + ", debut=" + debut + ", fin=" + fin + "]";
	}
	
	
	
	

}
