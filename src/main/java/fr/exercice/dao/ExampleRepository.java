package fr.exercice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Example;

@Repository
public interface ExampleRepository extends CrudRepository<Example, Long> {

	public List<Example> findByNom(String nom);

	public List<Example> findByNomOrId(String nom, Long Id);

	public List<Example> findByNomIgnoreCase(String nom);

	public List<Example> findByNomIgnoreCaseContaining(String nom);

}
