package fr.EXERCICE.WebShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.EXERCICE.WebShop.dao.ArticleDao;
import fr.EXERCICE.WebShop.entity.Article;

@Service
public class serviceArticle {
	
	@Autowired
	private ArticleDao monArticleDao;
	
	public List<Article> getAll(){
		return (List<Article>) this.monArticleDao.findAll();
	}
}
