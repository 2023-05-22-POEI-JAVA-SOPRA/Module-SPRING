package fr.EXERCICE.WebShop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.EXERCICE.WebShop.entity.Article;

@Repository
public interface ArticleDao extends CrudRepository<Article,Integer>{

}
