package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.User;
import fr.maboite.webshop.service.UserService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class MainUser {
	
	
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			UserService userServiceBean = appContext.getBean(UserService.class);
			
//			Iterable<User> userAll = userServiceBean.getAll();
//			for (User user : userAll) {
//				System.out.println(user);
//			}
			
			User u7 = userServiceBean.getById(7);
			System.out.println(u7);
			
			User userToAdd = new User("michel@michel.com", "ygugiuiu", 456465566);
			System.out.println(userServiceBean.save(userToAdd));
		}
	}
}
