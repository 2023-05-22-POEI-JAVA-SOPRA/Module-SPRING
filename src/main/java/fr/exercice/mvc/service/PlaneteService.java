package fr.exercice.mvc.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import fr.exercice.entity.Planete;

@Service
public class PlaneteService {

	public List<Planete> planetes = new ArrayList<Planete>();
	public PlaneteService() {
		planetes.add(new Planete("Mercure", 1, 57900000L, 4880L));
		planetes.add(new Planete("Vénus", 2, 108200000L, 12104L));
		planetes.add(new Planete("Terre", 3, 149600000L, 12742L));
		planetes.add(new Planete("Mars", 4, 227900000L, 6779L));
		planetes.add(new Planete("Jupiter", 5, 778500000L, 139820L));
		planetes.add(new Planete("Saturne", 6, 1400000000L, 116460L));
		planetes.add(new Planete("Uranus", 7, 2900000000L, 50724L));
		planetes.add(new Planete("Neptune", 8, 4500000000L, 49244L));
		
		System.out.println("Service démarré. Les planètes ont été ajoutées.");
	}
	
	public Planete getById(Integer id) {
		return this.planetes.get(id); // a regarder avec les indices
	}

	public List<Planete> getAll() {
		return this.planetes;
	}
	
}
