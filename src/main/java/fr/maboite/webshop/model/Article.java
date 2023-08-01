package fr.maboite.webshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity @Table
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_article")
	private Long idArticle;
	
	private String description;
	
	private String brand;
	
	@Column(name="unitary_price")
	private Float unitaryPrice;

	public Long getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(Long idArticle) {
		this.idArticle = idArticle;
	}

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

	public Float getUnitaryPrice() {
		return unitaryPrice;
	}

	public void setUnitaryPrice(Float unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	

	public Article(String description,String brand,Float unitaryPrice) {
		super();
		this.description = description;
		this.brand = brand;
		this.unitaryPrice = unitaryPrice;
	}

	public Article(Long idArticle,String description,String brand,Float unitaryPrice) {
		super();
		this.idArticle = idArticle;
		this.description = description;
		this.brand = brand;
		this.unitaryPrice = unitaryPrice;
	}
	public Article() {
		super();
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", description=" + description + ", brand=" + brand
				+ ", unitaryPrice=" + unitaryPrice + "]";
	}
	
	
	
}
