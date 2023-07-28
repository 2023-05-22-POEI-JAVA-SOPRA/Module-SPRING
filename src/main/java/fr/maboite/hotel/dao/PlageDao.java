package fr.maboite.hotel.dao;

import org.springframework.stereotype.Component;

import fr.maboite.hotel.entity.Plage;

@Component
public class PlageDao {
	
	public Plage get(Integer id) {
		System.out.println("Get Plage Dao " + id);
		return new Plage();
	}
	
	public Plage save(Plage plage) {
		System.out.println("Save Plage Dao");
		return plage;
	}
	
}
