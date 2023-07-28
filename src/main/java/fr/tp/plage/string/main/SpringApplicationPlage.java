package fr.tp.plage.string.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.tp.plage.entity.Plage;
import fr.tp.plage.service.PlageService;
import fr.tp.plage.spring.configuration.SpringConfiguration;

public class SpringApplicationPlage {
	
public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringConfiguration.class)) {
			
			PlageService beanPlage = appContext.getBean(PlageService.class);
			
			Plage plages = new Plage(1,"Cricket Waves");
			
			beanPlage.save(plages);
			beanPlage.get(1);
			
			/*Pareil pour reservation et hotel*/
			
		}	
		
	}

}
