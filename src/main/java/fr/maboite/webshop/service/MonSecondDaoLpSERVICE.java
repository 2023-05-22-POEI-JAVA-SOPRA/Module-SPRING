package fr.maboite.webshop.service;

import org.springframework.stereotype.Service;


//Creation de MonSecondDaoLpSERVICE pour tester l'annotation @Service
//C'était pas demandé, j'avais pas compris mais je le garde
@Service
public class MonSecondDaoLpSERVICE {
	
	public void printMonSdDaoLpSERVICE() {
		System.out.println("@service Je teste mon second dao mais avec @Service !");
	}
	

	
}
