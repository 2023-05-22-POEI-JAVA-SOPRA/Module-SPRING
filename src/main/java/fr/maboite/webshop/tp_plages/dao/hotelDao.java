package fr.maboite.webshop.tp_plages.dao;

import org.springframework.stereotype.Repository;

import fr.maboite.webshop.tp_plages.model.Hotel;

@Repository
public class hotelDao {

	
	
	public Hotel saveHotel(Hotel hotel) {
		System.out.println("hotelDao --> Methode saveHotel appelee");
		System.out.println("sauvegarde de l'hotel : "+hotel);
		Hotel savedHotel = hotel;
		return savedHotel;
	}
	
	public Hotel getHotel(Integer id) {
		System.out.println("hotelDao --> Methode getHotel appelee");
		System.out.println("get hotel id : "+id);
		return new Hotel(); 
	}
}
