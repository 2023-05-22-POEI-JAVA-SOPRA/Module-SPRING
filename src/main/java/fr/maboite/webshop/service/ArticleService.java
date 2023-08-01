package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.ArticleRepository;
import fr.maboite.webshop.model.Article;

@Component
public class ArticleService {

	
	
	
	@Autowired
	ArticleRepository articleRepository;
	public Iterable<Article> getAll()
	{
		return articleRepository.findAll();
	}
	
	public Article  getById(Integer id)
	{
		return articleRepository.findById(id).orElse(null);
	}
	
	public Article save(Article article)
	{
		return articleRepository.save(article);
	}
	
	public Iterable<Article> getByDescriptionLike(String description)
	{
		return description.length() >= 3 ? articleRepository.findByDescriptionContainingIgnoreCase(description): null;
	}
	
	public Iterable<Article> getByBrandIgnoreCaseAndBetweenUnitaryPrice(String brand, Double b1 , Double b2)
	{
		return articleRepository.findByBrandIgnoreCaseAndUnitaryPriceBetween(brand, b1, b2);
	}
}
