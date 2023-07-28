package fr.maboite.hotel.service;

import org.springframework.stereotype.Service;

import fr.maboite.hotel.dao.PlageDao;
import fr.maboite.hotel.entity.Plage;

@Service
public class PlageService {

	private PlageDao pDao;

	public Plage getPlage(Integer id) {
		System.out.println("Get Plage In Service");
		return pDao.get(id);
	}

	public Plage savePlage(Plage plage) {
		System.out.println("Save Plage In Service");
		return pDao.save(plage);
	}

	public PlageService(PlageDao pDao) {
		System.out.println("Plage Service");
		this.pDao = pDao;
	}

}
