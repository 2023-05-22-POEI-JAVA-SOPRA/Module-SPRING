package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import fr.maboite.webshop.service.UserRoleService;
import fr.maboite.webshop.service.UserService;

public class StartApp {

	
	public static void main(String[] args) {
		
		// Start Spring context
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(UserService.class,UserRoleService.class)) {
			System.out.println("Contexte Spring started");

			// Récupération du bean instancié par Spring 
			UserService userServiceBean = appContext.getBean(UserService.class);
			userServiceBean.hello();
			userServiceBean.getUserRoleService().hello();	
			
			
			
					
		}
		
		
	}
}
