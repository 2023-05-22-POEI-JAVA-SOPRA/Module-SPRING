package fr.tp.plage.entity;


public class Hotel {
	
	private Integer id;
	
	private String nom;
	
	private String ville;
	
	

	public Hotel(Integer id, String nom, String ville) {
		
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
	
	

}
