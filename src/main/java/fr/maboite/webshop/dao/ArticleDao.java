package fr.maboite.webshop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Article;

@Repository
public interface ArticleDao extends CrudRepository<Article, Long>{

	
	List<Article> findByDescription(String description);

	List<Article> findByBrand(String brand);

	List<Article> findByDescriptionAndBrand(String description, String brand);
	
	@Query("from Article where description = :description ")
	List<Article> getbyDescription(@Param("description") String description);
	
	@Query("from Article where brand = :brand ")
	List<Article> getbyBrand(@Param("brand") String brand);

	@Query("FROM Article WHERE description = :description AND brand > :brand")
	List<Article> getByDescriptionAndBrand(@Param("description") String description,@Param("brand") String brand);

}
