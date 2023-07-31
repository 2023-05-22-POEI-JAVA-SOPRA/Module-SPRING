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
	}
