package fr.EXERCICE.WebShop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.EXERCICE.WebShop.configuration.SpringConfig;
import fr.EXERCICE.WebShop.entity.Article;
import fr.EXERCICE.WebShop.entity.Role;
import fr.EXERCICE.WebShop.entity.User;
import fr.EXERCICE.WebShop.service.serviceArticle;
import fr.EXERCICE.WebShop.service.serviceRole;
import fr.EXERCICE.WebShop.service.serviceUser;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringConfig.class)) {


			System.out.println("Contexte Spring démarré");

			//ExampleService monService=appContext.getBean(ExampleService.class);
			serviceUser monUserService=appContext.getBean(serviceUser.class);
			serviceArticle monArticleService=appContext.getBean(serviceArticle.class);
			serviceRole monRoleService=appContext.getBean(serviceRole.class);
			
			//Test getAll Users
			System.out.println("\n========================");
			System.out.println("===== getAll Users =====");
			System.out.println("========================");
			Iterable<User> users=monUserService.getAll();
			for (User user : users) {
				System.out.println(user);
			}
			
			//Test getAll Articles
			System.out.println("\n===========================");
			System.out.println("===== getAll Articles =====");
			System.out.println("===========================");
			Iterable<Article> articles=monArticleService.getAll();
			for(Article article : articles) {
				System.out.println(article);
			}
			
			//Test getAll Roles
			System.out.println("\n========================");
			System.out.println("===== getAll Roles =====");
			System.out.println("========================");
			Iterable<Role> roles=monRoleService.getAll();
			for(Role role : roles) {
				System.out.println(role);
			}
			
			
	}

}
}
