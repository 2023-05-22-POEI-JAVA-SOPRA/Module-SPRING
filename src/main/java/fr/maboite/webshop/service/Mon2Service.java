package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Mon2Service {

	@Autowired
	private MonService monService;

	public Mon2Service() {
		System.out.println("Je suis dans mon deuxieme service à moi");
	}

	public void testMethod() {
		System.out.println("on test mon service 2");
	}

	public MonService getMonService() {
		return monService;
	}

}
