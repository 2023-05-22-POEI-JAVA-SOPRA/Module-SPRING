package fr.maboite.webshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.ArticleDao;
import fr.maboite.webshop.model.Article;

@Component
public class ArticleService {

	@Autowired
	private ArticleDao articleDao;
	
	public Iterable<Article> getAll(){
		return this.articleDao.findAll();
	}
	
	public Optional<Article> getById(Long id) {
		return this.articleDao.findById(id);
	}
	
	public Article save(Article article) {
		return this.articleDao.save(article);
	}
	
	public void delete(Long id) {
		this.articleDao.deleteById(id);
	}
	
	public List<Article> findByDescriptionContainsIgnoreCase(String partDescription){
		if(partDescription.length()>2) {return this.articleDao.findByDescriptionContainsIgnoreCase(partDescription);}
		else {return null;}
	}
	
	public List<Article> findByBrandIgnoreCaseAndPriceBetween(String brand, Float min, Float max){
		return this.articleDao.findByBrandIgnoreCaseAndUnitaryPriceBetween(brand, min, max);
	}

	
}
