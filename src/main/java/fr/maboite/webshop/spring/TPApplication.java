package fr.maboite.webshop.spring;

import java.time.LocalDate;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Plage;
import fr.maboite.webshop.model.Reservation;
import fr.maboite.webshop.spring.simple.configuration.TPConfiguration;

public class TPApplication {
	
	public static void main(String[] args) {
		
		Reservation reservation = new Reservation();
		Hotel hotel = new Hotel();
		Plage plage = new Plage();
		DemandeReservation demande =
				new DemandeReservation("Dupond",LocalDate.now(),LocalDate.now().plusDays(10),"la plage","superhotel");
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(TPConfiguration.class)) {

			TPConfiguration tpBean = appContext.getBean(TPConfiguration.class);

			System.out.println(tpBean.createReservationService().save(reservation).toString());
			System.out.println(tpBean.createHotelService().save(hotel).toString());
			System.out.println(tpBean.createPlageService().save(plage).toString());
			System.out.println(tpBean.createReservationService().demandeDeReservation(demande).toString());
			
		}
		
	}

}
