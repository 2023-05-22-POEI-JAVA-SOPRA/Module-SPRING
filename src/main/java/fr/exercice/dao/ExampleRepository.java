package fr.exercice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Category2;
import fr.maboite.webshop.model.Example;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long> {

	public List<Example> findByNom(String nom);

	public List<Example> findByNomOrId(String nom, Long Id);

	public List<Example> findByNomIgnoreCase(String nom);

	public List<Example> findByNomIgnoreCaseContaining(String nom);
	
	@Query("from Example where nom = :nom")
    List<Example> getByNom(@Param("nom") String nom);
	
	@Query("from Example where nom = :nom and taille > :taille or id = :id")
    List<Example> getByNomAndTailleOrId(@Param("nom") String nom, @Param("taille") float taille, @Param("id") Long id);

	@Query("from Example order by nom asc")
    List<Example> getAllOrderedByNom();

	List<Example> findByCategory_Nom(String nom);
}
