package fr.EXERCICE.WebShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "T_Articles")
public class Article {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idarticle;
	
	@NotNull
	@Size(min=1,max=30,message="Description entre 1 et 30 caracteres")
	private String description;
	
	@NotNull
	@Size(min=1,max=30,message="Le nommage de la marque doit faire entre 1 et 30 caracteres")
	private String brand;

	@Column(name="unitaryprice")
	@NotNull
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

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Article [idArticle=" + idarticle + ", description=" + description + ", brand=" + brand + ", price="
				+ price + "]";
	}		

}
