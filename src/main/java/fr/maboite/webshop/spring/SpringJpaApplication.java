package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.ExampleService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringJpaApplication {

	public static void main(String[] args) {
		// On démarre le contexte Spring
		// avec la configuration qui se trouve dans SpringConfiguration.class
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {

			ExampleService exampleServiceBean = appContext.getBean(ExampleService.class);
			Example nouvelExample = new Example();
			nouvelExample.setNom("amine");
			nouvelExample.setTaille(1f);
			exampleServiceBean.save(nouvelExample);

			Iterable<Example> allExamples = exampleServiceBean.getAll();
			for (Example example : allExamples) {
				System.out.println("en base j'ai :" + example.getNom());
			}
			Iterable<Example> findByNom = exampleServiceBean.getByNom("marc");
			for (Example example3 : findByNom) {
				System.out.println("le nom est :" + example3.getNom());
			}

			Iterable<Example> findByNometTaille = exampleServiceBean.getByNom("amine");
			for (Example example1 : findByNometTaille) {
				System.out.println("le nom est :" + example1.getNom() + " et son id vaut :" + example1.getId());
			}

			Iterable<Example> findByNomTailleAllIgnoreCase = exampleServiceBean.getByNom("marc");
			for (Example example2 : findByNomTailleAllIgnoreCase) {
				System.out.println(example2);
			}
			/*
			 * Example toto = new Example(); toto.setNom("nani"); toto.setTaille(4f);
			 * exampleServiceBean.save(toto);
			 */

			// System.out.println("appel methode toto");
			/*
			 * List<Example> listtoto = exampleServiceBean.findByNomAndTaille("federer",
			 * 4f); for (Example example : listtoto) {
			 * System.out.println("cet exemple a comme nom :" + listtoto.getNom() +
			 * "et id de :" + example11.getId() + "et la taille :" + example11.getTaille());
			 * }
			 */

			System.out.println("récuperation des exemples par catégories");

			List<Example> exemplesbycategory = exampleServiceBean.findByCategory("POEJAVE");
			for (Example example : exemplesbycategory) {
				System.out.println("cet exemple a comme nom : " + example.getNom() + "et id de :" + example.getId()
						+ ", et la taille :" + example.getTaille()+ ", et sa categorie :" + example.getCategory());
				//System.out.println(exemplesbycategory+"= POEJAVE");
			}

		}
	}

}
