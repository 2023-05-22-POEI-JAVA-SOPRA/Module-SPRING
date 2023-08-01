package fr.maboite.webshop.spring;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Article;
import fr.maboite.webshop.model.Command;
import fr.maboite.webshop.model.Role;
import fr.maboite.webshop.model.User;
import fr.maboite.webshop.service.ArticleService;
import fr.maboite.webshop.service.CommandService;
import fr.maboite.webshop.service.HotelService;
import fr.maboite.webshop.service.ReservationService;
import fr.maboite.webshop.service.RoleService;
import fr.maboite.webshop.service.UserService;
import fr.maboite.webshop.spring.simple.configuration.TPConfiguration;
import fr.maboite.webshop.spring.simple.configuration.TPUserConfiguration;

public class TPUserApplication {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(TPUserConfiguration.class)) {

			TPUserConfiguration tpBean = appContext.getBean(TPUserConfiguration.class);
			
			UserService userBean = appContext.getBean(UserService.class);
			RoleService roleBean = appContext.getBean(RoleService.class);
			ArticleService ArticleBean = appContext.getBean(ArticleService.class);
			CommandService CommandBean = appContext.getBean(CommandService.class);

			
			//userBean.save(new User("la@la.com","1234",002));
			//System.out.println(userBean.findByLoginAndPassword("lo@lo.com", "1234"));
			
			//roleBean.save(new Role("user"));
			//System.out.println(roleBean.findByNameContainsIgnoreCase("us"));
			
			//ArticleBean.save(new Article("trouser","H&M",44.99f));
			//System.out.println(ArticleBean.findByDescriptionContainsIgnoreCase("Shirt"));
			//System.out.println(ArticleBean.findByBrandIgnoreCaseAndPriceBetween("H&M", 39.99f, 50f));
			
			//CommandBean.save(new Command(LocalDate.now().minusDays(21),2l));
			System.out.println(CommandBean.findByUserLogin("lo@lo.com"));
		}
		
	}

}
