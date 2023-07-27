package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FirstServiceAc {
	
	@Autowired
	private SecondServiceAc monSecondService;
	
	public void coucou() {
		System.out.println("Je suis le service");
	}
	
	public FirstServiceAc() {
		System.out.println("Avec ça j'existe");
	}

	public SecondServiceAc getMonSecondService() {
		return monSecondService;
	}
	
}
