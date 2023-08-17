package fr.maboite.webshop.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class PlaneteService {

	static List<Planete> listePlanets = new ArrayList<Planete>();

	public PlaneteService() {
		Planete p0 = new Planete(0, "Mercure", 0.055, 91.0);
		Planete p1 = new Planete(1, "Venus", 0.857, 41.0);
		Planete p2 = new Planete(2, "Earth", 1.0, 0.0);
		Planete p3 = new Planete(3, "Mars", 0.107, 78.0);
		Planete p4 = new Planete(4, "Jupiter", 317.8, 628.0);
		Planete p5 = new Planete(5, "Saturne", 95.152, 1275.0);
		Planete p6 = new Planete(6, "Uranus", 14.536, 2724.0);
		Planete p7 = new Planete(7, "Neptune", 17.147, 4351.0);
		Planete p8 = new Planete(8, "Soleil", 330000.0, 149.0);
		listePlanets.add(p0);
		listePlanets.add(p1);
		listePlanets.add(p2);
		listePlanets.add(p3);
		listePlanets.add(p4);
		listePlanets.add(p5);
		listePlanets.add(p6);
		listePlanets.add(p7);
		listePlanets.add(p8);
	}

	public List<Planete> getAllPlanetes() {

		return listePlanets;
	}

	public Planete getPlaneteById(Integer id) {

		try {
			return listePlanets.stream().filter(p -> p.getId() == id).findFirst()
					.orElse(null);
		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			return null;
		}

//		return listePlanets.get(id) != null ? listePlanets.get(id) : null;
	}

	public Planete save(Planete planete) {
		Planete planetToModify = new Planete();
		try {
			if (planete.getId() >= 0) {

				planetToModify = listePlanets.stream().filter(p -> p.getId() == planete.getId()).findFirst()
						.orElse(null);
				planetToModify.setDistanceFromEarth(planete.getDistanceFromEarth());
				planetToModify.setWeight(planete.getWeight());
				planetToModify.setId(planete.getId());
				planetToModify.setName(planete.getName());
			}

		} catch (Exception e) {
			System.out.println("Error : " + e.getMessage());
			return null;
		}
		return planetToModify;

	}

}
