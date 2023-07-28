package fr.plage.dao;

import org.springframework.stereotype.Component;
import fr.plage.entity.Hotel;

@Component
public class HotelDao {

	public Hotel save(Hotel hotel) {
		Hotel savedRes = new Hotel(hotel);
		System.out.println("Une réservation a été créée : " + savedRes.toString());
		return savedRes;
	}

	public String getById(Integer id) {
		return "Hotel numéro : " + id + " a été trouvée.";
	}

	public String delById(Integer id) {
		return "Hotel numéro : " + id + " a été supprimée.";
	}
}
