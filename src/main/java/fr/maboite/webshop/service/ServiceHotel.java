package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServiceHotel {
	
	private Integer id;
	private String nom;
	private String ville;
	
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
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	@Autowired
	private HotelDao hotelDao;

	public void get() {
		System.out.println("Je suis l'hotel X");
	}
	public void save() {
		System.out.println("Je suis l'hotel X");
	}

	 public ServiceHotel() {
		 System.out.println("welcome to hotel ");
	}
	public HotelDao hotelDao() {
		return hotelDao();
	}
	
	

}
