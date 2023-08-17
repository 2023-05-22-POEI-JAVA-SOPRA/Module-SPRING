package fr.maboite.webshop.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.maboite.webshop.model.Camion;

@Controller
public class MonPremierController {

	@ModelAttribute("camion")
	public Camion msgcamion() {
		Camion camion = new Camion();
		camion.setId(1);
		camion.setNom("kia");
		return camion;
	}

	@ModelAttribute("camions")
	public Iterable<Camion> Camions() {

		ArrayList<Camion> camions = new ArrayList<Camion>();
		Camion camion1 = new Camion();
		camion1.setId(2);
		camion1.setNom("renault");
		camions.add(camion1);
		Camion camion2 = new Camion();
		camion2.setNom("porch");
		camions.add(camion2);
		return camions;
	}

	@RequestMapping(path = "/salut")
	public String MethodedeMonPremierController() {  //MethodedeMonPremierController 
		System.out.println("La Methode est appelée !");
		return "salut";

	}
}
