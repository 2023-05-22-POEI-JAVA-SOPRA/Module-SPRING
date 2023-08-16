package fr.maboite.webshop.mvc.controller;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstMVCController {

	
	@ModelAttribute("msgDynamique")
	public String msgDynamique()
	{
		return "Coucou Maxence ! " + LocalDate.now();
	}
	
	@ModelAttribute("pojoDynamique")
	public Camion pojoDynamique()
	{
		Camion camion = new Camion();
		camion.setId(1);
		camion.setName("Scania");
		return camion;
		
	}
	
	@ModelAttribute("listCamion")
	public List<Camion> listCamionInContext()
	{
		List<Camion> list = new ArrayList<Camion>();
		Camion camion = new Camion();
		camion.setId(1);
		camion.setName("Scania");
		Camion camion2 = new Camion();
		camion2.setId(2);
		camion2.setName("Volvo");
		Camion camion3 = new Camion();
		camion3.setId(3);
		camion3.setDaily(true);
		camion3.setName("Mercedes");
		Camion camion4 = new Camion();
		camion4.setId(4);
		camion4.setDaily(true);
		camion4.setName("Man");
		Camion camion5 = new Camion();
		camion5.setId(5);
		camion5.setDaily(false);
		camion5.setName("Iveco");
		list.add(camion);
		list.add(camion2);
		list.add(camion3);
		list.add(camion4);
		list.add(camion5);
		
		return list;
		
	}
	
	
	
	//@RequestMapping( path= "/coucou")
	@GetMapping(path = "/coucou")
	public String myFirstMVCControllerMethod()
	{
		System.out.println("method called on /coucou");
		return "coucou";
	}
	
}
