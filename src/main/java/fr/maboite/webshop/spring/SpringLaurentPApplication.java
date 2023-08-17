package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.correction.service.simple.MonPremierDaoLP;
import fr.maboite.webshop.correction.service.simple.MonPremierServiceLP;
import fr.maboite.webshop.correction.service.simple.MonSecondDaoLpSERVICE;
import fr.maboite.webshop.correction.service.simple.MonSecondServiceLPSERVICE;


public class SpringLaurentPApplication {
	public static void main(String[] args) {

		// Démarre le contexte Spring
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(MonPremierServiceLP.class,
						MonPremierDaoLP.class,MonSecondServiceLPSERVICE.class,
						MonSecondDaoLpSERVICE.class)) {
			
			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			MonPremierServiceLP monPremierBeanSpring = appContext.getBean(MonPremierServiceLP.class);

			// Opérations sur les objets ...
			monPremierBeanSpring.printServiceLpTest();
			monPremierBeanSpring.getMonPremierDaoLP().printDaoLpTest();
			
			
			System.out.println("");
			
			//Application de l'exercice + bonus
			//Pas de bonus++
			MonSecondServiceLPSERVICE monSecondBeanSpring = appContext.getBean(MonSecondServiceLPSERVICE.class);
			
			monSecondBeanSpring.printSdService();
			monSecondBeanSpring.getMonSecondDao().printMonSdDaoLpSERVICE();
			System.out.println("");
			monPremierBeanSpring.getMonSecondService().getMonSecondDao().printMonSdDaoLpSERVICE();
			
		}

	}
}
