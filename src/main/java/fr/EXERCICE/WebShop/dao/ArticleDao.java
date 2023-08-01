package fr.EXERCICE.WebShop.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.EXERCICE.WebShop.entity.Article;

@Repository
public interface ArticleDao extends CrudRepository<Article,Integer>{
	
	@Query("from Article where LENGTH(description) >= 3 AND LOWER(description) LIKE %:description%")
	List<Article> findByDescriptionContainingIgnoreCase(@Param("description") String description);
	
	@Query("from Article where LOWER(:marque) = LOWER(:marque) AND unitaryprice BETWEEN :prixMin AND :prixMax")
	List<Article> findByMarqueAndPrixRange(@Param("marque") String marque, @Param("prixMin") Float prixMin, @Param("prixMax") Float prixMax);
}
