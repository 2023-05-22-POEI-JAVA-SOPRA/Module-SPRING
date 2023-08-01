package vac.webshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import vac.webshop.entity.Article;

@Repository
public interface ArticleDaoRepo extends CrudRepository<Article, Integer>{
	
	@Query("from Article where LENGTH(description) >2 AND LOWER(description) LIKE %:description%")
    List<Article> findArticleByDescription(@Param("description") String description);
	
	List<Article> findByBrandIgnoreCaseAndPriceBetween(String brand, Float mini, Float maxi);

}
