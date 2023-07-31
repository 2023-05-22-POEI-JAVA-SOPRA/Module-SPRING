package fr.maboite.webshop.service;

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
		return "l'id"+id+" a été supprimé";
		
	}
}
