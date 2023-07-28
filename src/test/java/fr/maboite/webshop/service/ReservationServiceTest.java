package fr.maboite.webshop.service;
import java.time.LocalDate;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Reservation;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

@SpringJUnitConfig(SpringSimpleConfiguration.class)
public class ReservationServiceTest {

	@Autowired
	private ReservationService reservationService;
	
	@Test
	public void test_reservationService_exists()
	{
		Assertions.assertNotNull(reservationService);
	}
	
	
	@Test
	public void test_save_reservation()
	{
		Reservation reservation = new Reservation();
		Assertions.assertTrue(reservation.getId() == null);
		Reservation reservationSaved = reservationService.save(reservation);
		Assertions.assertTrue(reservationSaved.getId() > 0);
	}
	
	@ParameterizedTest()
	@CsvSource(value = { "1","2","3","4","100" }, delimiter = ',')
	public void test_get_reservation(Integer id)
	{
		Reservation reservationSaved = reservationService.get(id);
		Assertions.assertNotNull(reservationSaved);

		
	}
	
	@ParameterizedTest()
	@CsvSource(value = { "Resa 1,2023-12-12,2024-12-12,Georges V,Parisplage" }, delimiter = ',')
	public void test_demande_reservation(String nom, String debut, String fin, String hotel,String plage)
	{
		DemandeReservation demandeReservation = new DemandeReservation(nom,LocalDate.parse(debut),LocalDate.parse(fin),hotel,plage);
		
		Reservation resa = reservationService.createReservation(demandeReservation);
		Assertions.assertNotNull(resa);
	}
	@ParameterizedTest()
	@CsvSource(value = { "Resa 1,2023-12-12,2024-12-12,Georges V,Paris","Resa 2,2023-11-17,2029-10-12,superGeorges V,Parisplage" }, delimiter = ',')
	public void test_demande_reservation_should_return_null(String nom, String debut, String fin, String hotel,String plage)
	{
		DemandeReservation demandeReservation = new DemandeReservation(nom,LocalDate.parse(debut),LocalDate.parse(fin),hotel,plage);
		
		Reservation resa = reservationService.createReservation(demandeReservation);
		Assertions.assertNull(resa);
	}
	
	
	
	
}
