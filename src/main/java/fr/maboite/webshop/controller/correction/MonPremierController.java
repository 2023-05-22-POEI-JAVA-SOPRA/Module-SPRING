package fr.maboite.webshop.controller.correction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.maboite.webshop.model.Camion;

@Controller
public class MonPremierController {
	
	
	@RequestMapping(path = "/salut")
	public String maPremiereMethodeDeController() {
		System.out.println("Méthode sur /salut appelée");
		return "salut";
	}

	@RequestMapping(path = "/coucou")
	public String maSecondeMethodeDeController() {
		System.out.println("Méthode sur /coucou appelée");
		return "coucou";
	}
	
	@ModelAttribute("maValeur")
	public String maValeur(){
		return "ABCD";
	}
	
	@ModelAttribute("monCamion")
	public String monCamion() {
		Camion camion = new Camion("Monbo","Camion");
		return camion.getName();
	}
	
	
}
