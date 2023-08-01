package fr.exercice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.dao.ExampleRepository;
import fr.maboite.webshop.model.Example;

@Service
public class ExampleService {

	@Autowired
	private ExampleRepository exampleRepo;

	public Example save(Example example) {
		return this.exampleRepo.save(example);
	}

	public Example getById(Long id) {
		return this.exampleRepo.findById(id).get();
	}

	public List<Example> getByNom(String nom) {
		return this.exampleRepo.findByNom(nom);
	}

	public List<Example> getByNomOrId(String nom, Long id) {
		return this.exampleRepo.findByNomOrId(nom, id);
	}

	public List<Example> getByNomIgnoreCase(String nom) {
		return this.exampleRepo.findByNomIgnoreCase(nom);
	}

	public List<Example> getByNomContaining(String nom) {
		return this.exampleRepo.findByNomIgnoreCaseContaining(nom);
	}
	public List<Example> getByNom2(String nom) {
		return this.exampleRepo.getByNom(nom);
	}
	public List<Example> getByNomAndTailleOrId(String nom, float taille, Long id) {
		return this.exampleRepo.getByNomAndTailleOrId(nom, taille, id);
	}
	public List<Example> getAllOrdByNom() {
		return this.exampleRepo.getAllOrderedByNom();
	}

	public Iterable<Example> getAll() {
		return this.exampleRepo.findAll();
	}

	public void deleteById(Long id) {
		this.exampleRepo.deleteById(id);
	}
}
