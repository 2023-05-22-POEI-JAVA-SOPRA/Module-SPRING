package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.CategoryDao;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.model.ExampleSpringDao;

@Service
public class ExampleService {
	
	@Autowired
	private ExampleSpringDao exampleDao;
	
	@Autowired
	private CategoryDao categoryDao;
	
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
	
	public List<Example> getNomOrderByTailleIdDesc(String nom){
		return this.exampleDao.maQueryPerso(nom);
	}
	
	public List<Example> getAnimalByTailleContenantLettre(String nom, Float taille1, Float taille2){
		return this.exampleDao.getAnimalsBySizeAndName(nom,taille1,taille2);
	}
	
	public List<Example> getAnimalsByNoms(String nom){
		return this.exampleDao.getAnimalsByNom(nom);
	}
	// ATTENTION Certaines méthodes ne fonctionnent pas sous Postgresql
//	public List<Example> getByForchetta(String nom,Float borne1, Float borne2){
//		return this.exampleDao.findByNomOrTailleWithin(nom, borne1,  borne2);
//	}
	
	public List<Example> getExampleByCategory(String nom){
		return this.exampleDao.findByCategoryNom(nom);
	}
	
	//Fondamentaux @Transactional
	@Transactional
	public Example assiciateWithCategory(Example example, String categoryName) {
		Category category= this.categoryDao.findByNom();
		category.setNom("Saaaaaaalut!");
		this.categoryDao.save(category);
		
		example.setCategory(category);
		Example exampleSaved=this.exampleDao.save(example);
		return exampleSaved;
	}
	
	}
