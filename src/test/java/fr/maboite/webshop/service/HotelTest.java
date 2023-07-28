package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.SpringSimpleConfigurationHotel;


@SpringJUnitConfig(SpringSimpleConfigurationHotel.class)

public class HotelTest {

	
	@Autowired
	private ServiceDemandeReservation serviceDemandeReservation;
	@Autowired
	private ServiceHotel serviceHotel;
	@Autowired
	private ServicePlage servicePlage;
	@Autowired
	private ServiceReservation ServiceReservation;
	
	
	@Test
	public void test() {
		System.out.println("hello the best hotel");
	}
	
	@Test
	public void test2() {
		assertNotNull(serviceHotel);
		serviceHotel.get();	
	}
	
	@Test
	public void test3() {
		assertNotNull(serviceDemandeReservation);
		serviceDemandeReservation.checkdispo();	
			
	}
	
	@Test
	public void test4() {
			String resultat = serviceDemandeReservation.egal("happy");
			Assertions.assertEquals("happy", resultat);
			System.out.println("sorry, Hotel plein");
		}
			
	}


