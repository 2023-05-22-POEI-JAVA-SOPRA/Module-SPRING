package fr.maboite.webshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Camion;

@Controller
public class CamionController {

	@RequestMapping("/camion")
	public ModelAndView showCamionRequestParam(@RequestParam("name") String name ) {
		System.out.println("A partir du param de requête, j'affiche la page du camion : "+name);
		
		Camion camion = new Camion();
		camion.setName("Renault");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("camion");
		mav.addObject("camion",camion);
		return mav;
	}
	
	@RequestMapping("/camion/{name}")
	public String showCamionPathVariable(@PathVariable("name") String name ) {
		System.out.println("A partir de la variable du chemin de requête, j'affiche la page du camion : "+name);
		return "camion";
	}
	
}
