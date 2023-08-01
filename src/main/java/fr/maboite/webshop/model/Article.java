package fr.maboite.webshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

;

@Entity @Table(name="T_Articles")
public class Article {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY )
	@Column(name="idarticle")
	private Integer idArticle;
	@Column(length  = 30)
	@NotNull
	private String description;
	@Column(length  = 30)
	@NotNull
	private String brand;
	@NotNull
	@Column(name="unitaryprice")
	private double unitaryPrice;
	
	public Integer getIdArticle() {
		return idArticle;
	}
	public void setIdArticle(Integer idArticle) {
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
	public double getUnitaryPrice() {
		return unitaryPrice;
	}
	public void setUnitaryPrice(double unitaryPrice) {
		this.unitaryPrice = unitaryPrice;
	}
	public Article(String description, String brand, double unitaryPrice) {
	
		this.description = description;
		this.brand = brand;
		this.unitaryPrice = unitaryPrice;
	}
	public Article() {

	}
	@Override
	public String toString() {
		return "Article [idArticle=" + idArticle + ", description=" + description + ", brand=" + brand
				+ ", unitaryPrice=" + unitaryPrice + "]";
	}
	
	
}
