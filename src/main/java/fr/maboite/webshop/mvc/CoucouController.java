package fr.maboite.webshop.mvc;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.maboite.webshop.model.Camion;

@Controller
public class CoucouController {

	@RequestMapping("/coucou")
	public String coucou() {
		return "coucou";
	}
	@ModelAttribute("discretion")
	public String enTouteDiscretion() {
		return "shhhhhh silence!";
	}
	
	@ModelAttribute("houdini")
	public Boolean isHoudini() {
		Boolean iAmHoudini = true;
		
			if(iAmHoudini)
				return true;
			else
				return false;

	}
	@ModelAttribute("parkingCamions")
	public List<Camion> parkingCamions(){
		List<Camion> parking = new ArrayList<Camion>();
		Camion camion1 = new Camion();
		camion1.setMarque("suzuki");
		parking.add(camion1);
		Camion camion2 = new Camion();
		camion2.setMarque("mercedes");
		parking.add(camion2);
		Camion camion3 = new Camion();
		camion3.setMarque("tesla");
		parking.add(camion3);
		return parking;
	}
}
