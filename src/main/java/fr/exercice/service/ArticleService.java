package fr.exercice.service;

import java.util.List;

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

	public Iterable<Article> getAll() {
		return this.ar.findAll();
	}

	public void deleteById(Integer id) {
		this.ar.deleteById(id);
	}

	public List<Article> searchByPartOfDescription(String partOfDescription) {
		if (partOfDescription == null || partOfDescription.length() < 3) {
			throw new IllegalArgumentException("La description doit contenir au moins 3 caractères.");
		}
		return ar.findByDescriptionContainingIgnoreCase(partOfDescription);
	}

	public List<Article> searchByBrandAndPriceRange(String brand, double priceMin, double priceMax) {
		return ar.findByBrandIgnoreCaseAndPriceBetween(brand, priceMin, priceMax);
	}

}
