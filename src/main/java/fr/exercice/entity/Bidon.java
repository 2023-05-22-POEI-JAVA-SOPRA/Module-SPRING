package fr.exercice.entity;

public class Bidon {

	private String nom;

	private Boolean isAffichable;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Boolean getIsAffichable() {
		return isAffichable;
	}

	public void setIsAffichable(Boolean isAffichable) {
		this.isAffichable = isAffichable;
	}

	public Bidon(String nom, Boolean isAffichable) {
		super();
		this.nom = nom;
		this.isAffichable = isAffichable;
	}

	public Bidon() {
		super();
	}

}
