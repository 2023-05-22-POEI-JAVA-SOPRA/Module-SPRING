package fr.exercice.gestionFerme;

import fr.exercice.gestionFerme.entity.Ferme;
import fr.exercice.gestionFerme.entity.Mouton;

public class accueilFerme {

	public static void main(String[] args) {
		Ferme maFerme = new Ferme();
		Mouton mouton = new Mouton("Boufcool");
		maFerme.animaux.add(mouton);
		System.out.println(maFerme.toutLeMondeCrie());
		
		mouton.traire();
		mouton.tondre();
	}
}
