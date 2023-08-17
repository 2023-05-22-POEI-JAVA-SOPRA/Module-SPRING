package fr.maboite.webshop.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.maboite.webshop.model.Camion;

@Controller
public class CoucouController {
	

	@RequestMapping("/coucou")
	public String sayCoucou() {
		System.out.println("Controlleur coucou");
		return "coucou";
	}
	
	@ModelAttribute("monMessage")
	private String monMessage() {
		return "Il est : "+LocalDateTime.now();
	}

	
	@ModelAttribute("monCamion")
	private Camion monCamion() {
		Camion camion = new Camion();
		camion.setName("Renault Master");
		return camion;
	}
	
	@ModelAttribute("poids")
	private Integer monPoids() {
		return 10;
	}
	
	@ModelAttribute("camions")
	private Iterable<Camion> camions() {
		List<Camion> camions = new ArrayList<Camion>();
		Camion camion1 = new Camion();
		camion1.setName("Renault Master");
		Camion camion2 = new Camion();
		camion2.setName("Fiat Ducato");
		camions.add(camion1);
		camions.add(camion2);
		return camions;
	}
	
}
