package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringJpaApplication {

	public static void main(String[] args) {
		//On démarre le contexte Spring
		//avec la configuration qui se trouve dans SpringConfiguration.class
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
//			ExampleService exampleServiceBean = appContext.getBean(exampleService.class);
//			
//			exampleServiceBean.save(new Example());
//			nouvelExample.setNom("new name");
//			exampleServiceBean.save(nouvelExample);
			
//			Iterable<Example> allExamples = exampleServiceBean.getAll();
//			for (Example example : allExamples) {
//				System.out.println("En base, j'ai un exemple avec le nom : "+ example.getNom());
//			}
			
		}
	}

}
