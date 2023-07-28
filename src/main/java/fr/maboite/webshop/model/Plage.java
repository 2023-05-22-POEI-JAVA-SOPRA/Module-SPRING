package fr.maboite.webshop.model;

public class Plage {

	private Integer id;

	private String nom;

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

	public Plage(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}

	public Plage() {
		super();
	}

}
