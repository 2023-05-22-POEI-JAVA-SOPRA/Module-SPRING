package fr.plage.entity;

import org.springframework.stereotype.Component;

@Component
public class Hotel {

	private Integer idHotel;

	private String nom;

	private String ville;

	public Hotel(Hotel hotel) {
		this.idHotel = hotel.idHotel;
		this.nom = hotel.nom;
		this.ville = hotel.ville;
	}

	public Integer getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(Integer idHotel) {
		this.idHotel = idHotel;
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

}
