package fr.maboite.webshop.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExampleSpringDao extends CrudRepository<Example,Long>{
	
}
