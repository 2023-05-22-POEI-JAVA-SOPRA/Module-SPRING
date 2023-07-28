package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.PremierServiceThomas;
import fr.maboite.webshop.service.SecondServiceThomas;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationThomas;

public class SpringSecondApplicationThomas {
	
	
	public static void main(String[] args) {
		
		
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(
				ConfigurationThomas.class)) {
			//PremierServiceThomas premierService = appContext.getBean(PremierServiceThomas.class);
			//premierService.testMethode();

			appContext.getBean("instanceDansConfig", PremierServiceThomas.class).testMethode();
			
			System.out.println(appContext.getBean("instanceDansConfig", PremierServiceThomas.class).getDaoThomas());
			
			
			//appContext.getBean(PremierServiceThomas.class).testMethode();
			//appContext.getBean(SecondServiceThomas.class).testMethode();
		}
		
		
		
		
		
		
	}

}
