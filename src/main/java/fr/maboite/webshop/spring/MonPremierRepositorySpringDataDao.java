package fr.maboite.webshop.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;
//Dao
@Repository
public interface MonPremierRepositorySpringDataDao extends CrudRepository<Example, Long>{
	

}
