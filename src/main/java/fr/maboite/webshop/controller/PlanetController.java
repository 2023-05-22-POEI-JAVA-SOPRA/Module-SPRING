package fr.maboite.webshop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Planet;

@Controller
public class PlanetController {
	
	@Autowired
	private PlanetService planetService;
	
	@RequestMapping("/planet")
	public ModelAndView showPlanet() {
		Iterable<Planet> planets = this.planetService.getAllPlanets();
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planet");
		mav.addObject("planets",planets);
		return mav;
	}
	
	@RequestMapping("/planet/{id}")
	public ModelAndView showPlanetDetail(@PathVariable("id") Integer id ) {
		Planet planet = this.planetService.getPlanetById(id);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planetdetail");
		mav.addObject("planet",planet);
		return mav;
	}

}
