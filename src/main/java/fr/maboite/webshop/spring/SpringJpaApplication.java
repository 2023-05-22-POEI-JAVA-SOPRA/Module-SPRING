package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.ExampleService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringJpaApplication {

	public static void main(String[] args) {
		//On démarre le contexte Spring
		//avec la configuration qui se trouve dans SpringConfiguration.class
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			ExampleService exampleServiceBean = appContext.getBean(ExampleService.class);
			Example ex = new Example();
			ex.setNom("michel");
			exampleServiceBean.save(ex);
			
			
			Iterable<Example> allExamples = exampleServiceBean.getAll();
			
			for (Example example : allExamples) {
				System.out.println("En base j'ai un example avec le nom : " + example.getNom());
			}
			
			Example ex1 = exampleServiceBean.getById((long) 1);
			System.out.println("nom1 : " + ex1.getNom());
			
//			exampleServiceBean.deleteById((long) 3);
			
			List<Example> exs = exampleServiceBean.getByNom("michel");
			for (Example example : exs) {
				System.out.println("id : " + example.getId() + " nom (michel): " + example.getNom());
			}
			
			List<Example> getMichels = exampleServiceBean.getByNomContaining("mich");
			for (Example example : getMichels) {
				System.out.println("contains 'mich' : " + example.getNom());
			}
			
			List<Example> getMichelsIC = exampleServiceBean.getByNomContainingIgnoreCase("mich");
			for (Example example : getMichelsIC) {
				System.out.println("contains 'mich' (ignore case) : " + example.getNom());
			}
			
			List<Example> getOuiOui25 = exampleServiceBean.getByNomAndTaille("OuiOui", 25f);
			for (Example example : getOuiOui25) {
				System.out.println("nom = 'OuiOui' and taille = 25 : " + example.getNom() + " , " + example.getTaille());
			}
			
			List<Example> getOuiOuior25 = exampleServiceBean.getByNomOrTaille("OuiOui", 25f);
			for (Example example : getOuiOuior25) {
				System.out.println("nom = 'OuiOui' or taille = 25 : " + example.getNom() + " , " + example.getTaille());
			}
		}
	}

}
