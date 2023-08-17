package tp.planete.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import tp.planete.entity.Planete;
import tp.planete.service.PlaneteService;

@Controller
public class PlaneteController {
	
	@Autowired
	private PlaneteService planeteService;
	
	@ModelAttribute("lesPlanetes")	
	public Collection<Planete> recuperePlanetes(){
		Collection<Planete> planetes = planeteService.getAll();
		return planetes;
	}
	
	@ModelAttribute("details")
	public Planete recupereDetailPlanete(@PathVariable String name){
		Planete unePlanete = planeteService.getByName(name);
		return unePlanete;
		
	}	
	
	@RequestMapping(path = "/planetes")
	public String PlaneteMethodeDeController() {
		System.out.println("Méthode sur /planete appelée");
		return "planetes";
	}
	
	@RequestMapping(path = "/planete/{name}")
	public String DetailsMethodeDeController() {
		System.out.println("Méthode details planète appelée");
		return "detailsPlanete";
	}
}
