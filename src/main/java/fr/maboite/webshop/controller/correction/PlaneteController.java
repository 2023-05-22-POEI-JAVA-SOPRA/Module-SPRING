package fr.maboite.webshop.controller.correction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Planete;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService planeteService;

	@GetMapping("/planete/planete-detail")
	public ModelAndView affichePlaneteParRequestParam(@RequestParam("id") Integer id) {

		Planete planete = this.planeteService.getById(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/planete/planete-detail");

		mav.addObject("planete", planete);

		return mav;
	}

	@GetMapping("/planete/create-planete")
	public ModelAndView createPlanete() {
		return new ModelAndView("/planete/planete-detail", "planete", new Planete());
	}

	@RequestMapping("/planete/planete-detail/{id}")
	public ModelAndView affichePlaneteParPathVariable(@PathVariable("id") Integer id) {
		return affichePlaneteParRequestParam(id);
	}

	@RequestMapping(path = "/planete/planetes-list")
	public ModelAndView planetes() {
		return new ModelAndView("/planete/planetes-list", "planetes", this.planeteService.getAll());
	}

	@PostMapping("/planete/planete-detail")
	public ModelAndView sauvegardePlanete(@Validated @ModelAttribute("planete") Planete planete,
			BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/planete/planete-error");
			mav.addObject("planete", planete);

			System.out.println("Erreur de planete, je ne sauvegarde pas.");
			mav.addObject("errorString", "Erreur dans la planete!!!");
			return mav;
		} else {
			this.planeteService.save(planete);
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/planete/tout-va-bien" + planete.getId());
		mav.addObject("planete", planete);
		return mav;
	}

}
