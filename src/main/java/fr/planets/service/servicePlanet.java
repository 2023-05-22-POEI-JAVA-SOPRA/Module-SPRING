package fr.planets.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.planets.model.Planet;

@Service
public class servicePlanet {
	
	private Map<Integer, Planet> planetes = new HashMap<>();
	
	public servicePlanet() {
		System.out.println("Planetes chargees !");
		Planet mercure=new Planet();
		mercure.setId(1);
		mercure.setDiametre(1000);
        mercure.setName("Mercure");
        
        Planet terre = new Planet();
        terre.setId(2);
        terre.setDiametre(2000);
        terre.setName("Terre");
        
        Planet jupiter = new Planet();
        jupiter.setId(3);
        jupiter.setDiametre(3000);
        jupiter.setName("Jupiter");
      
        Planet neptune = new Planet();
        neptune.setId(4);
        neptune.setDiametre(4000);
        neptune.setName("Neptune");
        
        this.planetes.put(1, mercure);
        this.planetes.put(2, terre);
        this.planetes.put(3, jupiter);
        this.planetes.put(4, neptune);


	}
	
	public Planet getById(Integer id) {
		return this.planetes.get(id);
	}

	public Collection<Planet> getAll() {
		return this.planetes.values();
	}
}
