package fr.maboite.webshop.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Planet;

@Component
public class PlanetService {
	
//	@Autowired
//	private PlanetDao planetDao;
	
	private Map<Integer, Planet> planets = new HashMap<>();
	
	
	public PlanetService() {
		Planet earth = new Planet();
		earth.setId(1);
		earth.setName("Earth");
		earth.setMass(60);
		Planet mars = new Planet();
		mars.setId(2);
		mars.setName("Mars");
		mars.setMass(6);
		this.planets.put(1,earth);
		this.planets.put(2,mars);
	}

	public Iterable<Planet> getAllPlanets(){
		return this.planets.values();
	}
	
	public Planet getPlanetById(Integer id) {
		return this.planets.get(id);
	}
	
}
