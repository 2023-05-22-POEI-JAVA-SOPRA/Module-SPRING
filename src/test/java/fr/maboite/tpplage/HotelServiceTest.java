package fr.maboite.tpplage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


@SpringJUnitConfig(Config.class)
public class HotelServiceTest {
	@Autowired
	HotelService service;
	
	@Test
	void get_not_null_id_1() {
		assertNotNull(service.get(1));
	}
	
	@Test
	void get_equals_id_1() {
		assertEquals(service.get(1), new Hotel(1, "getHotel", "paris"));
	}
	
	@Test 
	void save_not_null() {
		assertNotNull(service.save());
	}
	
	@Test
	void save_equals() {
		assertEquals(service.save(), new Hotel(100, "saveHotel", "marseille"));
	}
}
