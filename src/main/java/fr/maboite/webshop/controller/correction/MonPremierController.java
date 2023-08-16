package fr.maboite.webshop.controller.correction;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonPremierController {

	@ModelAttribute("monMessage")
	public String monMessage() {
		return "Message dynamique !";
	}

	@ModelAttribute("poids")
	public Integer poids() {
		return Integer.valueOf(3);
	}

	@ModelAttribute("camions")
	public Iterable<Camion> camions() {
		ArrayList<Camion> camions = new ArrayList<Camion>();
		Camion camion1 = new Camion();
		camion1.setId(1);
		camion1.setNom("MAN");
		camions.add(camion1);
		Camion camion2 = new Camion();
		camion2.setId(2);
		camion2.setNom("Ford");
		camions.add(camion2);
		return camions;
	}

	@ModelAttribute("camion")
	public Camion camion() {
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
