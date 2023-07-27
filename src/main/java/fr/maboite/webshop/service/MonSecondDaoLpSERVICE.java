package fr.maboite.webshop.service;


import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;


//Creation de MonSecondDaoLpSERVICE pour tester l'annotation @Service
//C'était pas demandé, j'avais pas compris mais je le garde
@Service
public class MonSecondDaoLpSERVICE {

	//@Bean ceci était un test pour comprendre le fonctionnement @Configuration et @Bean
	//Exo 2 bonus

	public void printMonSdDaoLpSERVICE() {
		System.out.println("@service Je teste mon second dao mais avec @Service !");
	}
	

	
}
