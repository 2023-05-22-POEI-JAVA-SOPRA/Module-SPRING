package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.MonSecondService;

public class SpringSimpleApplication {

	public static void main(String[] args) {

		// Démarre le contexte Spring
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				MonPremierService.class, MonPremierDao.class, MonSecondService.class)) {
			System.out.println("Contexte Spring démarré");

			// Récupération du bean instancié par Spring (et potentiellement rattaché à
			// d'autres beans Spring)
			MonPremierService monPremierBeanSpring = appContext.getBean(MonPremierService.class);

			// Opérations sur les objets ...
			monPremierBeanSpring.coucou();
			monPremierBeanSpring.getMonPremierDao().coucou();
			monPremierBeanSpring.getMonSecondService().coucouDeux();

		}

	}

}