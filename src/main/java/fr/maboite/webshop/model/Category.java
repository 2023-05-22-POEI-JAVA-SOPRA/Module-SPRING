package fr.maboite.webshop.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "CATEGORY") // Optionnel : explicite la Table en BDD
public class Category {
	
	
	@Id
	private int id;
	private String nom;
	
	@OneToMany(mappedBy = "category")// attribut
	private List<Example> example;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Example> getExample() {
		return example;
	}

	public void setExample(List<Example> example) {
		this.example = example;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [id=" + id + ", nom=" + nom + "]";
	}
	
	
	
	
	
	
	
	

}
