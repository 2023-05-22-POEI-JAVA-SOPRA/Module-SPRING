package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.plage.service.HotelServices;
import fr.maboite.webshop.model.HotelPojo;
import fr.maboite.webshop.spring.simple.configuration.PlageSpringConfig;

public class PlageContextSpringMain {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(PlageSpringConfig.class)) {
			System.out.println("Yes j'ai mon contexte Spring");
			
			HotelServices myHotel = appContext.getBean(HotelServices.class);
			
			// Création de l'objet Hotel sans Spring pour les entités
            HotelPojo hotel = new HotelPojo();
            hotel.setName("Mon hôtel");
            hotel.setCity("Chicago");
            hotel.setId(1);
            
            
			myHotel.save(hotel);
		}
	}
}
