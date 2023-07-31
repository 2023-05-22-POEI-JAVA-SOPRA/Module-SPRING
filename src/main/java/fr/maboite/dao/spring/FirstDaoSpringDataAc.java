package fr.maboite.dao.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

@Repository
public interface FirstDaoSpringDataAc extends CrudRepository<Example, Long> {

}
