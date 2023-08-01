package fr.maboite.webshop.jdbcdao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Article;

@Repository
public interface ArticleDao extends CrudRepository<Article, Long> {

	List<Article> findByDescriptionContainsIgnoreCase(String partDescription);
	
	List<Article> findByBrandIgnoreCaseAndUnitaryPriceBetween(String brand, Float min, Float max);
	
}
