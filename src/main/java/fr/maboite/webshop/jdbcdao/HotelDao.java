package fr.maboite.webshop.jdbcdao;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Reservation;

//@Component
//@PropertySource("classpath:TP.properties")

@Repository
public interface HotelDao extends CrudRepository<Hotel, Long>{
	
	List<Hotel> findByNom(String nom);

	List<Hotel> findByVille(String ville);
	

	
//	@Value(value="${Hotel.id}")
//	private Integer idHotel;
//	
//	@Value(value="${Hotel.nom}")
//	private String nomHotel;
//	
//	@Value(value="${Hotel.ville}")
//	private String ville;
//	
//	public Hotel save(Hotel hotel) {
//		System.out.println("Appel de save HotelDao");
//		hotel.setId(idHotel);
//		hotel.setNom(nomHotel);
//		hotel.setVille(ville);
//		return hotel;
//	}
//
//	public Hotel get(Integer id) {
//		System.out.println("Appel de get HotelDao");
//		Hotel hotel = new Hotel();
//		hotel.setId(id);
//		hotel.setNom(nomHotel);
//		hotel.setVille(ville);
//		return hotel;
//	}
	
	

}
