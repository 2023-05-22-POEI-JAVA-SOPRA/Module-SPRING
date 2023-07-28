package fr.maboite.webshop.spring;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.plage.service.HotelServices;
import fr.maboite.plage.service.PlageServices;
import fr.maboite.plage.service.ReservationServices;
import fr.maboite.webshop.model.HotelPojo;
import fr.maboite.webshop.model.PlagePojo;
import fr.maboite.webshop.model.ReservationPojo;
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
			
// Pour réservation
			ReservationServices myResa = appContext.getBean(ReservationServices.class);
			
			// Création de l'objet sans Spring pour les entités
            ReservationPojo resa = new ReservationPojo();
            resa.setId(1);
            resa.setBegin(LocalDate.of(2023, 8, 2));
            resa.setEnd(LocalDate.of(2023, 8, 15));
            
			myResa.save(resa);
		
// Pour Plage
			PlageServices myPlage = appContext.getBean(PlageServices.class);
			
			// Création de l'objet sans Spring pour les entités
            PlagePojo plage = new PlagePojo();
            plage.setId(1);
            plage.setName("Navy Pier");
            
            
            myPlage.save(plage);
            myPlage.get(1);
		}
	}
}
