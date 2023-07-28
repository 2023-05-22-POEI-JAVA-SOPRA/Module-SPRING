package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Plage;

@Component
public class PlageService {
	
	@Autowired
	private PlageDao plageDao;
	
	public Plage save(Plage plage) {
		System.out.println("Appel de save PlageService");
		return this.plageDao.save(plage);
	}
	
	public Plage get(Integer id) {
		System.out.println("Appel de get PlageService");
		return this.plageDao.get(id);
	}

}
