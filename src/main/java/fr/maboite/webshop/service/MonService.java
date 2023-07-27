package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class MonService {
	
	public MonService() {
		System.out.println("Je suis dans mon service à moi");
	}
	
	public void testMethod() {
		System.out.println("on test mon service");
	}

}
