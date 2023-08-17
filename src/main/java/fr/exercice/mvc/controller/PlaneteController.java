package fr.exercice.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import fr.exercice.entity.Planete;
import fr.exercice.mvc.service.PlaneteService;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService ps;

	@GetMapping(path = "/planetes") // dans le lien
	public String planetes() {
		return "planetes"; // nom du fichier html
	}

	@ModelAttribute("planetes")
	public List<Planete> afficheToutesPlanetes() {
		return ps.getAll();
	}

	@RequestMapping("/planetes/{ordre}")
	public ModelAndView afficheDetail(@PathVariable("ordre") Integer ordre) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planeteDetails");
		mav.addObject("planeteDetails", ps.getById(ordre));
		return mav;
	}
}
