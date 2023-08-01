package fr.exercice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Long>{

}
