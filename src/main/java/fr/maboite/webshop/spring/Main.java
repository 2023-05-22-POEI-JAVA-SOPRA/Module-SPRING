package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.Mon2Service;
import fr.maboite.webshop.service.MonService;

public class Main {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(MonService.class, Mon2Service.class)) {
			System.out.println("Contexte Spring démarré");

			
			Mon2Service monBeanSpring = appContext.getBean(Mon2Service.class);

			
			monBeanSpring.testMethod();
			monBeanSpring.getMonService().testMethod();
		}	
		
	}

}
