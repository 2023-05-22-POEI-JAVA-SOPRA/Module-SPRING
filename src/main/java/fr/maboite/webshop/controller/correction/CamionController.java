package fr.maboite.webshop.controller.correction;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CamionController {


	@RequestMapping("/camion")
	public ModelAndView afficheCamionParRequestParam(@RequestParam("id") Integer id) {
		System.out.println("A partir du paramètre de requête, j'affiche la page pour le camion : " + id);

		Camion camion = new Camion();
		camion.setId(id);
		camion.setNom("Camion : " + id);

		ModelAndView mav = new ModelAndView();
		mav.setViewName("camion");

		mav.addObject("camion", camion);
		mav.addObject("autreTruc", "Coucou!");

		return mav;
	}

}
