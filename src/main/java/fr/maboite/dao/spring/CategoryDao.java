package fr.maboite.dao.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Category;

@Repository
public interface CategoryDao extends CrudRepository<Category, Long>{
	
	
}
