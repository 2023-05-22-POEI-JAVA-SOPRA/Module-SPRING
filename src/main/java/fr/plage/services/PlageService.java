package fr.plage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.plage.dao.PlageDao;
import fr.plage.entity.Plage;

@Service
public class PlageService {

	@Autowired
	private PlageDao plageDao;

	public Plage create(Plage plageervation) {
		return this.plageDao.save(plageervation);
	}

	public String getById(Integer id) {
		return this.plageDao.getById(id);
	}

	public String delById(Integer id) {
		return this.plageDao.delById(id);
	}
}
