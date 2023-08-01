package fr.maboite.webshop.correction.spring.application;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.hotel.entity.Hotel;
import fr.maboite.webshop.correction.dao.HotelDao;
import fr.maboite.webshop.correction.service.HotelService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class HotelApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {

			HotelService hServiceBean = appContext.getBean(HotelService.class);

//			Hotel newHotel = new Hotel();
//			newHotel.setNom("Première Classe");
//			newHotel.setVille("Poitiers");
//			hServiceBean.save(newHotel);
//
//			Hotel hotelId = hServiceBean.getById(3);
//			System.out.println("Hotel d'id 3 est : " + hotelId.getNom() + " situé à " + hotelId.getVille());
//
//			hServiceBean.delete(6);
//
//			Iterable<Hotel> everyHotel = hServiceBean.getAll();
//			System.out.println("Dans la base, il y a les hôtels suivants");
//			for (Hotel hotel : everyHotel) {
//				System.out.println(hotel.getId() + " " + hotel.getNom());
//			}

			List<Hotel> hotelsByName = hServiceBean.searchByNom("Hotel ABC");
	        System.out.println("Hôtels avec le nom \"Hotel ABC\":");
	        System.out.println(hotelsByName);

	        
	        List<Hotel> hotelsByAttributes = hServiceBean.searchByNomAndVilleOr("Hotel XYZ", "City XYZ");
	        System.out.println("Hôtels avec le nom \"Hotel XYZ\" ET la ville \"City XYZ\", ou soit le nom \"Hotel XYZ\" soit la ville \"City XYZ\":");
	        System.out.println(hotelsByAttributes);

	        
	        List<Hotel> hotelsSortedByNameAsc = hServiceBean.getAllHotelsSortedByNomAsc();
	        System.out.println("Hôtels triés par nom (ascendant):");
	        System.out.println(hotelsSortedByNameAsc);

	        
	        List<Hotel> hotelsSortedByNameDesc = hServiceBean.getAllHotelsSortedByNomDesc();
	        System.out.println("Hôtels triés par nom (descendant):");
	        System.out.println(hotelsSortedByNameDesc);
	        
			
		}
	}
}
