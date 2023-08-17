package fr.planets.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.planets.model.Planet;
import fr.planets.service.PlanetService;


@Controller
public class PlanetController {
	
	@Autowired
	private PlanetService planetService;
	
	public PlanetController(){
		System.out.println("Controller In");
	}

	@RequestMapping("/indexPlanete")
	public ModelAndView indexPlanetes()
	{
		
		Collection<Planet> allPlanetes = planetService.getAll();
		System.out.println(" indexPlanette in controller called");
		return new ModelAndView("indexPlanete","allPlanetes",allPlanetes);
		
	}
	
	@RequestMapping("/planete")
	public ModelAndView planete(@RequestParam("id") Integer id)
	{
		
		Planet planete = planetService.getById(id);
		System.out.println(" planete in controller called");
		return new ModelAndView("planeteDetails","planete",planete);
		
	}
	
	@RequestMapping("/planete/{id}")
	public ModelAndView planete2(@PathVariable("id") Integer id)
	{
		
		Planet planete = planetService.getById(id);
		System.out.println(" planete in controller called");
		return new ModelAndView("planeteDetails","planete",planete);
		
	}
}