package fr.exercice.application;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.exercice.service.ExampleService;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class ExampleApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			// et scanne le package "fr.maboite.webshop.correction"
			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			// MaConfigurationFacile monPremierBeanSpring =
			// appContext.getBean(MaConfigurationFacile.class);
			ExampleService exampleService = appContext.getBean(ExampleService.class);

			// Opérations sur les objets ...
			Example example = new Example();
			exampleService.save(example);
			Iterable<Example> listExamples = exampleService.getAll();
			for (Example example2 : listExamples) {
				System.out.println(example2.getId());
			}
			exampleService.deleteById(1l);
		}
	}
}
