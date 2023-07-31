package fr.maboite.plage.dao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.PlagePojo;

@Component
public class PlageDao {
	public PlagePojo get(Integer id) {
		System.out.println("méthode get Plage");
		
		return new PlagePojo();
	}
	
	public PlagePojo save(PlagePojo plage) {
		System.out.println("je dois sauvegarder une nouvelle Plage");
		plage.setId(2);
		plage.setName("blabla");
		return plage;
	}

}
