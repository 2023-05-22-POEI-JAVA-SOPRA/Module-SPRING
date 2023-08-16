package fr.maboite.webshop.model;

public class Camion {
	private String name;
	private String brand;
	
	
	public Camion() {
		super();
	}
	public Camion(String name, String brand) {
		super();
		this.name = name;
		this.brand = brand;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Camion [name=" + name + ", brand=" + brand + "]";
	}
	
	
}
