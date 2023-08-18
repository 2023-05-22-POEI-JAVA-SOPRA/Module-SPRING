package fr.exercice.gestionFerme.entity;

public class Mouton extends Animal implements Tondable, Trayable{

	public Mouton(String nom) {
		super(nom);
	}

	@Override
	public String crie() {
		return super.crie() + "Beeeeeeeeh";
	}

}
