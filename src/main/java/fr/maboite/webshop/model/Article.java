package fr.maboite.webshop.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "Article")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	
	@Size(max=30, message="tu as fait une erreur")
	private String description;
	
	@Size(max=30, message="tu as fait une erreur")
	private String brand;
    
	@NotNull
	@Column(name = "unitaryprice")
	private float unitaryPrice;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getUnitaryPrice() {
		return unitaryPrice;
	}

	public void setUnitaryPrice(float unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Article( String description,String brand, float unitaryPrice) {
		super();
		this.description = description;
		this.brand = brand;
		this.unitaryPrice = unitaryPrice;
	}

	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", description=" + description + ", brand=" + brand + ", unitaryPrice="
				+ unitaryPrice + "]";
	}
	
	

}
