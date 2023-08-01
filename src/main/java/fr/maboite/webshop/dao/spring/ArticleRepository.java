package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Article;
import fr.maboite.webshop.model.Role;
@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

	
	public List<Article> findByDescriptionContainingIgnoreCase(String desc);
	
	public List<Article> findByBrandIgnoreCaseAndUnitaryPriceBetween(String description, Double UnitaryPriceStart, Double UnitaryPriceEnd);
}
