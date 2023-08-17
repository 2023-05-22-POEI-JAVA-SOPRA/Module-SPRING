package fr.exercice.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import fr.maboite.webshop.model.Example;

@Entity
@Table(name = "Category")
public class Category2 {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	@OneToMany(mappedBy = "category") // Relation One-to-Many avec Example
	private List<Example> examples;

	public void setNom(String nom) {
		this.nom = nom;
	}

	// ... autres getters et setters

	public List<Example> getExamples() {
		return examples;
	}

	public void setExamples(List<Example> examples) {
		this.examples = examples;
	}

}
