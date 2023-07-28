package fr.maboite.tpplage;

import java.time.LocalDate;
import java.util.Objects;

public class Reservation {

	Integer id;
	String nom;
	LocalDate debut;
	LocalDate fin;
	
	
	public Reservation() {
		super();
	}


	public Reservation(Integer id, String nom, LocalDate debut, LocalDate fin) {
		super();
		this.id = id;
		this.nom = nom;
		this.debut = debut;
		this.fin = fin;
	}


	@Override
	public String toString() {
		return "Reservation [id=" + id + ", nom=" + nom + ", debut=" + debut + ", fin=" + fin + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Reservation other = (Reservation) obj;
		return Objects.equals(debut, other.debut) && Objects.equals(fin, other.fin) && Objects.equals(id, other.id)
				&& Objects.equals(nom, other.nom);
	}
	
	
}
