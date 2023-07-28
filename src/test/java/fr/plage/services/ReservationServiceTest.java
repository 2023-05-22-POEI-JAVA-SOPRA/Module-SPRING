package fr.plage.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import fr.plage.configuration.MaConfigurationPlage;
import fr.plage.entity.Reservation;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(MaConfigurationPlage.class)
public class ReservationServiceTest {

	@Autowired
	private ReservationService resSer;
	
	@Test
	public void test_create_non_nul() {
		Reservation res =new Reservation();
		assertNotNull(resSer.create(res));
	}
	
	@Test
	public void test_get_by_id() {
		Integer id = 5;
		assertEquals(resSer.getById(id),"Res numéro : 5 a été trouvée.");
	}
	@Test
	public void test_del_by_id() {
		Integer id = 5;
		assertEquals(resSer.delById(id),"Res numéro : 5 a été supprimée.");
	}
	
}
