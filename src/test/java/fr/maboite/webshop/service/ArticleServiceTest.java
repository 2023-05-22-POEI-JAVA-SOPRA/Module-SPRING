package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.Article;

import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)

public class ArticleServiceTest {
	
	@Autowired 
	ArticleService articleService;
	
	
	
	@Test
	public void test_getAll()
	{
		
		Iterable<Article>  articles = articleService.getAll();
		Assertions.assertNotNull(articles);
		for(Article article : articles)
		{
			Assertions.assertTrue(!article.getBrand().isBlank());
			Assertions.assertTrue(!article.getDescription().isBlank());
			Assertions.assertTrue(article.getIdArticle() != 	0L );
			Assertions.assertTrue(article.getUnitaryPrice() >= 0  );
			
		}
	}
	

}
