package fr.maboite.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.plage.dao.HotelDao;
import fr.maboite.webshop.model.HotelPojo;

@Service
public class HotelServices {
	
	@Autowired
	private HotelDao hotelDao;
	
	public HotelPojo save(HotelPojo hotel) {
		return this.hotelDao.save(hotel);
	}
}
