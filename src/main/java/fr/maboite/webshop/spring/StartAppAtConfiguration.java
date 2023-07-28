package fr.maboite.webshop.spring;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.MyService;
import fr.maboite.webshop.service.UserService;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

@Configuration
public class StartAppAtConfiguration {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
			System.out.println("Contexte Spring started");
			{
				
				appContext.register(SpringSimpleConfiguration.class);
				appContext.refresh();
				MyService myService  = appContext.getBean(MyService.class);
				
				myService.hello();
				
				UserService userService = appContext.getBean(UserService.class);
				
				userService.hello();
				
				
			}
		}

	}
}
