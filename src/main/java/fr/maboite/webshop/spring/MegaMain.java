package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.SuperService;
import fr.maboite.webshop.spring.simple.configuration.MegaConfig;

public class MegaMain {
	
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(MegaConfig.class)) {
			System.out.println("Contexte Spring démarré");
			
			SuperService service = appContext.getBean(SuperService.class);
			SuperService secondService = appContext.getBean(SuperService.class);
			System.out.println("service == secondService :" + (secondService == service));
			
			MonPremierService monPremierBeanSpring = appContext.getBean(MonPremierService.class);
 
			
			
			service.ok();
			service.getSuperdao().ok();
			monPremierBeanSpring.coucou();
			monPremierBeanSpring.getMonPremierDao().coucou();
			System.out.println("name de superservice : " + service.getName());
			System.out.println("name de superdao : " + service.getSuperdao().getName());
			
		}
	}
}
