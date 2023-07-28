package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Value;

public class SuperDao {

	@Value("${ma.propriete.2}")
	String name;
	
	public void ok() {
		System.out.println("in SuperDao");
	}

	public String getName() {
		return name;
	}
	
	
	
	
}
