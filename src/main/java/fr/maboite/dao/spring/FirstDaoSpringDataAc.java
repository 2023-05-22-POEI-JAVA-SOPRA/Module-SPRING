package fr.maboite.dao.spring;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

@Repository
public interface FirstDaoSpringDataAc extends CrudRepository<Example, Long> {

//	Toujours utiliser List (ou Iterable) car on fait de la recup de données par un nom par exemple
//	possibilité d'avoir plusieurs noms 
// Si la colonne a une contrainte unique alors là on peut faire juste la classe 
	List<Example> findByNom(String nom);

//	https://docs.spring.io/spring-data/jpa/docs/2.7.7/reference/html/#repositories.query-methods.query-creation
	List<Example> findByNomIgnoreCase(String nom);

	List<Example> findByNomIgnoreCaseAndTaille(String nom, Float taille);
	
	
	
	
	@Query("from Example where nom = :nom")
	List<Example> getNomQuery(@Param("nom") String nom);

	@Query("from Example where nom = :nom and taille > :taille")
	List<Example> queryNomTaille(@Param("nom") String nom, @Param("taille")Float taille);

	@Query("from Example order by nom desc")
	List<Example> nomOrderByDesc();

	List<Example> findByCategorieNom(String categoryName);
	
	

//
//	Example findByNmueroInsee2(String numeroInsee);
//	
////	dispo depuis Java8
////	Optional est une ?? Conteneur
//	Optional<Example> findByNmueroInsee(String numeroInsee);
//
}
