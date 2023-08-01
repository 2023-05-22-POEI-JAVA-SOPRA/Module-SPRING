package fr.maboite.webshop.spring;

import java.time.LocalDate;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Plage;
import fr.maboite.webshop.model.Reservation;
import fr.maboite.webshop.service.HotelService;
import fr.maboite.webshop.service.ReservationService;
import fr.maboite.webshop.spring.simple.configuration.TPConfiguration;

public class TPApplication {
	
	public static void main(String[] args) {
		
//		Reservation reservation = new Reservation();
//		Hotel hotel = new Hotel();
//		Plage plage = new Plage();
		//Reservation reservation =
				//new Reservation(3l,"Dupont",LocalDate.now(),LocalDate.now().plusDays(10));
		
		HotelService hotelservice = new HotelService();
		
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(TPConfiguration.class)) {

			TPConfiguration tpBean = appContext.getBean(TPConfiguration.class);
			
			ReservationService reservationBean = appContext.getBean(ReservationService.class);
			HotelService hotelBean = appContext.getBean(HotelService.class);

//			System.out.println(tpBean.createReservationService().save(reservation).toString());
//			System.out.println(tpBean.createHotelService().save(hotel).toString());
//			System.out.println(tpBean.createPlageService().save(plage).toString());
//			System.out.println(tpBean.createReservationService().demandeDeReservation(demande).toString());
			
			//System.out.println(reservationBean.get(1l));
			//System.out.println(reservationBean.getAll());
			//reservationBean.save(reservation);
			//reservationBean.delete(2l);
			
//			System.out.println(reservationBean.findByNom("Dupont"));
//			System.out.println(reservationBean.queryFindByNom("Dupont"));
//			
//			System.out.println(reservationBean.findByNomIgnoreCase("dupont"));
//			
//			System.out.println(reservationBean.findByNomAndDebut("Dupont", LocalDate.now()));
//			System.out.println(reservationBean.queryFindByNomAndDebut("Dupont", LocalDate.now()));
//
//			System.out.println(reservationBean.findDistinctReservationByNomOrDebut("Dupond", LocalDate.now().plusDays(2)));
//			System.out.println(reservationBean.queryFindByNomOrDebut("Dupond", LocalDate.now().plusDays(2)));
//
//			System.out.println(reservationBean.findByNomIgnoreCaseContaining("Ond"));
//			
//			System.out.println(reservationBean.querySortByNomAsc());
			
			List<Reservation> reservations = reservationBean.findByHotelVille("Strasbourg");
			for(Reservation reservation:reservations) {
				System.out.println(reservation);
			}

		}
		
	}

}
