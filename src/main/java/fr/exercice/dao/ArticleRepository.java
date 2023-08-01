package fr.exercice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

	@Query("from Article where LENGTH(description) >= 3 AND LOWER(description) LIKE %:description%")
	List<Article> findByDescriptionContainingIgnoreCase(String description);

	@Query("from Article where LOWER(marque) = LOWER(:marque) AND prix BETWEEN :prixMin AND :prixMax")
	List<Article> findByDescriptionContainingAndMarqueAndPrixRange(String marque, double prixMin, double prixMax);

}
