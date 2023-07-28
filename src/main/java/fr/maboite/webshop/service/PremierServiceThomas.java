package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class PremierServiceThomas {
	
//	@Autowired
//	SecondServiceThomas secondServiceThomas;
//	
//	public SecondServiceThomas getSecondServiceThomas() {
//		return secondServiceThomas;
//	}
	
	
	@Value(value = "${DaoThomas.valeur1}")
	private String daoThomas;
	
	public void testMethode() {
		System.out.println("test service 1");
	}
	
	public String coucou() {
		return "coucou ni kamnida";
	}
	
	
	
	
//	public PremierServiceThomas(){
//		super();
//		daoThomas = "blabla";
//	}
	
	
	

	public String getDaoThomas() {
		return daoThomas;
	}

	public void setDaoThomas(String daoThomas) {
		this.daoThomas = daoThomas;
	}
	
	

	
	
	
	

}
