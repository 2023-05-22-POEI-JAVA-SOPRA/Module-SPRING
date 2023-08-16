package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.EcoleRepository;
import fr.maboite.webshop.model.Ecole;

//@Component
public class EcoleService {
	
	
	@Autowired
	EcoleRepository ecoleRepository;
	
	/**
	 * 
	 * @param ecole
	 * @return ecole saved
	 */
	public Ecole save(Ecole ecole)
	{
		return ecoleRepository.save(ecole);
	}

	public Iterable<Ecole> getAll()
	{
		return  ecoleRepository.findAll();
	}
	
	public Ecole getById(Long id)
	{
		return  ecoleRepository.findById(id).orElse(null);
	}
	
	
	
}
