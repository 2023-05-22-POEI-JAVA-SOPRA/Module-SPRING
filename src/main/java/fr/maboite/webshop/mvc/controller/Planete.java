package fr.maboite.webshop.mvc.controller;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

public class Planete{
	
	@PositiveOrZero
	private Integer id;
	
	@NotNull  @NotEmpty @Size(min = 3,message = "Planet name must cointains at least 3 characters")
	private String name;
	
	@NotNull(message = "Planet weight can't be null")  @Positive(message = "Planet weight must be positive")
	private Double weight;
	@NotNull(message = "Planet distance from Earth can't be null")  @PositiveOrZero(message = "Planet distance from Earth  must be positive or equal to zero")
	private Double distanceFromEarth;

	public Integer getId() {
		return id;
	} 

	public Planete(Integer id, String name, Double weight, Double distanceFromEarth) {
		super();
		this.id = id;
		this.name = name;
		this.weight = weight;
		this.distanceFromEarth = distanceFromEarth;
	}
 
	public Planete() {
		// TODO Auto-generated constructor stub
	}
  
	public void setId(Integer id) {
		this.id = id;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Double getDistanceFromEarth() {
		return distanceFromEarth;
	}

	public void setDistanceFromEarth(Double distanceFromEarth) {
		this.distanceFromEarth = distanceFromEarth;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	
	

}
