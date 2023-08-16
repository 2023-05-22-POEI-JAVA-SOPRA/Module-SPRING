package fr.maboite.webshop.controller.correction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonPremierController {

	@ModelAttribute("monMessage")
	public String monMessage() {
		return "Message dynamique !";
	}

	@ModelAttribute("camion")
	public Camion messageDynamique() {
		// En fonction d'éléments (du contexte, de la session, d'une base de donnée...)
		Camion camion = new Camion();
		camion.setId(1);
		camion.setNom("Renault Tractor");
		return camion;
	}

	@RequestMapping(path = "/salut")
	public String maPremiereMethodeDeController() {
		System.out.println("Méthode sur /salut appelée");
		return "salut";
	}

}
