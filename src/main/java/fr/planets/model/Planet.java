package fr.planets.model;

public class Planet {

	private String name;
	private Integer id;
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
