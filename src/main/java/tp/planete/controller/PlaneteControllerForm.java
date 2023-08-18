package tp.planete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import tp.planete.entity.Planete;
import tp.planete.service.PlaneteService;

@Controller
public class PlaneteControllerForm {
	@Autowired
	private PlaneteService planeteService;
	
	@GetMapping("/planete")
	public ModelAndView afficheFormPlanete(@RequestParam("id") Integer id) {
		System.out.println("avec requestParam j'affiche la planète");
		
		Planete unePlanete = this.planeteService.getById(id);
	
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("detailsPlanete");
		mav.addObject("details", unePlanete);
		
		return mav;
	}
	
	@PostMapping("/planete")
	public ModelAndView saveFormPlanete(@Validated @ModelAttribute("details") Planete planete, BindingResult bResult) {
//		ATTENTION dans @ModelAttribut on doit retrouver notre objet (ici details)
		
//		ModelAndView mav = new ModelAndView();
//		mav.setViewName("detailsPlanete");
//		mav.addObject("details", planete);
//		
//		if (bResult.hasErrors()) {
//			System.out.println("Erreur de saisie, je ne sauvegarde pas.");
//			mav.addObject("errorString", "Erreur dans la saisie!!!");
//			return mav;
//		}
		if (bResult.hasErrors()) {
			ModelAndView mav = new ModelAndView();
			mav.setViewName("/detailsPlanete");
			mav.addObject("details", planete);
			System.out.println("je ne sauvegarde pas.");
			mav.addObject("errorString", "Erreur dans la planete!!!");
			return mav;
		} else {
			this.planeteService.save(planete);
		}

		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:/planete?id=" + planete.getId());
		mav.addObject("details", planete);
		return mav;

	}
}
