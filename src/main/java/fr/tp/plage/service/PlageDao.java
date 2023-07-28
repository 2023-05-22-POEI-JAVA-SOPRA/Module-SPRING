package fr.tp.plage.service;

import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Plage;

@Component
public class PlageDao {
	
private Plage plages = new Plage(1,"Cricket Waves");
	
	public Plage save(Plage plage) {
		
		System.out.println("appel a la methode save de la plage");
		
		return plage;
	}
	
	public Plage get(Integer id) {
		
		System.out.println("appel a la methode get de la plage");
		if(plages.getId() == id)
		return this.plages;
		
		return null;
	}

}
