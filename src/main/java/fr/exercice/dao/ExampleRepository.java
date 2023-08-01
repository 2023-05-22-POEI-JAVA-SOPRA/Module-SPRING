package fr.exercice.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long> {

	public List<Example> findByNom(String nom);

	public List<Example> findByNomOrId(String nom, Long Id);

	public List<Example> findByNomIgnoreCase(String nom);

	public List<Example> findByNomIgnoreCaseContaining(String nom);

	@Query("SELEC FROM Example WHERE nom = :nom")
    List<Example> getByNom(@Param("nom") String nom);
	
	@Query("SELECT FROM Example WHERE nom = :nom AND taille > :taille OR id = :id")
    List<Example> getByNomAndTailleOrId(@Param("nom") String nom, @Param("taille") float taille, @Param("id") Long id);

	@Query("SELECT FROM Example ORDER BY nom ASC")
    List<Example> getAllOrderedByNom();
}
