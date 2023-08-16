package fr.maboite.webshop.tp_plages.dao;

import org.springframework.stereotype.Repository;

import fr.maboite.webshop.tp_plages.model.Plage;

@Repository
public class plageDao {
	
	
	
	public Plage savePlage(Plage plage) {
		System.out.println("plageDao --> Methode savePlage appelee");
		Plage savedPlage=plage;
		return savedPlage;
	}

	public Plage getPlage(Integer id) {
		System.out.println("plageDao --> Methode getPlage appelee");
		return new Plage();
	}
}
