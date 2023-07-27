package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class SecondServiceAc {

	public SecondServiceAc() {
		System.out.println("2ème service");
	}
	
	public void coucou() {
		System.out.println("Je suis le second service injecté dans le premier");
	}
	
	public void hello() {
		System.out.println("je suis le second service");
	}


}
