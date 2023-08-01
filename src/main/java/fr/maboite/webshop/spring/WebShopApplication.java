package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vac.webshop.configuration.WebShopConfig;
import vac.webshop.entity.Article;
import vac.webshop.entity.Role;
import vac.webshop.entity.User;
import vac.webshop.service.ArticleServices;
import vac.webshop.service.RoleServices;
import vac.webshop.service.UserServices;

public class WebShopApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				WebShopConfig.class)) {
			System.out.println("contexte démarré");
		
		
		UserServices userBean = appContext.getBean(UserServices.class);
		ArticleServices articleBean = appContext.getBean(ArticleServices.class);
		RoleServices roleBean = appContext.getBean(RoleServices.class);
		
		
		System.out.println("========= Récupération des logins en BDD =========");
		Iterable<User> users = userBean.getAll();
		System.out.println("Nom présent dans la base : ");
		for (User user : users) {
			System.out.println(user.getLogin());
		}
		
		System.out.println("========= Récupération des Users par login & password =========");
		List<User> myUser = userBean.getLoginPasswordNoCase("bond", "james");
		System.out.println("User By Login & Password : ");
		for (User user : myUser) {
			System.out.println("l'utilisateur porte l'id : " + user.getIdUser());
		}
		
		
		System.out.println("========= Récupération des marques d'Articles en BDD =========");
		Iterable<Article> articles = articleBean.getAll();
		System.out.println("Marques présentes dans la base : ");
		for (Article article : articles) {
			System.out.println(article.getBrand());
		}
		
		System.out.println("========= Récupération des Roles en BDD =========");
		Iterable<Role> roles = roleBean.getAll();
		System.out.println("Les différents rôles : ");
		for (Role role : roles) {
			System.out.println(role.getName());
		}
		
		
		}
	}
}
