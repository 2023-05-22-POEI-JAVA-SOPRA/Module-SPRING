package fr.maboite.webshop.jdbcdao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Planet;

@Repository
public interface PlanetDao extends CrudRepository<Planet, Long>{

	
	
}
