package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class MyService {
	
	public void hello() {
		System.out.println("Hello MyService");
	}
	public MyService() {
		System.out.println("MyService started");
	}

}
