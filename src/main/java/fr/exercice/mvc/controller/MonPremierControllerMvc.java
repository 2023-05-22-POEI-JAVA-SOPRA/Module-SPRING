package fr.exercice.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MonPremierControllerMvc {
	
	public MonPremierControllerMvc() {
		System.out.println("Je suis le controller mvc");
	}

	@GetMapping(path = "/coucou") //élément à rajouter dans l'url
	public String coucou() {
		return "coucou";   //nom du fichier html à afficher
	}
}
