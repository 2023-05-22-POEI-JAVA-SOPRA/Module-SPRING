package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Hotel;

@Component
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	
	public Hotel save(Hotel hotel)
	{	
		Hotel hotelToReturn = hotelDao.save(hotel);
		System.out.println(hotelToReturn);
		return hotelToReturn;
		
	}
	public Hotel get(Integer id)
	{
		return hotelDao.get(id);

	}
	
	public HotelService()
	{
		System.out.println("HotelService created");
	}
	
	
}
