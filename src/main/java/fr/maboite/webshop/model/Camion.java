package fr.maboite.webshop.model;

public class Camion {

	private String name;

	public Camion() {
		super();
	}

	public Camion(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Camion [name=" + name + "]";
	}
	
	
}
