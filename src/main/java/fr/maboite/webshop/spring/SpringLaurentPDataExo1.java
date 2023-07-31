package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.ExampleService;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfLP;

public class SpringLaurentPDataExo1{
	public static void main(String[] args) {
		
	
	try (AnnotationConfigApplicationContext appContext 
			= new AnnotationConfigApplicationContext(SpringSimpleConfLP.class)) {


		System.out.println("Contexte Spring démarré");

		ExampleService monService=appContext.getBean(ExampleService.class);

		//opérations
		Example monExample=new Example();
		monService.save(monExample);
		Iterable<Example> examples=monService.getAll();
		for (Example example : examples) {
			if(example.getNom()==null) {
				monService.deleteById(example.getId());
			}
			else {
			System.out.println(example.getNom());
			}
		}
	}

}
}

