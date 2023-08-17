package fr.maboite.webshop.planete.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.maboite.webshop.model.Planete;

@Service
public class PlaneteService {
	
	private Map<Integer, Planete> planetes = new HashMap<>();

	public PlaneteService() {
		Planete mercure = new Planete();
		mercure.setId(1);
		mercure.setNom("Mercure");
		mercure.setMasse(12);
		this.planetes.put(1, mercure);

		Planete venus = new Planete();
		venus.setId(2);
		venus.setNom("Venus");
		venus.setMasse(30);
		this.planetes.put(2, venus);

		Planete terre = new Planete();
		terre.setId(3);
		terre.setNom("Terre");
		terre.setMasse(35);
		this.planetes.put(3, terre);
	}

	public Planete getById(Integer id) {
		return this.planetes.get(id);
	}

	public Collection<Planete> getAll() {
		return this.planetes.values();
	}

	public Map<Integer, Planete> getPlanetes() {
		return planetes;
	}

	public void setPlanetes(Map<Integer, Planete> planetes) {
		this.planetes = planetes;
	}
	
	

}
