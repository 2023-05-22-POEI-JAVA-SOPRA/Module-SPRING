package fr.maboite.webshop.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Planete;

@Component
public class PlaneteService {
	//private Map<Integer, Planete> planetes = new HashMap<>();
	public List<Planete> planetes = new ArrayList<Planete>();
	

	public PlaneteService() {
		
		planetes.add(new Planete(0,"mercure"));
		planetes.add(new Planete(1,"venus"));
		planetes.add(new Planete(2,"terre"));
		planetes.add(new Planete(3,"XR"));
		
		/*
		 * Planete mercure = new Planete(); mercure.setId(1); mercure.setNom("Mercure");
		 * mercure.setMasse(12); //this.planetes.put(1, mercure);
		 * 
		 * Planete venus = new Planete(); venus.setId(2); venus.setNom("Venus");
		 * venus.setMasse(30); //this.planetes.put(2, venus);
		 * 
		 * Planete terre = new Planete(); terre.setId(3); terre.setNom("Terre");
		 * terre.setMasse(35);
		 */
		//this.planetes.put(3, terre);
	}

	public Planete getById(Integer id) {
		return this.planetes.get(id);
	}

	/*
	 * public Collection<Planete> getAll() { return this.planetes.values(); }
	 */
	
	public List<Planete> getAll() {
		return this.planetes;
	}

}
