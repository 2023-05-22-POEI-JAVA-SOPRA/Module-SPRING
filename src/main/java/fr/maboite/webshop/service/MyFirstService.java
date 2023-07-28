package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Component
//@Service
public class MyFirstService {
	
	
	@Autowired
	private MySecondService mySecondService;

	public void coucou() {
		System.out.println("Je suis le service");
	}

	
	public MyFirstService() {
		
		System.out.println("Je teste !!!");
	}
	

	public MySecondService getMySecondService() {
		return mySecondService;
	}

}

/*
 * public MyFirstService() { if((MyFirstService) != null) {
 * System.out.println("Je teste !!!"); } }
 */