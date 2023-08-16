package fr.maboite.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PremierController {
	@RequestMapping(path = "/coucou")
	public String maPremiereMethodeDeController() {
		System.out.println("Méthode sur /coucou appelée");
		return "coucou";
	}
}
