package fr.maboite.webshop.jdbcdao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;


@Repository
public interface ExampleDAO extends CrudRepository<Example, Long> {
	
	
	
	List<Example> findByNom(String nom);
	List<Example> findByNomIgnoreCase(String nom);
	
	List<Example> findExampleDistinctByNomOrId(String lastname, long id);
	List<Example> findExampleDistinctByNomAndId(String lastname, long id);
	
	List<Example> findByNomOrderByNomAsc(String lastname);
	List<Example> findByNomOrderByIdAsc(String lastname);
	
	
	
	
	
	@Query("FROM Example ORDER BY nom ASC")
	List<Example> getAllOrderByNom();	
	
	@Query("FROM Example WHERE nom = :nom OR id = :id")
	List<Example> getByNomOrId(@Param("nom") String nom, @Param("id") long id);

	
	
	
	
	@Query("FROM Example WHERE category.id = :categoryID")
	List<Example> getAllExampleByCategoryId(@Param("categoryID") long id);
	
	List<Example> getByCategoryNom(String nom);
	
}
