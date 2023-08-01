package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.ExampleService;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP_SpringData;

public class ApplicationExample {

	

	public static void main(String[] args) {
		
		

		
		try (AnnotationConfigApplicationContext exempleContexte =
				new AnnotationConfigApplicationContext(ConfigurationTP_SpringData.class)) {
			
			ExampleService exampleService = exempleContexte.getBean(ExampleService.class);
			
			
			
			
			
//			Example exemple = new Example();
//			exemple.setId((long) 3);
//			exemple.setNom("fred");
//			exemple.setTaille((float) 1.54);
//			
//			exampleService.save(exemple);
			


			
//			Example exemple = exampleService.getById(1);
//			
//			System.out.println(exemple.getId());
//			System.out.println(exemple.getNom());
//			System.out.println(exemple.getTaille());
			
			
			
//			List<Example> exemples = exampleService.findByNom("thomas");
//			for(Example exemple : exemples) {
//
//				System.out.println(exemple.getId());
//				System.out.println(exemple.getNom());
//				System.out.println(exemple.getTaille());
//			}
		
			
			
			
//			List<Example> exemples = exampleService.getAllOrderByNom();
//			for(Example exemple : exemples) {
//
//				System.out.println(exemple.getId());
//				System.out.println(exemple.getNom());
//				System.out.println(exemple.getTaille());
//			}
			
			
			
//			List<Example> exemples = exampleService.getByCategoryNom("category2");
//			for(Example exemple : exemples) {
//
//				System.out.println(exemple.getId());
//				System.out.println(exemple.getNom());
//				System.out.println(exemple.getTaille());
//			}
			
			List<Example> exemples = exampleService.getAllExampleByCategoryId((long) 2);
			for(Example exemple : exemples) {

				System.out.println(exemple.getId());
				System.out.println(exemple.getNom());
				System.out.println(exemple.getTaille());
			}
			
			

		
		} catch (BeansException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
}
