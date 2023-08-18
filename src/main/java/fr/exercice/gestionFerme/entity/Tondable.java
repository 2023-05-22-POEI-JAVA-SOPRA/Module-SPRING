package fr.exercice.gestionFerme.entity;

public interface Tondable {
	default void tondre() {
		System.out.println("On m'a tondu");
	}
}
