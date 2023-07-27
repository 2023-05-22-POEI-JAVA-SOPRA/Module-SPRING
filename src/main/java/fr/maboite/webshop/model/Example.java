package fr.maboite.webshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // Décrit une entité persistable
@Table(name = "Example") // Optionnel : explicite la Table en BDD
public class Example  {

	@Id // Décrit l’attribut servant d'identifiant et la clé primaire
	// optionnel
	// décrit la méthode de génération de l’identifiant
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	
	private Float taille;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Float getTaille() {
		return taille;
	}

	public void setTaille(Float taille) {
		this.taille = taille;
	}
	
	public void giveExample() {
		System.out.println("Ceci est un exemple");
	}

}
