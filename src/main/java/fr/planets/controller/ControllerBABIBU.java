package fr.planets.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

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
	
	@ModelAttribute()
	
}
