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

	public void getById(Integer id) {
		System.out.println("Hotel numéro : " + id + " a été trouvée.");
	}

	public void delById(Integer id) {
		System.out.println("Hotel numéro : " + id + " a été supprimée.");
	}
}
