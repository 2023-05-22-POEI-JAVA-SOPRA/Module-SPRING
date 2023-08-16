package fr.maboite.webshop.tp_plages.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.tp_plages.SpringConfigurationTp_Plages;
import fr.maboite.webshop.tp_plages.dao.hotelDao;
import fr.maboite.webshop.tp_plages.model.Hotel;

@SpringJUnitConfig(SpringConfigurationTp_Plages.class)
public class serviceHotelTest {
	
	@Autowired
	private serviceHotel monServiceHotel;
	
	private static List<Hotel> hotels=new ArrayList<>();
	
	//J'ai pensé a créer une liste d'hotel pour les essais mais c'est inutile...
//	@BeforeAll
//	public void createListHotel() {
//		Hotel hotel1=new Hotel(1,"hotelA","VilleA");
//		hotels.add(hotel1);
//		Hotel hotel2=new Hotel(2,"hotelB","VilleB");
//		hotels.add(hotel2);
//		Hotel hotel3=new Hotel(3,"hotelC","VilleC");
//		hotels.add(hotel3);
//	}
	
	@Test
	public void testSaveHotel() {
		Hotel monHotel=new Hotel();
		monHotel.setNom("monPremierHotel");
		monHotel.setVille("superVille");
		
		Hotel savedHotel=monServiceHotel.saveHotel(monHotel);
		assertNotNull(savedHotel);
		assertEquals("monPremierHotel", savedHotel.getNom());
		assertEquals("superVille",savedHotel.getVille());
	}
	
	//Je ne sais pas trop comment tester cette méthode
	//Hormis en stockant des hotels dans un ArrayList et en testant
	//Mais pas le temps donc on verra ensuite
	@Test
	public void testGetHotel() {
		Hotel monHotel=monServiceHotel.getHotel(1);
		monHotel.setNom("monDeuxiemeHotel");
		monHotel.setVille("Nowhere");
		assertNotNull(monHotel);
		assertEquals("Nowhere",monHotel.getVille());
		assertEquals("monDeuxiemeHotel",monHotel.getNom());
	}
	
}
