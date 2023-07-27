package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MonPremierService {

	@Autowired
	private MonPremierDao monPremierDao;
	
	@Autowired
	private MonDeuxiemeService deuxiemeServiceInFirst;
	
	

	public MonDeuxiemeService getDeuxiemeServiceInFirst() {
		return deuxiemeServiceInFirst;
	}

	public void setDeuxiemeServiceInFirst(MonDeuxiemeService deuxiemeServiceInFirst) {
		this.deuxiemeServiceInFirst = deuxiemeServiceInFirst;
	}

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
