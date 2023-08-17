package fr.maboite.webshop.controller;

import java.util.HashMap;
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
		earth.setId(3);
		earth.setName("Terre");
		earth.setMass(1f);
		Planet mars = new Planet();
		mars.setId(4);
		mars.setName("Mars");
		mars.setMass(0.107f);
		Planet venus = new Planet();
		venus.setId(2);
		venus.setName("Venus");
		venus.setMass(0.815f);
		Planet jupiter = new Planet();
		jupiter.setId(5);
		jupiter.setName("Jupiter");
		jupiter.setMass(317.8f);
		Planet uranus = new Planet();
		uranus.setId(7);
		uranus.setName("Uranus");
		uranus.setMass(14.536f);
		Planet neptune = new Planet();
		neptune.setId(8);
		neptune.setName("Neptune");
		neptune.setMass(17.147f);
		Planet mercure = new Planet();
		mercure.setId(1);
		mercure.setName("Mercure");
		mercure.setMass(0.055f);
		Planet saturne = new Planet();
		saturne.setId(6);
		saturne.setName("Saturne");
		saturne.setMass(95.152f);
		this.planets.put(1,mercure);
		this.planets.put(2,venus);
		this.planets.put(3,earth);
		this.planets.put(4,mars);
		this.planets.put(5,jupiter);
		this.planets.put(6,saturne);
		this.planets.put(7,uranus);
		this.planets.put(8,neptune);
	}

	public Iterable<Planet> getAllPlanets(){
		return this.planets.values();
	}
	
	public Planet getPlanetById(Integer id) {
		return this.planets.get(id);
	}
	
}
