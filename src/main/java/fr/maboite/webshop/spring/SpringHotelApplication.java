package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.service.HotelDao;
import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.ServiceHotel;
import fr.maboite.webshop.service.ServicePlage;
import fr.maboite.webshop.service.ServiceReservation;

public class SpringHotelApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringSimpleConfigurationHotel.class)) {
			System.out.println("Reservation est démarrée");

			ServiceHotel Hotel = appContext.getBean(ServiceHotel.class);
			ServicePlage Plage = appContext.getBean(ServicePlage.class);
			ServiceReservation Reservation = appContext.getBean(ServiceReservation.class);

			System.out.println("le nom de hotel est :" + Hotel.getNom());
			Hotel.get();

			appContext.getBean(HotelDao.class).save();;
			appContext.getBean(HotelDao.class).get();;

			// prtotype
			ServicePlage Plage1 = appContext.getBean(ServicePlage.class);
			System.out.println("le nom de Plage1 est :" + Plage1.getId());
			//
			ServiceReservation Reservation1 = appContext.getBean(ServiceReservation.class);
			System.out.println("le nom de Reservation est :" +Reservation1.getId());
		}

	}

}
