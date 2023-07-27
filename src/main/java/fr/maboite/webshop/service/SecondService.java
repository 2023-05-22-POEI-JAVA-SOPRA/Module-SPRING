package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class SecondService {
	
	Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public SecondService() {
		System.out.println("Second Constructeur");
	}
	
	public SecondService(Integer id) {
		this.id = id;
	}

	public void call() {
		System.out.println("Second service "+this.getId());
	}
	
}
