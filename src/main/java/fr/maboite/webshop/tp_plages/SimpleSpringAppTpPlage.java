package fr.maboite.webshop.tp_plages;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SimpleSpringAppTpPlage {

	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(SpringConfigurationTp_Plages.class)) {
			
			System.out.println("TP_Plages --> Contexte Spring demarre\n");
			
			SpringConfigurationTp_Plages monBean=appContext.getBean(SpringConfigurationTp_Plages.class);
			
			
		}


			
	}
}
