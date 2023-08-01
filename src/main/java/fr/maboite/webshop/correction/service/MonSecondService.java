package fr.maboite.webshop.correction.service;

import org.springframework.stereotype.Service;

@Service
public class MonSecondService {

	public void coucouDeux() {
		System.out.println("Coucou du deuxieme service");
	}

	public MonSecondService() {
		System.out.println("Je vis aussi. 2s");
	}

}
