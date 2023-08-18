package fr.exercice.gestionFerme.entity;

public interface Pondeur {
	default void pondre() {
		System.out.println("Oeuf pondu");
	}
}
