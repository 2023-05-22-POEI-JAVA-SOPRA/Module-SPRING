package fr.maboite.webshop.spring;

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
			System.out.println(exampleService.delete(4l));
		}
	}
}
