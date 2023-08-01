package fr.maboite.webshop.dao.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Ecole;


//@Repository
public interface EcoleRepository extends CrudRepository<Ecole, Long> {
	


}
