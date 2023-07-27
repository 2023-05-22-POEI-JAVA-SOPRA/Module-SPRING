package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.MonSecondService;
import fr.maboite.webshop.spring.real.configuration.MaConfigurationFacile;

public class SpringSimpleApplication {

	public static void main(String[] args) {

		// Démarre le contexte Spring
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				MaConfigurationFacile.class)) {
			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			MaConfigurationFacile monPremierBeanSpring = appContext.getBean(MaConfigurationFacile.class);

			// Opérations sur les objets ...
			monPremierBeanSpring.example().giveExample();

		}

	}

}