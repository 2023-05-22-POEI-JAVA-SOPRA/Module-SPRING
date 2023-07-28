package fr.tp.plage.entity;



public class Plage {
	
	private Integer id;
	
	private String nom;

	public Plage(Integer id, String nom) {
		this.id = id;
		this.nom = nom;
	}

	public Plage() {
		
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
	
	

}
