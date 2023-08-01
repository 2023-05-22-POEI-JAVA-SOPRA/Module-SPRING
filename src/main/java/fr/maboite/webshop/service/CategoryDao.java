package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.Example;

@Repository
public interface CategoryDao extends CrudRepository<Category, Long>{

	
	
	
}
