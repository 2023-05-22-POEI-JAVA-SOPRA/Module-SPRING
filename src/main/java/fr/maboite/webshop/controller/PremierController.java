package fr.maboite.webshop.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.maboite.webshop.model.Livre;

@Controller
public class PremierController {
	
	@ModelAttribute("monMessage") // permet de lier avec la template "${caroule}"
    public String metDansLeContextemonMessage() {
        return "cette page est dynamique !";
    }
	
	@ModelAttribute("livre") 
    public Livre metDansLeContexteLivre() {
		Livre monLivre = new Livre();
		monLivre.setName("La Faille");
        return monLivre;
    }
	
	@ModelAttribute("boolean") 
    public Boolean metDansLeContexteBoolean() {
        return true;
    }
	
	@ModelAttribute("livreThilliez") 
    public Iterable<Livre> LesLivresThilliez() {
		List<Livre> livres = new ArrayList<>();
		Livre livre1 = new Livre();
		livre1.setName("La Faille");
		livre1.setIsSharko(true);
		livres.add(livre1);
		
		Livre livre2 = new Livre();
		livre2.setName("Labyrinthe");
		livre2.setIsSharko(true);
		livres.add(livre2);
		
		Livre livre3 = new Livre();
		livre3.setName("Fractures");
		livre3.setIsSharko(false);
		livres.add(livre3);
		
		Livre livre4 = new Livre();
		livre4.setName("Rêver");
		livre4.setIsSharko(false);
		livres.add(livre4);
		
		Livre livre5 = new Livre();
		livre5.setName("Pandemia");
		livre5.setIsSharko(true);
		livres.add(livre5);
		
		
        return livres;
    }
	
	
	@RequestMapping(path = "/coucou")
	public String maPremiereMethodeDeController() {
		System.out.println("Méthode sur /coucou appelée");
		return "coucou";
	}
}
