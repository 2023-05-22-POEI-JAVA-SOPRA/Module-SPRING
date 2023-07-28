package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.correction.service.MonService;
import fr.maboite.webshop.spring.real.configuration.SpringSimpleConfiguration;

public class Main {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringSimpleConfiguration.class)) {
			//System.out.println("Contexte Spring démarré");

			
			//SpringSimpleConfiguration monBeanSpring = appContext.getBean(SpringSimpleConfiguration.class);
			MonService monBeanService = appContext.getBean(MonService.class);

			
			//monBeanSpring.monServiceBean().testMethod();
			monBeanService.testMethod();
			//monBeanSpring.getMonService().testMethod();
		}	
		
	}

}
