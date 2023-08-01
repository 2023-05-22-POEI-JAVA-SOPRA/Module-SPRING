package fr.EXERCICE.WebShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.EXERCICE.WebShop.configuration.SpringConfig;
import fr.EXERCICE.WebShop.entity.User;
import fr.EXERCICE.WebShop.service.serviceUser;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringConfig.class)) {


			System.out.println("Contexte Spring démarré");

			//ExampleService monService=appContext.getBean(ExampleService.class);
			serviceUser monUserService=appContext.getBean(serviceUser.class);
			
			//Test getAll Users
			Iterable<User> users=monUserService.getAll();
			for (User user : users) {
				System.out.println(user);
			}
	}

}
}
