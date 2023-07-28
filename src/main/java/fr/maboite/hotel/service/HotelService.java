package fr.maboite.hotel.service;

import org.springframework.stereotype.Service;

import fr.maboite.hotel.dao.HotelDao;
import fr.maboite.hotel.entity.Hotel;

@Service
public class HotelService {
	
	private HotelDao hDao;
	
	public Hotel getHotel(Integer id) {
		System.out.println("Get Hotel In Service");
		return hDao.get(id);
	}
	
	public Hotel saveHotelDao(Hotel hotel) {
		System.out.println("Save Hotel In Service");
		return hDao.save(hotel);
	}

	public HotelService(HotelDao hDao) {
		System.out.println("Hotel Service");
		this.hDao = hDao;
	}
	
	

}
