package fr.plage.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import fr.plage.configuration.MaConfigurationPlage;
import fr.plage.entity.Hotel;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(MaConfigurationPlage.class)
public class HotelServiceTest {

	@Autowired
	private HotelService hotSer;
	
	@Test
	public void test_create_non_nul() {
		Hotel hotel =new Hotel();
		assertNotNull(hotSer.create(hotel));
	}
	
	@Test
	public void test_get_by_id() {
		Integer id = 5;
		assertEquals(hotSer.getById(id),"Hotel numéro : 5 a été trouvé.");
	}
	@Test
	public void test_del_by_id() {
		Integer id = 5;
		assertEquals(hotSer.delById(id),"Hotel numéro : 5 a été supprimé.");
	}
	
}
