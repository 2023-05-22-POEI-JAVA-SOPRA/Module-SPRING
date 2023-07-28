package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.spring.real.configuration.ConfigurationJP;

public class SpringAppliDeux {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(ConfigurationJP.class)) {
			System.out.println("Contexte de l'appli' deux démarré");
			
			ConfigurationJP beanSpring = appContext.getBean(ConfigurationJP.class);
			MonPremierService beanService = appContext.getBean(MonPremierService.class);
			
			
			System.out.println(beanSpring);
			System.out.println(beanService);
			
//			beanSpring.preums();
//			beanSpring.deuz();
//			beanSpring.preums().coucou();
			
			
			
		}
	}
}
