package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.Article;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class ArticleTest {

	@Autowired
	private ArticleService articleservice;

	@Test
	public void testSaveArticle() {

		Article article = new Article();

		article.setBrand("apple");

		Article savedArticle = articleservice.save(article);

		Assertions.assertEquals("apple", savedArticle.getBrand());

	}

}
