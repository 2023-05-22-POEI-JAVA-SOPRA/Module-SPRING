package fr.exercice.gestionFerme.entity;

public class Animal {

	protected String nom;
	
	public String crie() {
		return this.nom + " : ";
	}

	public Animal(String nom) {
		super();
		this.nom = nom;
	}
	
	
}
