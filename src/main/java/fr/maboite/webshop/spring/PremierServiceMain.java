package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.PremierService;
import fr.maboite.webshop.service.SecondService;
import fr.maboite.webshop.spring.simple.configuration.PremiereConfiguration;

public class PremierServiceMain {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(PremiereConfiguration.class)){
			
			System.out.println("Demarrage contexte spring");
			
			PremiereConfiguration premierBeanConfig = appContext.getBean(PremiereConfiguration.class);
			
			premierBeanConfig.createPremierService().call();
			premierBeanConfig.createSecondService().call();
		}
	}
	
}
