package fr.maboite.webshop.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.planete.service.PlaneteService;

@Controller
public class PlaneteController {
	
	@Autowired
	PlaneteService planeteService;
	
	@RequestMapping("/planetarium")
	public ModelAndView AffichagePlanetes() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planetarium");
		mav.addObject("planetes", planeteService.getAll());
		return mav;
	}
	
	@RequestMapping("/planetarium/{id}")
	public ModelAndView AffichagePlanetesById(@PathVariable("id") int id) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planete"); // spécifie le nom du fichier html auquel on se lie (équivalent au return "planetarium" du @getMapping)
		mav.addObject("planete", planeteService.getById(id)); //equivalent au @modelAttribute("planete") avec un return planeteService.getById(id)
		mav.addObject("message", " La masse de la planete est de: " );
		return mav;
	}

}
