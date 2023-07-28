package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MonPremierService {
	
	//public static Object coucou;
	@Value(value ="${ma.propriete}")
	private String variableconfigure = "valeur par defaut";
	private String nom = "usa";

	public String getVariableconfigure() {
		return variableconfigure;
	}

	public void setVariableconfigure(String variableconfigure) {
		this.variableconfigure = variableconfigure;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	@Autowired
	private MonPremierDao monPremierDao;

	public void coucou() {
		System.out.println("Je suis le service+1");
	}

	public MonPremierService() {
		System.out.println("hey world !!!");
	}

	public MonPremierDao getMonPremierDao() {
		return monPremierDao;
	}

	public int mean(int i, int j) {
		// TODO Auto-generated method stub
		return (i+j)/2;
	}

}
