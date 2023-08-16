package fr.maboite.webshop.tp_plages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.tp_plages.dao.hotelDao;
import fr.maboite.webshop.tp_plages.model.Hotel;

@Service
public class serviceHotel {
	
	private hotelDao monHotelDao;
	
	
	@Autowired
	public serviceHotel(hotelDao monHotelDao) {
		this.monHotelDao = monHotelDao;
	}

	public Hotel saveHotel(Hotel hotel) {
		System.out.println("serviceHotel --> Methode saveHotel appelee");
		System.out.println("sauvegarde de l'hotel : "+hotel);
		return monHotelDao.saveHotel(hotel);
	}
	
	public Hotel getHotel(Integer id) {
		System.out.println("serviceHotel --> Methode getHotel appelee");
		System.out.println("get hotel id : "+id);
		return monHotelDao.getHotel(id); 
	}
}
