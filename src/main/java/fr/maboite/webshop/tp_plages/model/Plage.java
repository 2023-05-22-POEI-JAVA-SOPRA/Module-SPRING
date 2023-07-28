package fr.maboite.webshop.tp_plages.model;

public class Plage {
	private Integer id;
	private String nom;
	
	
	public Plage() {

	}
	
	public Plage(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
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

	@Override
	public String toString() {
		return "Plage [id=" + id + ", nom=" + nom + "]";
	}
	
	
}
