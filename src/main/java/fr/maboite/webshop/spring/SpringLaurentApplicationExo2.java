package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierServiceLP;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfLP;

public class SpringLaurentApplicationExo2 {

	public static void main(String[] args) {
		// Démarre le contexte Spring
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringSimpleConfLP.class)) {


			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			SpringSimpleConfLP monPremierBeanSpring = appContext.getBean(SpringSimpleConfLP.class);

			// Opérations sur les objets ...
			monPremierBeanSpring.monServiceTest().printServiceLpTest();
			SpringSimpleConfLP maConf= appContext.getBean(SpringSimpleConfLP.class);
			System.out.println(maConf.getMaVariable());

		}


	}

}
