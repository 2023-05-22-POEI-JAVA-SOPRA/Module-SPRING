package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

@SpringJUnitConfig(SpringSimpleConfiguration.class)
public class HotelServiceTest {
	
	@Autowired
	private HotelService hotelService;
	
	@Test
	public void test_hotelService_exists()
	{
		Assertions.assertNotNull(hotelService);
	}
	
	
	@Test
	public void test_save_hotel()
	{
		Hotel hotel = new Hotel();
		Assertions.assertTrue(hotel.getId() == null);
		Hotel hotelSaved = hotelService.save(hotel);
		Assertions.assertTrue(hotelSaved.getId() > 0);
	}
	
	@ParameterizedTest()
	@CsvSource(value = { "1","2","3","4","100" }, delimiter = ',')
	public void test_get_hotel(Integer id)
	{
		System.out.println(id);
		Hotel hopelSaved = hotelService.get(id);
		Assertions.assertNotNull(hopelSaved);
		//Assertions.assertTrue(plageSaved.getId() > 0);
		
	}
}
