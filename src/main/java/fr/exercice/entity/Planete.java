package fr.exercice.entity;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;

public class Planete {

	@NotNull
	@NotEmpty
	private String nom;
	
	@NotNull
	@Min(value= 9)
	private Integer ordre;

	@NotNull
	@PositiveOrZero
	private long distanceDuSoleil; // en kilomètres

	@NotNull
	@PositiveOrZero
	private long diametre; // en kilomètres

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getOrdre() {
		return ordre;
	}

	public void setOrdre(Integer ordre) {
		this.ordre = ordre;
	}

	public long getDistanceDuSoleil() {
		return distanceDuSoleil;
	}

	public void setDistanceDuSoleil(long distanceDuSoleil) {
		this.distanceDuSoleil = distanceDuSoleil;
	}

	public long getDiametre() {
		return diametre;
	}

	public void setDiametre(long diametre) {
		this.diametre = diametre;
	}

	public Planete(String nom, Integer ordre, long distanceDuSoleil, long diametre) {
		super();
		this.nom = nom;
		this.ordre = ordre;
		this.distanceDuSoleil = distanceDuSoleil;
		this.diametre = diametre;
	}

	public Planete() {
		super();
	}

	@Override
	public String toString() {
		return "Planete : " + nom + ", ordre : " + ordre + ", distanceDuSoleil : " + distanceDuSoleil + " km, diametre : "
				+ diametre + "km";
	}
	
}
