package fr.planets.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.planets.model.Planet;

@Service
public class PlanetService {
	
	private Map<Integer, Planet> planetes = new HashMap<>();
	
	public PlanetService() {
		Planet pluton=new Planet();
		pluton.setId(1);
        pluton.setName("Pluton");
        
        Planet starfield = new Planet();
        starfield.setId(2);
        starfield.setName("Starfield");
        
        Planet zebes = new Planet();
        zebes.setId(3);
        zebes.setName("Zébès");
      
        Planet pnf = new Planet();
        pnf.setId(4);
        pnf.setName("PNF-404");
        
        this.planetes.put(1, pluton);
        this.planetes.put(2, starfield);
        this.planetes.put(3, zebes);
        this.planetes.put(4, pnf);


	}
	
	public Planet getById(Integer id) {
		return this.planetes.get(id);
	}

	public Collection<Planet> getAll() {
		return this.planetes.values();
	}
}