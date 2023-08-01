package fr.exercice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

	List<Article> findByDescriptionContainingIgnoreCase(String partOfDescription);

	List<Article> findByBrandIgnoreCaseAndPriceBetween(String brand, double priceMin, double priceMax);

}
