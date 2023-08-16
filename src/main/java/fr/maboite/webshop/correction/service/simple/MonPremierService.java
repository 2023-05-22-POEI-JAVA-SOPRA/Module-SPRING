package fr.maboite.webshop.correction.service.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.correction.service.MonSecondService;


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

	@Value("${ma.propriete.1}")
	private String proprieteDeConfiguration = "nom par défaut";

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


	public String getProprieteDeConfiguration() {
		return proprieteDeConfiguration;
	}

	public void setProprieteDeConfiguration(String proprieteDeConfiguration) {
		this.proprieteDeConfiguration = proprieteDeConfiguration;
	}

	/**
	 * Renvoie la somme de a et b
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int sum(int a, int b) {
		return a + b;
	}


}
