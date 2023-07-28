package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicePlage {
	
	private Integer id;
	private String nom;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	@Autowired
	private PlageDao plageDao;

	public void get() {
		System.out.println("Je suis l'hotel X");
	}
	public void save() {
		System.out.println("Je suis l'hotel X");
	}

	  public ServicePlage() {
	
		System.out.println("welcome to plage ");
	}

	public PlageDao plageDao() {
		return plageDao();
	}


}
