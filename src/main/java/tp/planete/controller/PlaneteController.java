package tp.planete.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import tp.planete.entity.Planete;
import tp.planete.service.PlaneteService;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService planeteService;

	@ModelAttribute("lesPlanetes")
	public Collection<Planete> recuperePlanetes() {
		Collection<Planete> planetes = planeteService.getAll();
		return planetes;
	}

//Recherche par l'id de la planète
//	Avec ModelAttribute ne pas utiliser @PathVariable mais @RequestParam
	@ModelAttribute("details")
	public Planete recupereDetailPlanete(@RequestParam(name="id", required = false) Integer id){
		if (id != null) {
	        Planete unePlanete = planeteService.getById(id);
	        return unePlanete;
	    }
	    return null;
	}
	
//	Recherche par le nom de la planète
//	@ModelAttribute("details")
//	public Planete recupereDetailPlanete(@PathVariable String name){
//		Planete unePlanete = planeteService.getByName(name);
//		return unePlanete;	
//	}	

	@RequestMapping("/planetes")
	public String PlaneteMethodeDeController() {
		System.out.println("Méthode sur /planete appelée");
		return "planetes";
	}

//	Mapping avec url NOM
//	@RequestMapping(path = "/planete/{name}")
//	public String DetailsMethodeDeController() {
//		System.out.println("Méthode details planète appelée");
//		return "detailsPlanete";
//	}
	
//	Mapping avec url ID
	@RequestMapping("/planete/{idPlanete}")
	public String DetailsMethodeDeController(@PathVariable("idPlanete") Integer id) {
		System.out.println("recherche par id");
		return "detailsPlanete";
	}
	
}
