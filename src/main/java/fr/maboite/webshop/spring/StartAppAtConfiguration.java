package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.MonPremierService;
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
				// TP1
//				MyService myService  = appContext.getBean(MyService.class);
//				
//				myService.hello();
//				
//				UserService userService = appContext.getBean(UserService.class);
//				userService.hello();

				// TP2
//				UserService userService = appContext.getBean(UserService.class);
//				System.out.println(userService.getMinAge());
//				userService.setMinAge(18);
//				System.out.println(userService.getMinAge());

				// TP2 Bonus

				UserService userService1 = appContext.getBean(UserService.class);
				UserService userService2 = appContext.getBean(UserService.class);

				System.out.println("userService1 minAge :" + userService1.getMinAge());
				System.out.println("userService2 minAge :" + userService2.getMinAge());
				userService1.setMinAge(100);
				System.out.println("userService1 after reset user 1 ! minAge :" + userService1.getMinAge());
				System.out.println("userService2 after reset user 1 ! minAge :" + userService2.getMinAge());
				MonPremierService monPremierService1 = new MonPremierService();
				MonPremierService monPremierService2 = new MonPremierService();
 
				//Avec Scope "singleton" ou sans scope -->True
				//Avec Scope "protoype" -> false
				System.out.println("Same userService instance  in context ? : " + (userService1==userService2 ));
				System.out.println("Same monPremierService instance  in context ? : " + (monPremierService1==monPremierService2 ));
				
				
				
				
			}
		}

	}
}
