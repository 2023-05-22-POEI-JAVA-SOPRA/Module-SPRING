package fr.maboite.webshop.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlaneteController {

	
	@Autowired
	private PlaneteService planeteService;
	
	@RequestMapping("/indexPlanete")
	public ModelAndView indexPlanetes()
	{
		
		List<Planete> allPlanetes = planeteService.getAllPlanetes();
		System.out.println(" /indexPlanete in controller called");
		return new ModelAndView("indexPlanete","allPlanetes",allPlanetes);
		
	}
	
	@RequestMapping("/planete")
	public ModelAndView planete(@RequestParam("id") Integer id)
	{
		
		Planete planete = planeteService.getPlaneteById(id);
		System.out.println(" /planete in controller called");
		return new ModelAndView("planeteDetails","planete",planete);
		
	}
	
	@RequestMapping("/planete/{id}")
	public ModelAndView planete2(@PathVariable("id") Integer id)
	{
		
		Planete planete = planeteService.getPlaneteById(id);
		System.out.println(" /planete/{id} in controller called");
		return new ModelAndView("planeteDetails","planete",planete);
		
	}
}

