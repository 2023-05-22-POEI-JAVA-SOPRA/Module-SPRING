package fr.maboite.webshop.correction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

//@Scope("prototype")
public class MonPremierService {

	@Autowired
	private MonPremierDao monPremierDao;

	@Autowired
	private MonSecondService monSecondService;
	
	public void coucou() {
		System.out.println("Coucou du service");
	}

	public MonPremierService() {
		System.out.println("Je vis! 1s");
	}

	public MonPremierDao getMonPremierDao() {
		return monPremierDao;
	}

	public MonSecondService getMonSecondService() {
		return monSecondService;
	}

}
