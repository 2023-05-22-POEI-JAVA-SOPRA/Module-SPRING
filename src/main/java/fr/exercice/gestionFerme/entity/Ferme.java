package fr.exercice.gestionFerme.entity;

import java.util.ArrayList;
import java.util.Collection;

public class Ferme {
	public Collection<Animal> animaux;
	
	public Ferme() {
		this.animaux = new ArrayList<>();
		Vache vache = new Vache("Marguerite");
		Poule poule = new Poule("Tofu");
		Mouton mouton = new Mouton("Bouftou");
		this.animaux.add(vache);
		this.animaux.add(poule);
		this.animaux.add(mouton);
	}
	
	public StringBuilder toutLeMondeCrie() {
		StringBuilder brouhaha = new StringBuilder();
		for (Animal animal : animaux) {
			brouhaha.append(animal.crie()+"\n");
		}
		return brouhaha;
	}
}
