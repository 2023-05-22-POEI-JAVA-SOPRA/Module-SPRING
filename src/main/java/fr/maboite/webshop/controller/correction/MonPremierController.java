package fr.maboite.webshop.controller.correction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
		return "coucou c est moi";
	}
}
