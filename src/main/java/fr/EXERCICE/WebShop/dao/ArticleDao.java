package fr.EXERCICE.WebShop.dao;

import org.springframework.data.repository.CrudRepository;

import fr.EXERCICE.WebShop.entity.Article;

public interface ArticleDao extends CrudRepository<Article,Integer>{

}
