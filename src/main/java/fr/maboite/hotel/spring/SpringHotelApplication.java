package fr.maboite.hotel.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.hotel.service.HotelService;
import fr.maboite.hotel.service.PlageService;
import fr.maboite.hotel.service.ReservationService;

public class SpringHotelApplication {
	
	public static void main(String[] args) {
		
		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext("fr.maboite.hotel")) {
			System.out.println("Contexte Spring Hotel démarré");
			
			HotelService hBean = appContext.getBean(HotelService.class);
			hBean.getHotel(1);
			
			PlageService pBean = appContext.getBean(PlageService.class);
			pBean.getPlage(2);
			
			ReservationService rBean = appContext.getBean(ReservationService.class);
			rBean.getReservation(3);
			
			//???
//			hBean.saveHotelDao(new Hotel premiereClasse);
			
			
			
		}
		
	}

}
