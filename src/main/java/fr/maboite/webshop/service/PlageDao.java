package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class PlageDao {
	
	public void save() {
		System.out.println("Plage is saved");
	}
	public void get() {
		System.out.println("Plage is getted");
	}

}
