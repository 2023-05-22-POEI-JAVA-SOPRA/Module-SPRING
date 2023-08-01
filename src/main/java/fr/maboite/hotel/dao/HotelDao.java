package fr.maboite.hotel.dao;

import org.springframework.stereotype.Component;

import fr.maboite.hotel.entity.Hotel;

@Component
public class HotelDao {
	
	public Hotel get(Integer id) {
		System.out.println("Get Hotel Dao " + id);
		return new Hotel();
	}
	
	public Hotel save(Hotel hotel) {
		System.out.println("Save Hotel Dao");
		return hotel;
	}

}