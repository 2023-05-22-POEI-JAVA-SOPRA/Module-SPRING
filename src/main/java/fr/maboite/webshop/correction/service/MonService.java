package fr.maboite.webshop.correction.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MonService {
	
	@Value("${ma.propriete.1}")
	private String monMessage;
	
	public MonService() {
		System.out.println("Je suis dans mon service à moi");
	}
	
	public void testMethod() {
		System.out.println("on test mon service");
	}
	
	public int calculusOptimus() {
		return 1+1;
	}

	public String getMonMessage() {
		return monMessage;
	}

	public void setMonMessage(String monMessage) {
		this.monMessage = monMessage;
	}
	
	

}
