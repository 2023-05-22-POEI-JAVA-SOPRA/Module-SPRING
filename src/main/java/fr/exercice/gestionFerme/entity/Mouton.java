package fr.exercice.gestionFerme.entity;

public class Mouton extends Animal{

	public Mouton(String nom) {
		super(nom);
	}

	@Override
	public String crie() {
		return super.crie() + "Beeeeeeeeh";
	}
}
