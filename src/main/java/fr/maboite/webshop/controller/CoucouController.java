package fr.maboite.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CoucouController {

	@RequestMapping(path = "/coucou", method = RequestMethod.GET)
	public String maPremiereMethodeDeController() {
		System.out.println("Méthode sur /coucou appelée");
		return "coucou";
	}

}
