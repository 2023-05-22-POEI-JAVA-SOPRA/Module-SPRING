package fr.exercice.application;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.exercice.entity.Article;
import fr.exercice.entity.Role;
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
			ArticleService articleService = appContext.getBean(ArticleService.class);
			RoleService roleService = appContext.getBean(RoleService.class);

			// Test User 
			Iterable<User> listUsers = userService.getAll();
			for (User user : listUsers) {
				System.out.println("Login : " + user.getLogin() + ", pwd : " + user.getPassword());
			}
			List<User> listUsers2 = userService.getByLoginAndPassword("Anderson", "Neo");
			for (User user : listUsers2) {
				System.out.println("Id : " +user.getId());
			}
			
			//Test Role
			Iterable<Role> listRoles = roleService.getAll();
			for (Role role : listRoles) {
				System.out.println("Nom : " + role.getName());
			}
			
			List<Role> listRoles2 = roleService.getByNameIgnoreCaseContaining("i");
			for (Role role : listRoles2) {
				System.out.println("Nom : " + role.getName());
			}
			
			//Test Articles
			Iterable<Article> listArticles = articleService.getAll();
			for (Article article : listArticles) {
				System.out.println(article.toString());
			}
			Float pMin = (float) 50;
			Float pMax = (float) 110;
			List<Article> listArticles2 = articleService.getByMarqueAndPrixRange("CETME",pMin,pMax);
			for (Article article : listArticles2) {
				System.out.println(article.toString());
			}
			
			List<Article> listArticles3 = articleService.getByDescriptionContainingIgnoreCase("souris");
			for (Article article : listArticles3) {
				System.out.println(article.toString());
			}
		}
	}
}
