package fr.maboite.webshop.controller.correction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.maboite.webshop.model.Planete;

@Controller
public class PlaneteController {

	@Autowired
	private PlaneteService planeteService;

	@RequestMapping("/planete/planete-detail")
	public ModelAndView affichePlaneteParRequestParam(@RequestParam("id") Integer id) {

		Planete planete = this.planeteService.getById(id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("/planete/planete-detail");

		mav.addObject("planete", planete);

		return mav;
	}

	@RequestMapping("/planete/planete-detail/{id}")
	public ModelAndView affichePlaneteParPathVariable(@PathVariable("id") Integer id) {
		return affichePlaneteParRequestParam(id);
	}

	@RequestMapping(path = "/planete/planetes-list")
	public ModelAndView planetes() {
		return new ModelAndView("/planete/planetes-list", "planetes", this.planeteService.getAll());
	}

}
