package fr.maboite.webshop.correction.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Category;


@Repository
public interface CategoryDao extends CrudRepository<Category, Long> {

	Category findByNom(String nom);

}