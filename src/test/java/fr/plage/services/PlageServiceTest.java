package fr.plage.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import fr.plage.configuration.MaConfigurationPlage;
import fr.plage.entity.Plage;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitConfig(MaConfigurationPlage.class)
public class PlageServiceTest {

	@Autowired
	private PlageService plageSer;
	
	@Test
	public void test_create_non_nul() {
		Plage plage =new Plage();
		assertNotNull(plageSer.create(plage));
	}
	
	@Test
	public void test_get_by_id() {
		Integer id = 5;
		assertEquals(plageSer.getById(id),"Plage numéro : 5 a été trouvée.");
	}
	@Test
	public void test_del_by_id() {
		Integer id = 5;
		assertEquals(plageSer.delById(id),"Plage numéro : 5 a été supprimée.");
	}
	
}
