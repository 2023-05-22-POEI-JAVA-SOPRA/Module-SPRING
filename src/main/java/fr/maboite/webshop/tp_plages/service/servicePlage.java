package fr.maboite.webshop.tp_plages.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.tp_plages.dao.plageDao;
import fr.maboite.webshop.tp_plages.model.Plage;

@Service
public class servicePlage {

	@Autowired
	private plageDao maPlageDao;
	
	public Plage savePlage(Plage plage) {
		System.out.println("servicePlage --> Methode savePlage appelee");
		return maPlageDao.savePlage(plage);
	}
	
	public Plage getPlage(Integer id) {
		System.out.println("servicePlage --> Methode getPlage appelee");
		return maPlageDao.getPlage(id);
	}
}
