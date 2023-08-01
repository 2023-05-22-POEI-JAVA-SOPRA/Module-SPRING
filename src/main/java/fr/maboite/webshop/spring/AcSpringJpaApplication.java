package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.FirstServiceSpringDataAc;
import fr.maboite.webshop.spring.real.configuration.AcSpringConfig;

public class AcSpringJpaApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				AcSpringConfig.class)) {
			System.out.println("contexte démarré");

//		 je récupère le bean instancié par @config de spring
			FirstServiceSpringDataAc exampleService = appContext.getBean(FirstServiceSpringDataAc.class);

//		 utilisation des objets
			Iterable<Example> allExamples = exampleService.getAll();
			for (Example example : allExamples) {
				System.out.println("Nom présent dans la base : " + example.getNom());

			}

//			depuis java5 autoboxing il fait lui même le parse de long en interger avec la notation 2l par exemple
//			System.out.println(exampleService.delete(4l));

			List<Example> myExample = exampleService.findByNom("Bob");
			for (Example example : myExample) {
				System.out.println("Bob mesure " + example.getTaille() + "m");
			}
			
			List<Example> myExample2 = exampleService.findByNomIgnoreCase("alice");
			for (Example example : myExample2) {
				System.out.println("Alice mesure " + example.getTaille() + "m");
			}
			
			List<Example> myExample3 = exampleService.findByNomIgnoreCase("aLiCe");
			for (Example example : myExample3) {
				System.out.println("ALICE mesure " + example.getTaille() + "m");
			}

			
			System.out.println("==== By1nom ET ByTaille");
			List<Example> myExample4 = exampleService.findByNomAndTailleIgnoreCase("charlie", (float) 1.75);
			for (Example example : myExample4) {
				System.out.println("exemple 4 fonctionne");
			}
			
			System.out.println("===Utilisation @Query =====");
			// Utiliser la méthode getNomQuery pour récupérer les exemples ayant un certain nom
			List<Example> myExample5 = exampleService.findByNomQuery("Bob");
			for (Example example : myExample5) {
			    System.out.println("Exemple avec le nom Bob : " + example.getNom());
			}
			
			System.out.println("===Utilisation @Query 2attributs =====");
			List<Example> myExample6 = exampleService.findByNomTailleQuery("David", 1.5f);
			for (Example example : myExample6) {
			    System.out.println("Exemple avec : " + example.getNom()+ " qui mesure " + example.getTaille());
			}
			
			System.out.println("===Utilisation @Query Nom décroissant =====");
			List<Example> myExample7 = exampleService.orderNomByDesc();
			for (Example example : myExample7) {
			    System.out.println("Liste des noms : " + example.getNom());
			}
			
			System.out.println("===Récupération des Noms par nom de categorie =====");
			List<Example> nameByCat = exampleService.findByCategory("homme");
			for (Example example : nameByCat) {
				System.out.println(example.getNom() +" est un(e) " + example.getCategorie().getNom());
			}
		}
	}
}
