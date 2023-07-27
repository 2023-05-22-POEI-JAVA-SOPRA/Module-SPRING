package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonDeuxiemeDao;
import fr.maboite.webshop.service.MonDeuxiemeService;
import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;

public class SpringAppliDeux {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(MonPremierService.class, MonPremierDao.class, MonDeuxiemeService.class, MonDeuxiemeDao.class)) {
			System.out.println("Contexte de l'appli' deux démarré");
			
			MonPremierService beanSpring = appContext.getBean(MonPremierService.class);
			
			beanSpring.getDeuxiemeServiceInFirst().test();
			
			
		}
	}
}
