package fr.exercice.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import fr.exercice.entity.Planete;
import fr.exercice.mvc.service.PlaneteService;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService ps;
	
	@GetMapping(path = "/planete")
	public String planetes() {
		return "planete";
	}
	
	@ModelAttribute("planetes")
	public List<Planete> afficheToutesPlanetes() {
		return ps.getAll();
	}
}
