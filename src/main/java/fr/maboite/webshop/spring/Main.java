package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import fr.maboite.webshop.service.SuperService;

public class Main {
	public static void main(String[] args) {
		
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext("fr.maboite.webshop.service")) {
			System.out.println("Contexte Spring démarré");
			
			SuperService service = appContext.getBean(SuperService.class);
			
			service.ok();
			service.getSuperdao().ok();
		}
	}
}
