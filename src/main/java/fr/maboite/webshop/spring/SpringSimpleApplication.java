package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.spring.real.configuration.MaConfigurationFacile;
import fr.maboite.webshop.correction.service.MonPremierService;
import fr.maboite.webshop.correction.service.MonSecondService;

public class SpringSimpleApplication {

	public static void main(String[] args) {

		// Démarre le contexte Spring
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				MaConfigurationFacile.class)) {
			// et scanne le package "fr.maboite.webshop.correction"
			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			// MaConfigurationFacile monPremierBeanSpring =
			// appContext.getBean(MaConfigurationFacile.class);
			MonPremierService monPremierService = appContext.getBean(MonPremierService.class);
			MonSecondService monSecondService = appContext.getBean(MonSecondService.class);
			Example monExample = appContext.getBean(Example.class);
			MonPremierService maPropConfig = appContext.getBean(MonPremierService.class);

			// Opérations sur les objets ...
			monExample.giveExample();
			monPremierService.coucou();
			monSecondService.coucouDeux();
			maPropConfig.afficherProp();

		}
	}
}
