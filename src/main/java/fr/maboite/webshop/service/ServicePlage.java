package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.PlageDao;
import fr.maboite.webshop.pojo.Plage;

@Component
public class ServicePlage {


	@Autowired
	PlageDao plageDao;

	
	public Plage get(Integer id) {
		System.out.println("coucou get service plage");
		return plageDao.get(id);
	}
	
	public Plage save(Plage plage) {
		System.out.println("coucou save service plage");
		return plageDao.save(plage);
	}
}
