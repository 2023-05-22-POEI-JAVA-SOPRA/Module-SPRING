package fr.exercice.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import fr.exercice.entity.Bidon;

@Controller
public class MonPremierControllerMvc {
	
	public MonPremierControllerMvc() {
		System.out.println("Je suis le controller mvc");
	}
	
	@ModelAttribute("caMarche")
	public String CaMarche() {
		return "Si tu lis ça c'est que ça marche";
	}
	
	@ModelAttribute("leBidon")
	public Bidon LeBidon() {
		Bidon bidon = new Bidon();
		bidon.setNom("Jean");
		return bidon;
	}
	
	@ModelAttribute("lesBidons")
	public Iterable<Bidon> listOfBidons(){
		 List<Bidon> bidons = new ArrayList<Bidon>();
		 Bidon bidon1 = new Bidon("Jeannot", true);
		 Bidon bidon2 = new Bidon("Jeannine", false);
		 Bidon bidon3 = new Bidon("Jeannette", true);
		 bidons.add(bidon1);
		 bidons.add(bidon2);
		 bidons.add(bidon3);
		 return bidons;
	}
	
	@GetMapping(path = "/coucou") //élément à rajouter dans l'url
	public String coucou() {
		return "coucou";   //nom du fichier html à afficher
	}
}
