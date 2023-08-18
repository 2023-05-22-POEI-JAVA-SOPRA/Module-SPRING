package fr.exercice.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
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
	
	@GetMapping("/planeteFormulaire")
	public ModelAndView afficheFormulairePlanete() {
		Planete planete = new Planete("Nom",0,0,0);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planeteFormulaire");
		mav.addObject("newPlanete", planete);	
		return mav;
	}
	
	@PostMapping("/planeteFormulaire")
	public ModelAndView sauvegardePlanete(@Validated @ModelAttribute("newPlanete") Planete planete, BindingResult bindingResult) {
			
		if (bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("planeteFormulaire"); //nom de la vue (page html)
			mav.addObject("newPlanete", planete); //nom du mlodel attribute et valeur de l'object
			System.out.println("Erreur de planete, je ne sauvegarde pas.");
			mav.addObject("errorString", "Erreur dans la planete !");
			return mav;
		}
		ModelAndView mav = new ModelAndView();
		mav.setViewName("planeteFormulaire");
		mav.addObject("newPlanete", planete);
		System.out.println(planete.toString());
		return mav;
	}
}


