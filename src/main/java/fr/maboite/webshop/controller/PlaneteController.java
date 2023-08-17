package fr.maboite.webshop.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Planete;
import fr.maboite.webshop.service.PlaneteService;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService planeteservice;

	@RequestMapping("/monMessage")
	public String monMessage() {
		return "Message dynamique";
	}

	@ModelAttribute("planetes")
	public List<Planete> AfficheMesPlanetes() {
		return planeteservice.getAll();
	}

	@RequestMapping("/planete")
	public ModelAndView AffichagePlaneteParRequstParam(@RequestParam("id") Integer id) {
		System.out.println("à partir de parametre de requete, j'affiche La planete  :" + id);

		Planete planete = planeteservice.getById(id);

		/*
		 * Planete planete = new Planete(); planete.setId(1); planete.setNom("planete :"
		 * + id);
		 */

		return new ModelAndView("planete", "planete", planete);

	}

	@RequestMapping("/planete/{id}")
	public String AffichagePlaneteParPathVar(@PathVariable("id") Integer id) {
		System.out.println("à partir de la variable, j'affiche La planete  :" + id);

		return "planete";

	}

	@RequestMapping(path = "/planetes") // il faut differencier raquetsmapping des autres methodes
	public String MethodePlanete() { // MethodedeMonPremierController
		System.out.println("La planete est appelée !");
		return "planetes";

	}

}
