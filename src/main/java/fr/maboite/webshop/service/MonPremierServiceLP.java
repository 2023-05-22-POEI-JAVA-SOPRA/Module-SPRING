package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonPremierServiceLP {
	//Essai pour l'exercice de base
	@Autowired
	private MonPremierDaoLP monPremierDaoLP;
	
	//Application du bonus
	@Autowired
	private MonSecondServiceLPSERVICE secondService;
	
	public void printServiceLpTest() {
		System.out.println("Service Laurent P Test");
	}
	
	public MonPremierDaoLP getMonPremierDaoLP() {
		return monPremierDaoLP;
	}
	
	//Getter pour faire le bonus
	public MonSecondServiceLPSERVICE getMonSecondService() {
		return secondService;
	}
}
