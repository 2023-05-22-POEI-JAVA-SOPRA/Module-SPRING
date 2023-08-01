package fr.maboite.webshop.jdbcdao;

import org.springframework.data.repository.CrudRepository;

import fr.maboite.webshop.model.Category;

public interface CategoryDAO extends CrudRepository<Category, Long> {

}
