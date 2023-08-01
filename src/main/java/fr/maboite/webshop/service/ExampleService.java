package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.jdbcdao.ExampleDAO;
import fr.maboite.webshop.model.Example;

@Service
public class ExampleService {

	@Autowired
	private ExampleDAO exampleDao;
	
	
	
	public Example save(Example exemple) {
		return exampleDao.save(exemple);
	}
	
	public Example getById(long id) {
		return exampleDao.findById(id).orElse(null);
	}
	
	public List<Example> findByNom(String nom){
		return exampleDao.findByNom(nom);
	}
	
	public List<Example> findByNomOrderByNom(String nom){
		return exampleDao.findByNomOrderByNomAsc(nom);
	}
	
	
	
	
	

	public List<Example> getAllOrderByNom(){
		return exampleDao.getAllOrderByNom();
	}

	public List<Example> getByNomOrId(String nom, long id){
		return exampleDao.getByNomOrId(nom, id);
	}
	
	
	
	public List<Example> getAllExampleByCategoryId(long id){
		return  exampleDao.getAllExampleByCategoryId(id);
	}
	public List<Example> getByCategoryNom(String nom){
		return  exampleDao.getByCategoryNom(nom);
	}
	
	
}
