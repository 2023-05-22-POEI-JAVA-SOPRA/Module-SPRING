package fr.exercice.gestionFerme.entity;

public interface Trayable {
	default void traire() {
		System.out.println("On m'a prit mon lait");
	}
}
