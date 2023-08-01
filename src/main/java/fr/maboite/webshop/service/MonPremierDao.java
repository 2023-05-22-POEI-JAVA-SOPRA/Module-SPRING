package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.Example;

@Repository
public interface MonPremierDao extends CrudRepository<Example, Long> {

	List<Example> findByNom(String nom);
	List<Example> findByNomIgnoreCase(String nom);
	List<Example> findByNomContainingIgnoreCase(String nomPart);
	List<Example> findByNomAndTaille(String nom, Float taille);
	List<Example> findByCategoryIdNom(String nom);
	List<Example> findByCategoryIdId(Long categoryId);
	
	 @Query("from Example where nom = :nom and taille = :taille")
	 List<Example> findByTwoAttributs(@Param("nom")String nom,@Param("taille")Float taille);
	 @Query("from Example where nom = :nom")
	 List<Example> findByNomQuery(@Param("nom")String nom);
	 @Query("from Example order by nom asc")
	 List<Example> findAllorderByNom();
	 
//	 @Query("from Example where category_id = :categoryId")
//	 List<Example> findByCategoryId(@Param("categoryId")Integer categoryId);
	 //@Query("from Example where nom = :nom")
	 //List<Example> findByCategoryNom(@Param("nom")String nom);
	
}