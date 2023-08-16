package fr.maboite.webshop.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleSpringDao extends CrudRepository<Example,Long>{

	List<Example> findByNom(String nom);
	List<Example> findByNomIgnoreCase(String nom);
	
	List<Example> findByNomAndTaille(String nom, Float taille);
	
	List<Example> findByNomOrTailleGreaterThanEqual(String nom, Float taille);
	//List<Example> findByNomOrTailleWithin(String nom,Float borne1,Float borne2);
	
	List<Example> findByNomContainingIgnoreCase(String partName);
	
	
	// ====== 01/08/2023 exo 1 création de query spécifique
	//@Query de SpringData exemple de cours
	@Query("from Example where nom=:nom order by taille desc, id desc") //@Query de SpringData
	List<Example> maQueryPerso(@Param("nom")String nom);
	
	//ma premiere query
	@Query("FROM Example WHERE taille >= :taille1 AND taille <= :taille2 AND LOWER(nom) LIKE %:nom% ORDER BY taille DESC, id DESC")
	List<Example> getAnimalsBySizeAndName(@Param("nom")String nom, @Param("taille1")Float taille1, @Param("taille2")Float taille2);
	
	//ma seconde query
	@Query("FROM Example WHERE LOWER(nom) LIKE %:nom% ORDER BY nom ASC")
	List<Example> getAnimalsByNom(@Param("nom")String nom);
	
	//=== 01/08/2023 exo 2 jointure avec une table category
	// Modification de la table Example (ajout de la clé étrangère
	// + création table Category
	List<Example> findByCategoryNom(String nom);
	
}
