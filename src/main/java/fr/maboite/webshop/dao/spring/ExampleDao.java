package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

/**
 * Equivaut a un ExampleDao que j'aurais tape a la main
 */
@Repository
public interface ExampleDao extends CrudRepository<Example, Long>{
	List<Example> findByNom(String nom);
	List<Example> findByNomIgnoreCase(String nom);
	List<Example> findByNomAndTaille(String nom, Float taille);
	List<Example> findByNomOrTaille(String nom, Float taille);
	
	List<Example> findByNomContaining(String nom);
	List<Example> findByNomContainingIgnoreCase(String nom);

}
