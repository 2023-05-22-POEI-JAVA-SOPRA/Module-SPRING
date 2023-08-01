package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.dao.ArticleDao;
import fr.maboite.webshop.model.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleDao articleDao;

	public Article save(Article nouveauArticle) {
		// TODO Auto-generated method stub
		return articleDao.save(nouveauArticle);

	}

	public List<Article> getByDescription(String Description) {
		// TODO Auto-generated method stub
		return this.articleDao.getbyDescription(Description);

	}

	public List<Article> getByBrand(String Brand) {
		// TODO Auto-generated method stub
		return this.articleDao.getbyBrand(Brand);

	}

	public Iterable<Article> getAll() {
		// TODO Auto-generated method stub
		return this.articleDao.findAll();
	}
	
	public List<Article> findByDescription(String Description) {
		// TODO Auto-generated method stub
		return this.articleDao.findByDescription(Description);
	}
	
	public List<Article> findByBrand(String Brand) {
		// TODO Auto-generated method stub
		return this.articleDao.findByBrand(Brand);
	}

}
