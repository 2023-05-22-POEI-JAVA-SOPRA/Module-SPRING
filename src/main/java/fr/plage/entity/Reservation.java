package fr.plage.entity;

import java.time.LocalDate;
import org.springframework.stereotype.Component;

@Component
public class Reservation {

	private Integer idReservation;

	private String nom;

	private LocalDate debut;

	private LocalDate fin;

	public Integer getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Integer idReservation) {
		this.idReservation = idReservation;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public LocalDate getDebut() {
		return debut;
	}

	public void setDebut(LocalDate debut) {
		this.debut = debut;
	}

	public void setDebut(Integer annee, Integer mois, Integer jour) {
		this.debut = LocalDate.of(annee, mois, jour);
	}
	// .plusDays(int) rajoute un nombre de jour à la date

	public LocalDate getFin() {
		return fin;
	}

	public void setFin(LocalDate fin) {
		this.fin = fin;
	}

	public void setFin(Integer annee, Integer mois, Integer jour) {
		this.fin = LocalDate.of(annee, mois, jour);
	}

	public Reservation(Reservation reservation) {
		this.idReservation = reservation.idReservation;
		this.nom = reservation.nom;
		this.debut = reservation.debut;
		this.fin = reservation.fin;
	}

	@Override
	public String toString() {
		return "Reservation [idReservation=" + idReservation + ", nom=" + nom + ", debut=" + debut + ", fin=" + fin
				+ "]";
	}

	public Reservation() {
		super();
	}

}
