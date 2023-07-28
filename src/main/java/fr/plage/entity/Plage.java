package fr.plage.entity;

import org.springframework.stereotype.Component;

@Component
public class Plage {

	private Integer idPlage;

	private String nom;

	public Plage(Plage plage) {
		this.idPlage = plage.idPlage;
		this.nom = plage.nom;
	}

	public Plage() {
	}

	public Integer getIdPlage() {
		return idPlage;
	}

	public void setIdPlage(Integer idPlage) {
		this.idPlage = idPlage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Override
	public String toString() {
		return "Plage [idPlage=" + idPlage + ", nom=" + nom + "]";
	}

}
