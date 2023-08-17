package fr.maboite.webshop.model;

public class Planet {

	private Integer id;
	
	private String name;
	
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
