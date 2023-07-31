package fr.maboite.webshop.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleSpringDao extends CrudRepository<Example,Long>{

	List<Example> findByNom(String nom);
	List<Example> findByNomIgnoreCase(String nom);
	
	List<Example> findByNomAndTaille(String nom, Float taille);
	
	List<Example> findByNomOrTailleGreaterThanEqual(String nom, Float taille);
	//List<Example> findByNomOrTailleWithin(String nom,Float borne1,Float borne2);
	
	List<Example> findByNomContainingIgnoreCase(String partName);
}
