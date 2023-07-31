package fr.maboite.webshop.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.dao.spring.ExampleDao;
import fr.maboite.webshop.model.Example;


@Service
public class ExampleService {
	
	@Autowired
	private ExampleDao exampleDao;
	
	public Example save(Example example) {
		return exampleDao.save(example);
	}
	
	
	public Iterable<Example> getAll() {
		return exampleDao.findAll();
	}
	
	public Example getById(Long id) {
		return exampleDao.findById(id).get();
	}
	
	public void deleteById(Long id) {
		exampleDao.deleteById(id);
	}
	
	public List<Example> getByNom(String nom) {
		return exampleDao.findByNom(nom);
	}
	
	public List<Example> getByNomIgnoreCase(String nom) {
		return exampleDao.findByNomIgnoreCase(nom);
	}
	
	
	public List<Example> getByNomAndTaille(String nom, Float taille) {
		return exampleDao.findByNomAndTaille(nom, taille);
	}
	
	public List<Example> getByNomOrTaille(String nom, Float taille) {
		return exampleDao.findByNomOrTaille(nom, taille);
	}
	
	public List<Example> getByNomContaining(String nom) {
		return exampleDao.findByNomContaining(nom);
	}
	
	public List<Example> getByNomContainingIgnoreCase(String nom) {
		return exampleDao.findByNomContainingIgnoreCase(nom);
	}
}