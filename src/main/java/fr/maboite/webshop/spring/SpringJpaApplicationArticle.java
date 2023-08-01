package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Article;
import fr.maboite.webshop.service.ArticleService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringJpaApplicationArticle {

	public static void main(String[] args) {
		// On démarre le contexte Spring
		// avec la configuration qui se trouve dans SpringConfiguration.class
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {

			ArticleService articleServiceBean = appContext.getBean(ArticleService.class);
			Iterable<Article> articleall = articleServiceBean.getAll();

			for (Article article : articleall) {
				System.out.println(article);
			}

			Iterable<Article> findByBrand = articleServiceBean.getByBrand("apple");
			for (Article article1 : findByBrand) {
				System.out.println("brand est :" + article1.getBrand());
			}

		}
	}

}
