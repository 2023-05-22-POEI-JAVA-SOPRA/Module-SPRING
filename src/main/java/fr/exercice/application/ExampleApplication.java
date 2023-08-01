package fr.exercice.application;

import java.util.List;

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
//			Example example = new Example();
//			exampleService.save(example);
//			exampleService.deleteById(2l);
//			exampleService.deleteById(3l);
//			exampleService.deleteById(14l);
//			exampleService.deleteById(15l);

			List<Example> listExNom = exampleService.getByCategory_Nom("Maison");
			for (Example example : listExNom) {
				System.out.println(example.getNom());
			}
//			
//			List<Example> listExNom2 = exampleService.getByNom2("genereux");
//			for (Example example : listExNom2) {
//				System.out.println(example.getNom());
//			}

			Iterable<Example> listExamples = exampleService.getAll();
			for (Example example2 : listExamples) {
				System.out.println("Id : " + example2.getId() + ", Nom : " + example2.getNom() + ", Category : "
						+ example2.getCategory().getNom());
			}
		}
	}
}
