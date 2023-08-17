package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

//Dao
@Repository
public interface MonPremierRepositorySpringDataDao extends CrudRepository<Example, Long> {

	List<Example> findByNom(String Nom);

	List<Example> findByTaille(float Taille);

	List<Example> findByNomAndTaille(String nom, float taille);
	
	List<Example> findByCategoryNom(String nomCategory);
	
	@Query("from Example where category.id = :categorieID ")////categorieid ou categorieID
	List<Example> getbyAllByCategoryID(@Param("categorieID") long id);
	
	

	// List<Example> findbyNomIgnoreCase(String Nom);
	List<Example> findByNomAndTailleAllIgnoreCase(String nom, float taille);

	@Query("from Example where nom = :nom and id = 3 order by taille asc, id")
	List<Example> maMethodeDeRechercheAvecUneQueryExplicite(@Param("nom") String nom);

	@Query("from Example where nom = :nom ")
	List<Example> getbyNom(@Param("nom") String nom);

	@Query("FROM Example WHERE nom = :nom AND taille > :taille OR id = :id")
	List<Example> getbyNomAndTaille(@Param("nom") String nom,@Param("taille") Float taille,@Param("id") Long id);

}
