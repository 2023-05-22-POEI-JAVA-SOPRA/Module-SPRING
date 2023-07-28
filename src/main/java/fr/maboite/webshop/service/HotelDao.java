package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class HotelDao {
	
	public void save() {
		System.out.println("Hotel is saved");
	}
	public void get() {
		System.out.println("Hotel is getted");
	}

}
