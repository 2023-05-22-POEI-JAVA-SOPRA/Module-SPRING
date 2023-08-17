package fr.maboite.webshop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MonDeuxiemeController {
	
	@RequestMapping("/coucou") //(path = "/coucou")
	 public String MethodedeMonDeuxiemeController() {
	 System.out.println("La 2 Methode est appelée !");
	 return "coucou";
	 

}

}
