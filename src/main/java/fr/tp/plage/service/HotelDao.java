package fr.tp.plage.service;

import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Hotel;

@Component
public class HotelDao {
	
	private Hotel hotels = new Hotel(2,"LUXE RESORT","Addis-Abeba");
	
	public Hotel save(Hotel hotel) {
		
		System.out.println("appel a la methode save de l'hotel");

		return hotel;
	}
	
	public Hotel get(Integer id) {
		
		System.out.println("appel a la methode get de l'hotel");
		Hotel newHotel = new Hotel();
		
		newHotel.setId(id);
		newHotel.setNom(hotels.getNom());
		newHotel.setVille(hotels.getVille());
		return newHotel;

	}

}
