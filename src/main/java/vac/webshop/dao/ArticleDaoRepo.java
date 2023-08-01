package vac.webshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vac.webshop.entity.Article;

@Repository
public interface ArticleDaoRepo extends CrudRepository<Article, Integer>{

}
