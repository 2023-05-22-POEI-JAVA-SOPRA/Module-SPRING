package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Hotel;

@Component
@PropertySource("classpath:TP.properties")

public class HotelDao {
	
	@Value(value="${Hotel.id}")
	private Integer idHotel;
	
	@Value(value="${Hotel.nom}")
	private String nomHotel;
	
	@Value(value="${Hotel.ville}")
	private String ville;
	
	public Hotel save(Hotel hotel) {
		System.out.println("Appel de save HotelDao");
		hotel.setId(idHotel);
		hotel.setNom(nomHotel);
		hotel.setVille(ville);
		return hotel;
	}

	public Hotel get(Integer id) {
		System.out.println("Appel de get HotelDao");
		Hotel hotel = new Hotel();
		hotel.setId(id);
		hotel.setNom(nomHotel);
		hotel.setVille(ville);
		return hotel;
	}

}
