package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MonDeuxiemeService {
	
	@Autowired
	private MonDeuxiemeDao deuxiemeDao;
	
	public void test() {
		System.out.println("On teste le service n° 2 ici");
	}
	
	public MonDeuxiemeService() {
		System.out.println("On invoque le deuxième service");
	}
	
	public MonDeuxiemeDao getMonDeuxiemeDao() {
		return deuxiemeDao;
	}

}
