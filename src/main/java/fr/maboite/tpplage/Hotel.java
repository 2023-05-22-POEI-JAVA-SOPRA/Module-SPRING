package fr.maboite.tpplage;

import java.util.Objects;

public class Hotel {

	Integer id;
	String nom;
	String ville;
	
	
	public Hotel() {
		super();
	}


	public Hotel(Integer id, String nom, String ville) {
		super();
		this.id = id;
		this.nom = nom;
		this.ville = ville;
	}


	@Override
	public String toString() {
		return "Hotel [id=" + id + ", nom=" + nom + ", ville=" + ville + "]";
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return Objects.equals(id, other.id) && Objects.equals(nom, other.nom) && Objects.equals(ville, other.ville);
	}
}
