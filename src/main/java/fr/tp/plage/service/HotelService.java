package fr.tp.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Hotel;


@Component
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	public Hotel save(Hotel hotel) {
		return this.hotelDao.save(hotel);
	}
	
	public Hotel get(Integer id) {
		return this.hotelDao.get(id);
	}	

}
