package fr.maboite.webshop.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table( name= "ecoles")
public class Ecole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	@Column(name = "max_capacity")
	private Integer maxCapacity;
	
	

	public Integer getMaxCapacity() {
		return maxCapacity;
	}

	public void setMaxCapacity(Integer maxCapacity) {
		this.maxCapacity = maxCapacity;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Ecole( String nom, Integer maxCapacity) {
		super();
		this.nom = nom;
		this.maxCapacity=maxCapacity;
	}

	@Override
	public String toString() {
		return "Ecole [id=" + id + ", nom=" + nom + ", maxCapacity=" + maxCapacity + "]";
	}

	public Ecole() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
