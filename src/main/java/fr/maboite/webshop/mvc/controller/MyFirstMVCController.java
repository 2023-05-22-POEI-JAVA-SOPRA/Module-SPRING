package fr.maboite.webshop.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyFirstMVCController {

	@RequestMapping( path= "/coucou")
	public String myFirstMVCControllerMethod()
	{
		System.out.println("method called on /coucou");
		return "coucou";
	}
	
}
