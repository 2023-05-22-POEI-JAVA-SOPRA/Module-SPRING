package fr.tp.shopi.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.tp.shopi.entity.Article;
import fr.tp.shopi.entity.Role;
import fr.tp.shopi.entity.User;
import fr.tp.shopi.service.ArticleService;
import fr.tp.shopi.service.RoleService;
import fr.tp.shopi.service.UserService;
import fr.tp.shopi.spring.configuration.TpShopiSpringConfiguration;

public class TpShopiSpringJpaApplication {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				TpShopiSpringConfiguration.class)) {
			
			ArticleService articleServiceBean = appContext.getBean(ArticleService.class);
			RoleService roleServiceBean = appContext.getBean(RoleService.class);
			UserService userServiceBean = appContext.getBean(UserService.class);
			
			User newUser = new User();
			Article newArticle = new Article();
			Role newRole = new Role();
			
			/* CREATION D'UN NOUVEL UTILISATEUR */
			newUser.setLogin("walid");
			newUser.setPassword("password123");
			newUser.setConnectionNumber(5);
			userServiceBean.save(newUser);
			
			/* CREATION D'UN NOUVEAU ROLE */
			newRole.setName("Maitre du monde");
			roleServiceBean.save(newRole);
			
			/* CREATION D'UN NOUVEL ARTICLE */
			newArticle.setDescription("article fabuleux");
			newArticle.setBrand("Fabuloufou");
			newArticle.setUnitaryPrice(16.85f);
			articleServiceBean.save(newArticle);

		}
	}

}
