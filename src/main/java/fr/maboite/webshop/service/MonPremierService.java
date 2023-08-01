package fr.maboite.webshop.service;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.correction.service.MonSecondService;
import fr.maboite.webshop.correction.service.simple.MonPremierDao;

@Service
//@Scope("prototype")
public class MonPremierService {
	
	//public static Integer NOMBRE_INSTANCES = 0;
	
	@Value("${prop.nom}")
	private String propNom;

	@Value("${prop.description}")
	private String propDescription;

	public void afficherProp() {
		System.out.println("Nom : " + propNom + ", Description : " + propDescription);
	}

	@Autowired
	private MonPremierDao monPremierDao;

	@Autowired
	private MonSecondService monSecondService;
	
	public void coucou() {
		System.out.println("Coucou du service");
	}
	
	
	public MonPremierService() {
		//NOMBRE_INSTANCES ++;
		System.out.println("Je vis! 1s. Instances numéro : "); //+ NOMBRE_INSTANCES);
	}

	public MonPremierDao getMonPremierDao() {
		return monPremierDao;
	}

	public MonSecondService getMonSecondService() {
		return monSecondService;
	}

}
