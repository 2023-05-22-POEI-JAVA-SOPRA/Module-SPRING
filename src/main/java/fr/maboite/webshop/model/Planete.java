package fr.maboite.webshop.model;

public class Planete {

	private Integer id;

	private String nom;

	private Integer masse;

	private Integer periodeOrbitale;

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

	public Integer getMasse() {
		return masse;
	}

	public void setMasse(Integer masse) {
		this.masse = masse;
	}

	public Integer getPeriodeOrbitale() {
		return periodeOrbitale;
	}

	public void setPeriodeOrbitale(Integer periodeOrbitale) {
		this.periodeOrbitale = periodeOrbitale;
	}

}
