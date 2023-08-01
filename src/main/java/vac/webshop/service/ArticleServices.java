package vac.webshop.service;

import java.util.List;

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
	
	public List<Article> getArticleWithDescription(String description){
		return this.articleRepo.findArticleByDescription(description);
	}
	
	public List<Article> getArticleByBrandAndPrice(String brand, Float price, Float price2 ){
		return this.articleRepo.findByBrandIgnoreCaseAndPriceBetween(brand, price, price2);
	}
}
