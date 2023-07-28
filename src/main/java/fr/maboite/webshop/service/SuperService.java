package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//@Scope("prototype")
public class SuperService {
	@Autowired
	SuperDao superdao;
	@Value("${ma.propriete.1}")
	String name;

	
	public void ok() {
		System.out.println("in SuperService");
	}


	public SuperDao getSuperdao() {
		return superdao;
	}


	public String getName() {
		return name;
	}
}
