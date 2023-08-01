package vac.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vac.webshop.dao.ArticleDaoRepo;
import vac.webshop.entity.Article;

@Service
public class ArticleServices {

	@Autowired
	private ArticleDaoRepo articleRepo;
	
	public Iterable<Article> getAll(){
		return this.articleRepo.findAll();
	}
}
