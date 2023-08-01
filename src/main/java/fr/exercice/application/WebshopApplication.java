package fr.exercice.application;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.exercice.entity.User;
import fr.exercice.service.ArticleService;
import fr.exercice.service.RoleService;
import fr.exercice.service.UserService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class WebshopApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			// et scanne le package "fr.maboite.webshop.correction"
			System.out.println("Contexte Spring démarré");
		
			UserService userService = appContext.getBean(UserService.class);
//			ArticleService articleService = appContext.getBean(ArticleService.class);
//			RoleService roleService = appContext.getBean(RoleService.class);

			Iterable<User> listUsers = userService.getAll();
			for (User user : listUsers) {
				System.out.println("Login : " + user.getLogin() + ", pwd : " + user.getPassword());
			}
			List<User> listUsers2 = userService.getByLoginAndPassword("Anderson", "Neo");
			for (User user : listUsers2) {
				System.out.println("Id : " +user.getId());
			}
		}
	}
}
