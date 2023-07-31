package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.MyFirstRepositorySpingData;
import fr.maboite.webshop.model.Example;

@Component
public class ExamplesService {
	
	@Autowired
	private MyFirstRepositorySpingData firstRepositorySpingData;

	/**Save an example
	 * 
	 * @param example
	 * @return
	 */
	public Example save(Example example )
	{
		
		return firstRepositorySpingData.save(example);
	}
	
	/**
	 * Find all examples in DB
	 * @return
	 */
	public Iterable<Example> getAll()
	{
		return firstRepositorySpingData.findAll();
	}
	
	
	public Example get(Long id)
	{
		return firstRepositorySpingData.findById(id).get();
	}
	
}
