package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.FirstServiceAc;
import fr.maboite.webshop.service.SecondServiceAc;
import fr.maboite.webshop.spring.simple.configuration.SpringAcConfigSimple;

public class SpringSecondAppConfigAc {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringAcConfigSimple.class)) {
			System.out.println("grâce à ça le Contexte Spring est lancé ");
			
//			pas à faire cette classe nous sert à mettre en place le contexte. 
//			Ensuite on travaille avec les classes Services dans ce cas-ci
			SpringAcConfigSimple beanSpring = appContext.getBean(SpringAcConfigSimple.class);
			
			beanSpring.test();
			
			System.out.println("============");
			FirstServiceAc myFirstBeanSpring = appContext.getBean(FirstServiceAc.class);
			SecondServiceAc mySecondBeanSpring = appContext.getBean(SecondServiceAc.class);
			
			myFirstBeanSpring.coucou();
			myFirstBeanSpring.getMonSecondService().coucou();
			
			mySecondBeanSpring.hello();
				
		}
	}
}
