package vac.webshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "T_articles")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idarticle;

	private String description;

	private String brand;

	@Column(name="unitaryprice")
	private Float price;
	
	private static final Double maxPrice = 500.00;

	public static Double getMaxprice() {
		return maxPrice;
	}

	public Integer getIdArticle() {
		return idarticle;
	}

	public void setIdArticle(Integer idArticle) {
		this.idarticle = idArticle;
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

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}
}
