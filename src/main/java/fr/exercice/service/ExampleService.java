package fr.exercice.service;

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
	
	public void deleteById(Long id) {
		this.exampleRepo.deleteById(id);
	}
}
