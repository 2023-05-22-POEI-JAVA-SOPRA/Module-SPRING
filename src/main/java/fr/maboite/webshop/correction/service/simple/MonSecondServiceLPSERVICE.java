package fr.maboite.webshop.correction.service.simple;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


//Creation de MonSecondServiceLPSERVICE pour tester l'annotation @Service
//Quelle est la différence ? Aucune idée pour l'instant
//Note a moi même, ces noms de classes puent et ça m'embrouille
@Service
public class MonSecondServiceLPSERVICE {
	
	@Autowired
	private MonSecondDaoLpSERVICE monSdDaoLpService;
	
	//Constructeur
	public MonSecondServiceLPSERVICE(){
		System.out.println("Je vis @SERVICE !!!!");
	}
	
	
	public void printSdService() {
		System.out.println("Second service @SERVICE Laurent P Test");
	}
	
	
	
	public MonSecondDaoLpSERVICE getMonSecondDao() {
		return monSdDaoLpService;
	}

}
