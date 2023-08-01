package fr.exercice.application;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.exercice.entity.Article;
import fr.exercice.service.ArticleService;
import fr.exercice.service.ExampleService;
import fr.exercice.service.RoleService;
import fr.exercice.service.UserService;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class WebShopApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {

			System.out.println("Contexte Spring démarré");

			ArticleService articleService = appContext.getBean(ArticleService.class);
			UserService userService = appContext.getBean(UserService.class);
			RoleService roleService = appContext.getBean(RoleService.class);

			// Opérations sur les objets

			List<Article> logitochList = articleService.searchByBrandAndPriceRange("Logitoch", 1, 9000);
			for (Article article : logitochList) {
				System.out.println(article.getDescription() + " " + article.getPrice());
			}
		}
	}
}
