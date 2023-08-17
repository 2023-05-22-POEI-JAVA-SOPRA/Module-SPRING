package fr.planets.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import fr.planets.model.Planet;
import fr.planets.service.servicePlanet;

@Controller
public class ControllerBABIBU {
	//Mise dans le contexte SPRING du service permettant d'accéder a la liste des planetes
	@Autowired
	private servicePlanet servPl;
	public ControllerBABIBU(){
		System.out.println("C'est moi le controller");
	}

	
	
	
// Autre méthode possible avec RequestParam "id" donc --> th:href="@{/detailsPlanetes(id=${planete.id})}"
	
//	@RequestMapping(path="/detailsPlanetes")
//	public ModelAndView afficheDetailPlaneteParChemin(@RequestParam("id") Integer id) {
//		Planet planet=this.servPl.getById(id);
//		System.out.println("Planete " + id + " selectionee");
//		ModelAndView mav = new ModelAndView();
//		
//		mav.setViewName("detailsPlanetes");
//		mav.addObject("planete", planet);
//		return mav;
//		}
	
	@RequestMapping("/detailsPlanetes/{id}")
	public ModelAndView affichePlaneteParPathVariable(@PathVariable("id") Integer id) {
		Planet planet=this.servPl.getById(id);
		System.out.println("Planete " + id + " selectionee");
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("detailsPlanetes");
		mav.addObject("planete", planet);
		return mav;
	}
	
	
	
	// GESTION DE LA PAGE planetes.html
	@RequestMapping(path="/planetes")
	public String allPlanetes() {
		System.out.println("Méthode sur /planetes appelée");
		//return du planetes pour planetes.html (cf. config pour prefix/suffix)
		return "planetes";
	}
	
	//Methode appelee lors du chargement de la page planetes.html
	@ModelAttribute("maListePlanete")
	public Collection<Planet> maListePlanete() {
		return servPl.getAll();
	}
	
	
}
