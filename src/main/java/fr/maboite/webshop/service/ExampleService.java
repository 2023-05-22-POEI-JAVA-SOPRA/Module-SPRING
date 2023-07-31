package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.model.ExampleSpringDao;

@Service
public class ExampleService {
	
	@Autowired
	private ExampleSpringDao exampleDao;
	
	public Example save(Example example) {
		
		return this.exampleDao.save(example);
		}
	
	public List<Example> getAll() {
		return (List<Example>) this.exampleDao.findAll();
	}
	
	public Example getById(Long id) {
		return this.exampleDao.findById(id).get();
	}
	public void deleteById(Long id) {
		this.exampleDao.deleteById(id);
	}
	
	public List<Example> getByNom(String nom) {
		return this.exampleDao.findByNom(nom);
	}
	public List<Example> getByNomIgnoreCase(String nom) {
		return this.exampleDao.findByNomIgnoreCase(nom);
	}
	public List<Example> getByPartName(String partName){
		return this.exampleDao.findByNomContainingIgnoreCase(partName);
	}
	
	public List<Example> getByNameAndTaille(String nom, Float taille){
		return this.exampleDao.findByNomAndTaille(nom,taille);
	}
	
	public List<Example> getByNameOrTaille(String nom, Float taille){
		return this.exampleDao.findByNomOrTailleGreaterThanEqual(nom,taille);
	}
//	public List<Example> getByForchetta(String nom,Float borne1, Float borne2){
//		return this.exampleDao.findByNomOrTailleWithin(nom, borne1,  borne2);
//	}
	
	
	}
