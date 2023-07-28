package fr.maboite.plage.dao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.HotelPojo;

@Component
public class HotelDao {
	
	public HotelPojo get(Integer id) {
		System.out.println("méthode get HotelPojo");
		return new HotelPojo();
	}
	
	public HotelPojo save(HotelPojo Hotel) {
		System.out.println("je dois sauvegarder un nouvel hôtel");
		return Hotel;
		
	}
}
