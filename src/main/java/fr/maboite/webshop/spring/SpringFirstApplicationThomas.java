package fr.maboite.webshop.spring;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.PremierServiceThomas;
import fr.maboite.webshop.service.SecondServiceThomas;

public class SpringFirstApplicationThomas {

	

	public static void main(String[] args) {
		
		
		/*
		try (AnnotationConfigApplicationContext thomasContext = new AnnotationConfigApplicationContext(PremierServiceThomas.class)) {
			PremierServiceThomas serviceThomas = thomasContext.getBean(PremierServiceThomas.class);
			
			if(serviceThomas == null) {
				System.out.println("objet null : " + serviceThomas);
			} else {
				System.out.println("objet not null : " + serviceThomas);
				serviceThomas.testMethode();
			}		
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		*/
		
		
		
		try (AnnotationConfigApplicationContext thomasContext =
				new AnnotationConfigApplicationContext(PremierServiceThomas.class, SecondServiceThomas.class)) {
			PremierServiceThomas serviceThomas = thomasContext.getBean(PremierServiceThomas.class);
			
			if(serviceThomas == null) {
				System.out.println("objet null : " + serviceThomas);
			} else {
				System.out.println("objet not null : " + serviceThomas);
				serviceThomas.testMethode();
				//serviceThomas.getSecondServiceThomas().testMethode();
			}		
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
	
	
}
