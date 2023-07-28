package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FirstServiceAc {
	
	@Value("${prop.nom}")
	private String myValue = "test value";
	
	private String name = "défaut";
	
	public int sum(int a, int b) {
		return a + b;
	}
	@Autowired
	private SecondServiceAc monSecondService;
	
	public void coucou() {
		System.out.println("Je suis le service");
	}
	
//	constructeur
	public FirstServiceAc() {
		System.out.println("Avec ça j'existe");
	}

	public SecondServiceAc getMonSecondService() {
		return monSecondService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMyValue() {
		return myValue;
	}

	public void setMyValue(String myValue) {
		this.myValue = myValue;
	}
	
	
	
}
