package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Hotel;

@Component
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	
	
	public Hotel save(Hotel hotel) {
		System.out.println("Appel de save HotelService");
		return this.hotelDao.save(hotel);
	}
	
	public Hotel get(Integer id) {
		System.out.println("Appel de get HotelService");
		return this.hotelDao.get(id);
	}

}
