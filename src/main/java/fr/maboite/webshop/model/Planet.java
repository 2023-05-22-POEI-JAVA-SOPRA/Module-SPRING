package fr.maboite.webshop.model;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Planet {

	@NotNull @Positive
	private Integer id;
	
	@NotEmpty
	private String name;
	
	@NotNull @Positive
	private Float mass;

	public Planet() {
		super();
	}

	public Planet(Integer id, String name, Float mass) {
		super();
		this.id = id;
		this.name = name;
		this.mass = mass;
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getMass() {
		return mass;
	}

	public void setMass(Float mass) {
		this.mass = mass;
	}

	@Override
	public String toString() {
		return "Planet [id=" + id + ", name=" + name + ", mass=" + mass + "]";
	}
	
	
}
