package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.HotelDao;
import fr.maboite.webshop.pojo.Hotel;

@Component
public class ServiceHotel {


	@Autowired
	HotelDao hotelDao;

	
	public Hotel get(Integer id) {
		System.out.println("coucou get service hotel");
		return hotelDao.get(id);
	}
	
	public Hotel save(Hotel hotel) {
		System.out.println("coucou save service hotel");
		return hotelDao.save(hotel);
	}
}
