package fr.maboite.tpplage;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTP {
	public static void main(String[] args) {
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(Config.class)) {
			
			HotelService hotelService = appContext.getBean(HotelService.class);
			System.out.println("hotel = " + hotelService.get(1));
			
			PlageService plageService = appContext.getBean(PlageService.class);
			System.out.println("plage = " + plageService.get(1));
			
			ReservationService reservationService = appContext.getBean(ReservationService.class);
			System.out.println("reservation = " + reservationService.get(1));
		}
	}
}
