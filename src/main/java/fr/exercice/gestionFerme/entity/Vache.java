package fr.exercice.gestionFerme.entity;

public class Vache extends Animal{
	
	public Vache(String nom) {
		super(nom);
	}

	@Override
	public String crie() {
		return super.crie() + "Meeeeuuuuuuuuh";
	}
	
	
}
