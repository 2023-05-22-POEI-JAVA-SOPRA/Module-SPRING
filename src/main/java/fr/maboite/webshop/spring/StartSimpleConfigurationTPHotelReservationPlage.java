package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Plage;
import fr.maboite.webshop.model.Reservation;
import fr.maboite.webshop.service.HotelService;
import fr.maboite.webshop.service.PlageService;
import fr.maboite.webshop.service.ReservationService;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

public class StartSimpleConfigurationTPHotelReservationPlage {
	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext()) {
			System.out.println("Spring context started");
			{

				appContext.register(SpringSimpleConfiguration.class);
				appContext.refresh();
				
				HotelService hotelService = appContext.getBean(HotelService.class);
				Hotel hotel = new Hotel();
				Hotel hotelSaved = hotelService.save(hotel);
				System.out.println(hotelSaved);
				System.out.println(hotelService.get(100));
				
				ReservationService reservationService = appContext.getBean(ReservationService.class);
				Reservation reservation = new Reservation();
				Reservation reservationSaved = reservationService.save(reservation);
				System.out.println(reservationSaved);
				System.out.println(reservationService.get(1));
				
				
				PlageService plageService= appContext.getBean(PlageService.class);
				Plage plage = new Plage();
				Plage plageSaved = plageService.save(plage);
				System.out.println(plageSaved);
				System.out.println(plageService.get(21));
				
				
						
				
			}

		}

	}
}
