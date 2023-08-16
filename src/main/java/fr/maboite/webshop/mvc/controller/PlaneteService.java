package fr.maboite.webshop.mvc.controller;

import java.util.ArrayList;
import java.util.List;


import org.springframework.stereotype.Component;

@Component
public class PlaneteService {
	
	 static List<Planete> listePlanets = new ArrayList<Planete>();


	 public PlaneteService() {
		 Planete p1 = new Planete(1,"Earth", 10.0, 0.0);	
		 Planete p2 = new Planete(2,"Mercure", 1000.0, 11000000000.0);	
		 listePlanets.add(p1);
		 listePlanets.add(p2);
		}
	
	
	public List<Planete> getAllPlanetes()
	{
		
		return listePlanets;
	}
	public Planete getPlaneteById(Integer id)
	{
		
		return listePlanets.get(id)  != null ? listePlanets.get(id) : null;
	}

}
