package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import vac.webshop.configuration.WebShopConfig;
import vac.webshop.entity.User;
import vac.webshop.service.UserServices;

public class WebShopApplication {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				WebShopConfig.class)) {
			System.out.println("contexte démarré");
		
		
		UserServices userBean = appContext.getBean(UserServices.class);
		
		
		System.out.println("Récupération des logins en BDD");
		Iterable<User> users = userBean.getAll();
		System.out.println("Nom présent dans la base : ");
		for (User user : users) {
			System.out.println(user.getLogin());
		}
		}
	}
}
