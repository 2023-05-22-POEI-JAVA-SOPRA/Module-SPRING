package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import fr.maboite.webshop.service.UserRoleService;
import fr.maboite.webshop.service.UserServicess;

public class StartApp {

	
	public static void main(String[] args) {
		
		// Start Spring context
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(UserServicess.class,UserRoleService.class)) {
			System.out.println("Spring context started");

			// Récupération du bean instancié par Spring 
			UserServicess userServiceBean = appContext.getBean(UserServicess.class);
			userServiceBean.hello();
			userServiceBean.getUserRoleService().hello();	
			
			
			
					
		}
		
		
	}
}
