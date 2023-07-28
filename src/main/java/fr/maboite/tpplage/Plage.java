package fr.maboite.tpplage;

import java.util.Objects;

public class Plage {

	Integer id;
	String nom;
	
	
	public Plage() {
		super();
	}


	public Plage(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}


	@Override
	public String toString() {
		return "Plage [id=" + id + ", nom=" + nom + "]";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plage other = (Plage) obj;
		return Objects.equals(id, other.id) && Objects.equals(nom, other.nom);
	}
	
	
}
