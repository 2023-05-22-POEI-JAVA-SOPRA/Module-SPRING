package fr.planets.model;

public class Planet {

	private String name;
	private Integer id;
	
	
	public Planet(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	
	public Planet() {
		super();
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

	@Override
	public String toString() {
		return "Planete [name=" + name + ", id=" + id + "]";
	}
	
}
