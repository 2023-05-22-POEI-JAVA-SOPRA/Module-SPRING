package fr.maboite.planets.controller;

import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import fr.maboite.planets.model.Planet;
import fr.maboite.planets.service.PlanetService;


@Controller
public class PlanetController {

    @Autowired
    private PlanetService planetService;

    @RequestMapping("/indexPlanete")
    public ModelAndView indexPlanetes() {
        Collection<Planet> allPlanetes = planetService.getAllPlanetes();
        ModelAndView modelAndView = new ModelAndView("indexPlanete");
        modelAndView.addObject("allPlanetes", allPlanetes);
        return modelAndView;
    }

    @GetMapping("/planete/{id}")
    public ModelAndView planete(@PathVariable("id") Integer id) {
        Planet planete = planetService.getPlaneteById(id);
        ModelAndView modelAndView = new ModelAndView("detailsPlanete");
        modelAndView.addObject("planete", planete);
        return modelAndView;
    }
    
    @RequestMapping("/planetesForm")
    public ModelAndView afficheFormulairePlanete() {
		Planet planete = new Planet("Nom", 0);
        ModelAndView mav = new ModelAndView();
        mav.setViewName("planetesForm");
        mav.addObject("newPlanete", planete);    
        return mav;
    }
    
    @PostMapping("/planetesForm")
    public ModelAndView sauvegardePlanete(@ModelAttribute("newPlanete") Planet planete, BindingResult bindingResult) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("planetesForm");
        mav.addObject("newPlanete", planete);
        
        if (bindingResult.hasErrors()) {
            System.out.println("Erreur de planète, pas de sauvegarde.");
            mav.addObject("errorString", "Erreur dans la planète !");
        }
        System.out.println(planete.toString());
        return mav;
    }
    
    
}
