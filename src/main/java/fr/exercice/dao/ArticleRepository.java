package fr.exercice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer>{

}
