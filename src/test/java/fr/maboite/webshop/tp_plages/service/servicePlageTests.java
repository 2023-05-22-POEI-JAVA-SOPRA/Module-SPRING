package fr.maboite.webshop.tp_plages.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.tp_plages.SpringConfigurationTp_Plages;
import fr.maboite.webshop.tp_plages.model.Plage;

@SpringJUnitConfig(SpringConfigurationTp_Plages.class)
public class servicePlageTests {

	@Autowired
	private servicePlage monServPlage;
	
	@Test
	public void testSavePlage() {
		Plage maPlage=new Plage();
		maPlage.setNom("plage moche");
		assertEquals("plage moche", maPlage.getNom());
	}
	
	@Test
	public void testGetPlage() {
		Plage maPlage=new Plage();
		maPlage.setNom("plage encore plus moche");
		maPlage.setId(666);
		assertEquals(666, maPlage.getId());
		assertNotNull(maPlage.getNom());
	}
}
