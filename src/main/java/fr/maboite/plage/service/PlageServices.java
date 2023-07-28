package fr.maboite.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.plage.dao.PlageDao;
import fr.maboite.webshop.model.PlagePojo;

@Service
public class PlageServices {
	@Autowired
	private PlageDao plageDao;
	
	public PlagePojo save(PlagePojo plage) {
		return this.plageDao.save(plage);
	}
	
	public PlagePojo get(Integer id) {
		return this.plageDao.get(id);
	}
}
