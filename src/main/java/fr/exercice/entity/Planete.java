package fr.exercice.entity;

public class Planete {

	private String nom;

	private Integer ordre;

	private long distanceDuSoleil; // en kilomètres

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

}
