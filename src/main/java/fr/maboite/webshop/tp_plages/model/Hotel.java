package fr.maboite.webshop.tp_plages.model;

import org.springframework.stereotype.Component;

public class Hotel {
	private Integer id;
	private String nom;
	private String ville;
	
	
	
	
	public Hotel(Integer id, String nom, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
	}
	
	public Hotel() {

	}
	
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

	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nom=" + nom + ", ville=" + ville + "]";
	}
	
	
	
	
}
