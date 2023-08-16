package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Plage;

@Component
public class PlageDao {

	private static Integer idPlage = 0;

	public Plage save(Plage plage) {
		plage.setId(++idPlage);
		return plage;
	}

	public Plage get(Integer id) {
		Plage plageToGet = new Plage();
		plageToGet.setId(id);
		return plageToGet;
	}
}
