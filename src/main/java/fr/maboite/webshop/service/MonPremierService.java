package fr.maboite.webshop.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.correction.service.simple.MonPremierDao;

@Service
public class MonPremierService {

//	@Autowired
	
	private MonPremierDao monPremierDao;
	
	public void coucou() {
		System.out.println("Je suis le service");
	}
	
	
	public MonPremierService() {
		System.out.println("Je vis !!!");
	}

	public MonPremierDao getMonPremierDao() {
		return monPremierDao;
	}
}
