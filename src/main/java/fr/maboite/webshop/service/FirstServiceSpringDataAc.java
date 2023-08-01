package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.dao.spring.FirstDaoSpringDataAc;
import fr.maboite.webshop.model.Example;

@Service
public class FirstServiceSpringDataAc {

	@Autowired
	private FirstDaoSpringDataAc exampleRepo;

	public Example save(Example example) {
		return this.exampleRepo.save(example);

	}

	public Iterable<Example> getAll() {
		return this.exampleRepo.findAll();
	}

	public Example getById(Long id) {
		return this.exampleRepo.findById(id).get();
	}

	public String delete(Long id) {
		this.exampleRepo.deleteById(id);
		return "l'id" + id + " a été supprimé";

	}

	public List<Example> findByNom(String nom) {
		return this.exampleRepo.findByNom(nom);
	}

	public List<Example> findByNomIgnoreCase(String nom) {
		return this.exampleRepo.findByNomIgnoreCase(nom);
	}

	public List<Example> findByNomAndTailleIgnoreCase(String nom, Float taille) {
		return this.exampleRepo.findByNomIgnoreCaseAndTaille(nom, taille);
	}
	
	
//	Relation
	public List<Example> findByCategory(String categoryName){
		return this.exampleRepo.findByCategorieNom(categoryName);
	} 
	
	
//	exercices : @Query
	
	public List<Example> findByNomQuery(String nom){
		return this.exampleRepo.getNomQuery(nom);
	}
	
	public List<Example> findByNomTailleQuery(String nom, Float taille){
		return this.exampleRepo.queryNomTaille(nom, taille);
	}
	
	public List<Example> orderNomByDesc(){
		return this.exampleRepo.nomOrderByDesc();
	}
//	public void getByNumeroInsee(String numeroInsee) {
//		Optional<Example> exampleOptional = this.exampleDao.findByNumeroInsee(numeroInsee);
//		if(exampleOptional.isEmpty()) {
//			System.out.println("Attention");
//		}
//		return exampleOptional.orElse(new Example());
//	}
	
	
}
