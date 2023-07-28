package fr.maboite.tpplage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlageService {
	@Autowired
	PlageDao plageDao;
	
	public Plage save() {
		System.out.println("in PlageService : save");
		return plageDao.save();
	}
	
	public Plage get(Integer id) {
		System.out.println("in PlageService : get");
		return plageDao.get(id);
	}
}
