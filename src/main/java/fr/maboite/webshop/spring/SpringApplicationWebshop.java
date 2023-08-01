package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Role;
import fr.maboite.webshop.model.User;
import fr.maboite.webshop.service.ArticleService;
import fr.maboite.webshop.service.RoleService;
import fr.maboite.webshop.service.UserService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringApplicationWebshop {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			System.out.println("Contexte Spring started");
			{

				RoleService roleServiceBean = appContext.getBean(RoleService.class);

				for (Role r : roleServiceBean.getAll()) {
					System.out.println(r.toString());
				}

				UserService userServiceBean = appContext.getBean(UserService.class);
				User us = new User("MyLogin", "azerty", 0);
				userServiceBean.save(us);
				for (User user : userServiceBean.getAll()) {
					System.out.println(user.toString());
				}
				System.out.println(userServiceBean.getByLoginAndPassword("MyLogin","azerty"));
				
				
				System.out.println(roleServiceBean.getRolesLike("man"));
				ArticleService articleService = appContext.getBean(ArticleService.class);
				System.out.println(articleService.getByDescriptionLike("Clavier"));
				System.out.println(articleService.getByDescriptionLike("cd"));
				
				System.out.println(articleService.getByBrandIgnoreCaseAndBetweenUnitaryPrice("ph", 10.0, 100.0));
				System.out.println(articleService.getByBrandIgnoreCaseAndBetweenUnitaryPrice("Ph", 10.0, 10000.0));

			}
		}

	}
}
