package fr.maboite.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Planet;

@Controller
public class PlanetController {
	
	@Autowired
	private PlanetService planetService;
	
	@GetMapping("/planet/planets")
	public ModelAndView showPlanet() {
		Iterable<Planet> planets = this.planetService.getAllPlanets();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/planet/planets");
		mav.addObject("planets",planets);
		return mav;
	}
	
	@GetMapping("/planet/planet-detail/{id}")
	public ModelAndView showPlanetDetail(@PathVariable("id") Integer id ) {
		Planet planet = this.planetService.getPlanetById(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/planet/planet-detail");
		mav.addObject("planet",planet);
		return mav;
	}
	
	@GetMapping("/planet/planet-detail/save")
	public ModelAndView savePlanet() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/planet/planet-detail");
		mav.addObject("planet",new Planet());
		return mav;
	}
	
	@PostMapping("/planet/planet-detail/error")
	public ModelAndView savePlanet(@Validated @ModelAttribute("planet") Planet planet, BindingResult result) {
		
		System.out.println("J'ai récupéré la planète avec l'id : "+planet.getId());

		if (result.hasErrors()) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/planet/planet-detail");
			mav.addObject("planet", planet);
			System.out.println("Erreur de planète, je ne sauvegarde pas.");
			mav.addObject("errorString", "Erreur dans la planète!!!");
			return mav;
		}else {
			this.planetService.savePlanet(planet);
		
			ModelAndView mav = new ModelAndView();
			mav.setViewName("redirect:/planet/planets");
			mav.addObject("planet",planet);
			return mav;
		}
	}

}
