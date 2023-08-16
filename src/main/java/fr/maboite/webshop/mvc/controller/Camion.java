package fr.maboite.webshop.mvc.controller;

public class Camion {

	private Integer id;
	
	private String name;
	
	private boolean isDaily;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isDaily() {
		return isDaily;
	}

	public void setDaily(boolean isDaily) {
		this.isDaily = isDaily;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Camion [id=" + id + ", name=" + name + ", isDaily=" + isDaily + "]";
	}
	
	
}
