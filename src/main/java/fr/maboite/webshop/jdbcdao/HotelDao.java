package fr.maboite.webshop.jdbcdao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.pojo.Hotel;

@Component
public class HotelDao {
	

	/**
	 * Renvoie un hotel avec l'ID correspondant.
	 * @return Hotel
	 */
	public Hotel get(Integer id) {
		Hotel hotel = new Hotel();
		hotel.setId(id);
		hotel.setNom("nomHotel");
		hotel.setVille("villeHotel");
		return hotel;
	}
	

	/**
	 * "Enregistre" un hotel et le renvoie.
	 * @return Hotel
	 */
	public Hotel save(Hotel hotel) {
		Hotel hotelSaved = new Hotel();
		hotelSaved.setId(hotel.getId());
		hotelSaved.setNom(hotel.getNom());
		hotelSaved.setVille(hotel.getVille());
		return hotelSaved;
	}	
}
