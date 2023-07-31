package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import fr.maboite.webshop.model.Example;


@Repository
public interface MyFirstRepositorySpingData extends CrudRepository<Example,Long>{
	
	List<Example> findByNom(String nom);
	

}
