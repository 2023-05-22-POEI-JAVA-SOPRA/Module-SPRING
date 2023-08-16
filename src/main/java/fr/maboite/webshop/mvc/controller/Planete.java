package fr.maboite.webshop.mvc.controller;

public class Planete{
	
	private Integer id;
	
	private String name;
	
	private Double weight;
	
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
