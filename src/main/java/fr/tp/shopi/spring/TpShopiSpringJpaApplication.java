package fr.tp.shopi.spring;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
			
//			/* CREATION D'UN NOUVEL UTILISATEUR */
//			newUser.setLogin("car");
//			newUser.setPassword("lson");
//			newUser.setConnectionNumber(12);
//			userServiceBean.save(newUser);
			
//			/* CREATION D'UN NOUVEAU ROLE */
//			newRole.setName("geekz");
//			roleServiceBean.save(newRole);
			
			/* CREATION D'UN NOUVEL ARTICLE */
//			newArticle.setDescription("article fatigue");
//			newArticle.setBrand("cernebleu");
//			newArticle.setUnitaryPrice(21f);
//			articleServiceBean.save(newArticle);
			
			/* GET ALL USER */
			Iterable<User> newList = userServiceBean.findAll();
			
			for (User user : newList) {
				System.out.println(user.getLogin());
			}
			
			/* RECHERCHES SPECIALES SUR ARTICLE */
			List<Article> newListArticle = articleServiceBean.findByBrandIgnoreCaseAndUnitaryPriceBetween("fabuloufou", 0, 15);
			for (Article article : newListArticle) {
				System.out.println(article.getDescription() +" ---- "+ article.getIdArticle());
			}
			
			List<Article> newListArticle2 = articleServiceBean.findByDescriptionContaining("eux");
			for (Article article : newListArticle2) {
				System.out.println(article.getBrand() +" ---- "+ article.getIdArticle());
			}
			
			/* RECHERCHE SPECIALE SUR ROLE */
			List<Role> newListRole = roleServiceBean.findByNameContainingIgnoreCase("FUK");
			for (Role role : newListRole) {
				System.out.println(role.getIdRole() +" voici mon id!");
			}
			
			/* RECHERCHEs SPECIALES SUR USER */
			List<User> newListUser =userServiceBean.findByLoginAndPassword("walid", "password123");
			for (User user : newListUser) {
				System.out.println(user.getIdUser()+" voici mon id pelo!");
			}
		}
	}

}
