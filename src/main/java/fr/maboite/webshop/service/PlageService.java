package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Plage;

@Component
public class PlageService {
	
	@Autowired
	private PlageDao plageDao;

	
	public Plage save(Plage plage)
	{	
		return plageDao.save(plage);
		
	}
	
	public PlageService()
	{
		System.out.println("PlageService created");
	}
	
	public Plage get(Integer id)
	{
		return plageDao.get(id);

	}
	
}
