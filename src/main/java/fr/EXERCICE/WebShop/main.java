package fr.EXERCICE.WebShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.EXERCICE.WebShop.configuration.SpringConfig;
import fr.EXERCICE.WebShop.entity.User;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringConfig.class)) {


			System.out.println("Contexte Spring démarré");

			//ExampleService monService=appContext.getBean(ExampleService.class);

			
			User monUser=new User();
	}

}
}
