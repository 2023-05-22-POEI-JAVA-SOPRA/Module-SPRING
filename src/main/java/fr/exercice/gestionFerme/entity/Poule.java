package fr.exercice.gestionFerme.entity;

public class Poule extends Animal implements Pondeur {

	public Poule(String nom) {
		super(nom);
	}

	@Override
	public String crie() {
		return super.crie() + "Cot Cot";
	}

}
