package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//@Component
public class PremierService {
	
	@Autowired
	private SecondService secondService;
	
	Integer id;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	

	public PremierService() {
		super();
		System.out.println("Premier Constructeur");
	}
	
	public PremierService(Integer id) {
		this.id = id;
	}

	public void call() {
		System.out.println("Premier service "+this.getId());
	}	
	
	public Integer multiply(Integer n1, Integer n2) {
		return n1*n2;
	}
		
	public SecondService getSecondService() {
		return secondService;
	}
	
}
