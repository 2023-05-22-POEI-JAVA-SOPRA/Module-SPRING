package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.FirstServiceAc;
import fr.maboite.webshop.service.SecondServiceAc;


public class SpringSecondApplicationAc {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(FirstServiceAc.class, SecondServiceAc.class)) {
			System.out.println("grâce à ça le Contexte Spring est lancé ");
			
			FirstServiceAc myFirstBeanSpring = appContext.getBean(FirstServiceAc.class);
			SecondServiceAc mySecondBeanSpring = appContext.getBean(SecondServiceAc.class);
			
			myFirstBeanSpring.coucou();
			myFirstBeanSpring.getMonSecondService().coucou();
			
			mySecondBeanSpring.hello();
			
			
		}
	}
}
