package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.MyFirstService;
import fr.maboite.webshop.service.MySecondService;

public class SpringSimpleApplication {

	public static void main(String[] args) {

		// Démarre le contexte Spring
		/*  //ex1
		 * try (AnnotationConfigApplicationContext appContext
		 * //AnnotationConfigApplicationContext avec les arguments qu'on veut
		 * implémenter = new AnnotationConfigApplicationContext(MyFirstService.class,
		 * MySecondService.class)) { System.out.println("Contexte Spring démarré");
		 * 
		 * // Récupération du bean instancié par Spring (et potentiellement rattaché à
		 * // d'autres beans Spring) MyFirstService MyFirstBeanSpring =
		 * appContext.getBean(MyFirstService.class);
		 * 
		 * // Opérations sur les objets ... MyFirstBeanSpring.coucou();
		 * MyFirstBeanSpring.getMySecondService().coucou(); }
		 */
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringSimpleConfiguration.class)) {
			System.out.println("Contexte est démarré");
         
		MonPremierService Varibale1 =appContext.getBean(MonPremierService.class);
		
		System.out.println("le nom de Varibale1 est :"+Varibale1.getVariableconfigure());
		Varibale1.coucou();
		//	appContext.getBean(MonPremierService.class).coucou();
		//	appContext.getBean(MyFirstService.class).coucou();
		//	appContext.getBean(MySecondService.class).coucou();
			appContext.getBean(MonPremierDao.class).coucou();
			
			//prtotype
			MonPremierService Varibale2 =appContext.getBean(MonPremierService.class);
			System.out.println("le nom de Varibale2 est :"+Varibale2.getNom());
		}
		 

	}

}



//ex prof

/*
 * try (AnnotationConfigApplicationContext appContext = new
 * AnnotationConfigApplicationContext(SpringSimpleConfiguration.class)) {
 * System.out.println("Contexte Spring démarré");
 * 
 * // Récupération du bean instancié par Spring (et potentiellement rattaché à
 * // d'autres beans Spring) MonPremierService monPremierBeanSpring =
 * appContext.getBean(MonPremierService.class);
 * 
 * // Opérations sur les objets ... monPremierBeanSpring.coucou();
 * monPremierBeanSpring.getMonPremierDao().coucou(); }
 */

/*
 * //Démarre le contexte Spring try (AnnotationConfigApplicationContext
 * appContext = new AnnotationConfigApplicationContext(MonPremierService.class,
 * MonPremierDao.class)) { System.out.println("Contexte Spring démarré");
 * 
 * // Récupération du bean instancié par Spring (et potentiellement rattaché à
 * // d'autres beans Spring) MonPremierService monPremierBeanSpring =
 * appContext.getBean(MonPremierService.class);
 * 
 * // Opérations sur les objets ... monPremierBeanSpring.coucou();
 * monPremierBeanSpring.getMonPremierDao().coucou();
 */