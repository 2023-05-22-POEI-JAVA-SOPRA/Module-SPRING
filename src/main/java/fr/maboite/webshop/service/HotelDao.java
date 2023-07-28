package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Hotel;

@Component 
public class HotelDao{
	
	private static Integer idHotel=0;
	
	public Hotel save(Hotel hotel)
	{
		hotel.setId(++idHotel);
		return hotel;
	}
	
	public Hotel get(Integer id )
	{
		Hotel hotelToGet = new Hotel();
		hotelToGet.setId(id);
		return hotelToGet;
	}
}
