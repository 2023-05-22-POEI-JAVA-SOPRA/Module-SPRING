package fr.maboite.webshop.controller.correction;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CamionController {


	@GetMapping("/camion")
	// Equivaut à :
	// @RequestMapping(path = "/camion", method = RequestMethod.GET)
	public ModelAndView afficheCamionParRequestParam(@RequestParam("id") Integer id) {
		System.out.println("A partir du paramètre de requête, j'affiche la page pour le camion : " + id);

		Camion camion = new Camion();
		camion.setId(id);
		camion.setNom("Camion : " + id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("camion-detail");

		mav.addObject("camion", camion);
		mav.addObject("autreTruc", "Coucou!");

		return mav;
	}

	@PostMapping("/camion")
	public ModelAndView sauvegardeCamion(@ModelAttribute("camion") Camion camion,
			BindingResult bindingResult) {

		ModelAndView mav = new ModelAndView();
		mav.setViewName("camion-detail");
		mav.addObject("camion", camion);

		if (bindingResult.hasErrors()) {
			System.out.println("Erreur de camion, je ne sauvegarde pas.");
			mav.addObject("errorString", "Erreur dans le camion!!!");
		}

		return mav;
	}

}
