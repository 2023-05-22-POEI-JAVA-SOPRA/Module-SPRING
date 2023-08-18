package fr.maboite.webshop.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService planeteService;

	@GetMapping("/indexPlanete")
	public ModelAndView indexPlanetes() {

		List<Planete> allPlanetes = planeteService.getAllPlanetes();
		System.out.println(" /indexPlanete in controller called");
		return new ModelAndView("indexPlanete", "allPlanetes", allPlanetes);

	}

	@GetMapping("/planete")
	public ModelAndView planete(@RequestParam("id") Integer id) {

		Planete planete = planeteService.getPlaneteById(id);
		System.out.println(" /planete in controller called");
		return new ModelAndView("planeteDetails", "planete", planete);

	}

	@GetMapping("/planete/{id}")
	public ModelAndView planete2(@PathVariable("id") Integer id) {

		Planete planete = planeteService.getPlaneteById(id);
		System.out.println(" /planete/{id}  in controller called with id :" + id);
		return new ModelAndView("planeteDetails", "planete", planete);

	}

	@PostMapping("/planete")
	public ModelAndView savePlanete(@Validated @ModelAttribute("planete") Planete planete,
			BindingResult bindingResult) {

		System.out.println(planete.getId());
		System.out.println(planete.getName());
		System.out.println(planete.getWeight());
		System.out.println(planete.getDistanceFromEarth());

		if (bindingResult.hasErrors()) {
			System.out.println("Erreur dans la sauvegarde de la planete");
			ModelAndView mv = new ModelAndView();
			mv.addObject("planete", planete);
			mv.setViewName("planeteDetails");
			mv.addObject("errorString", "Erreur dans la sauvegarde de la planete");
			return mv;

		} else {
			planeteService.save(planete);
		}
		ModelAndView mav = new ModelAndView();
	//	mav.setViewName("redirect:/planete?id=" + planete.getId());
		mav.setViewName("redirect:/planete/" + planete.getId());
		mav.addObject("planete", planete);
		System.out.println("Save Done");
		return mav;

	}
}
