package fr.planets.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.planets.model.Planet;
import fr.planets.service.servicePlanet;

@Controller
public class ControllerBABIBU {
	
	@Autowired
	private servicePlanet servPl;
	public ControllerBABIBU(){
		System.out.println("C'est moi le controller");
	}

	
	
	
	@RequestMapping(path="/planetes")
	public String allPlanetes() {
		System.out.println("Méthode sur /planetes appelée");
		return "planetes";
	}
	
	@RequestMapping(path="planetes/{id}")
	public ModelAndView afficheDetailPlaneteParChemin(@PathVariable("id") Long id) {
		System.out.println("J'affiche le détail de la planète à partir du chemin : " + id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planete");
		mav.addObject("planete", new Planet("Mercure",12, 3585));
		return mav;
		}
	
	@ModelAttribute("maListePlanete")
	public Collection<Planet> maListePlanete() {
		return servPl.getAll();
	}
	
	
}
