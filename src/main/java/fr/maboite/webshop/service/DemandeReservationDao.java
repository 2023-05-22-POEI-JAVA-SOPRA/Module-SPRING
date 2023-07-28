package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;

@Component
public class DemandeReservationDao {

	

	private Object a;

	public void checkdispo(Object hotel) {

		if (a == null) {
			System.out.println("Hotel plein");
		} else {
			System.out.println("vous pouvez réserver");
		}
	}

}
