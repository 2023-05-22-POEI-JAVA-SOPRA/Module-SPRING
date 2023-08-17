package tp.planete.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import tp.planete.entity.Planete;

@Service
public class PlaneteService {
	
	private Map<Integer, Planete> planetes = new HashMap<>();
	
	public PlaneteService() {
		Planete mercure = new Planete();
		mercure.setId(1);
		mercure.setName("Mercure");
		mercure.setDiameter(4878);
		mercure.setDensity(5.40f);
		mercure.setMainCompo("Silicate");
		this.planetes.put(1, mercure);
		
		Planete terre = new Planete();
		terre.setId(2);
		terre.setName("Terre");
		terre.setDiameter(12750);
		terre.setDensity(5.51f);
		terre.setMainCompo("Silicate");
		this.planetes.put(2, terre);
		
		Planete jupiter = new Planete();
		jupiter.setId(3);
		jupiter.setName("Jupiter");
		jupiter.setDiameter(143000);
		jupiter.setDensity(1.3f);
		jupiter.setMainCompo("Hydrogène");
		this.planetes.put(3, jupiter);
		
		Planete neptune = new Planete();
		neptune.setId(4);
		neptune.setName("Neptune");
		neptune.setDiameter(49500);
		neptune.setDensity(1.63f);
		neptune.setMainCompo("Hydrogène");
		this.planetes.put(4, neptune);
	} 
	
	public Planete getById(Integer id) {
		return this.planetes.get(id);
	}
	
	public Planete getByName(String name) {
	    for (Planete planete : planetes.values()) {
	        if (planete.getName().equalsIgnoreCase(name)) {
	            return planete;
	        }
	    }
	    return null;
	}

//	Pourquoi pas List ?
	public Collection<Planete> getAll() {
		return this.planetes.values();
	}
}
