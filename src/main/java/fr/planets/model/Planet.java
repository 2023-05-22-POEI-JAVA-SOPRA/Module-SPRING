package fr.planets.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Planet {

	@NotNull
	@NotEmpty
	private String name;
	
	@NotNull
	private Integer id;
	
	@Positive
	@NotNull
	private Integer diametre;
	
	
	public Planet(String name, Integer id, Integer diametre) {
		super();
		this.name = name;
		this.id = id;
		this.diametre=diametre;
	}
	
	public Planet() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	

	public Integer getDiametre() {
		return diametre;
	}

	public void setDiametre(Integer diametre) {
		this.diametre = diametre;
	}

	@Override
	public String toString() {
		return "Planet [name=" + name + ", id=" + id + ", diametre=" + diametre + "]";
	}

	
	
}
