package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class MonSecondService {

	public void coucouDeux() {
		System.out.println("Coucou du deuxieme service");
	}

	public MonSecondService() {
		System.out.println("Je vis aussi. 2s");
	}

}
