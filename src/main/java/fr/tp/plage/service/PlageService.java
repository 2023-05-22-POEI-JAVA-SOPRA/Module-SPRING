package fr.tp.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Plage;

@Component
public class PlageService {
	
	@Autowired
	private PlageDao plageDao;
	
	public Plage save(Plage plage) {
		return this.plageDao.save(plage);
	}
	
	public Plage get(Integer id) {
		return this.plageDao.get(id);
	}	

}
