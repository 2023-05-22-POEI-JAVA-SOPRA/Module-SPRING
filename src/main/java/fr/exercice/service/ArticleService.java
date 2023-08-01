package fr.exercice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.dao.ArticleRepository;
import fr.exercice.entity.Article;

@Service
public class ArticleService {

	@Autowired
	private ArticleRepository ar;
	
	public Article getById(Integer id) {
		return this.ar.findById(id).get();
	}
	
	public Article save(Article article) {
		return this.ar.save(article);
	}
	
	public Iterable<Article> getAll(){
		return this.ar.findAll();
	}
	
	public void deleteById(Integer id) {
		this.ar.deleteById(id);
	}
}

