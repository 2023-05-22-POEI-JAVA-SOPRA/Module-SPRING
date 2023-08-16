package fr.maboite.webshop.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CamionController {
	
	@RequestMapping("/camion")
	public ModelAndView showCamion(@RequestParam("id") Integer id )  //?id= 1
	{
		System.out.println("RequestParam :Camion avec id: " + id);
		
		Camion camion = new Camion();
		camion.setId(id);
		camion.setName("Camion " + id);
		return new  ModelAndView("camion","camion",camion);
		
	}

	@RequestMapping("/camion/{id}")
	public ModelAndView showCamionPathVariable(@PathVariable("id") Integer id )
	{
		System.out.println("Path variable : Camion avec id: " + id);
		Camion camion = new Camion();
		camion.setId(id);
		camion.setName("Camion " + id);
		return new  ModelAndView("camion","camion",camion);
	}
 
//	@RequestMapping("/camion/{id}")
//	public String showCamionPathVariable(@PathVariable("id") Integer id )
//	{
//		System.out.println("Path variable : Camion avec id: " + id);
//		return "camion";
//	}
}
