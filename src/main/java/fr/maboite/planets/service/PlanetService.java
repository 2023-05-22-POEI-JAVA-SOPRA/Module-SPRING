package fr.maboite.planets.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.maboite.planets.model.Planet;

@Service
public class PlanetService {
    
    private Map<Integer, Planet> planetes = new HashMap<>();
    
    public PlanetService() {
        Planet pluton = new Planet("Pluton", 1);
        Planet starfield = new Planet("Starfield", 2);
        Planet zebes = new Planet("Zébès", 3);
        Planet pnf = new Planet("PNF-404", 4);
        
        this.planetes.put(1, pluton);
        this.planetes.put(2, starfield);
        this.planetes.put(3, zebes);
        this.planetes.put(4, pnf);
    }
    
    public Planet getPlaneteById(Integer id) {
        return this.planetes.get(id);
    }

    public Collection<Planet> getAllPlanetes() {
        return this.planetes.values();
    }
}
