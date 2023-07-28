package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.Plage;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

@SpringJUnitConfig(SpringSimpleConfiguration.class)
public class PlageServiceTest {

	
	@Autowired
	private PlageService plageService;
	
	@Test
	public void test_plageService_exists()
	{
		Assertions.assertNotNull(plageService);
	}
	
	
	@Test
	public void test_save_plage()
	{
		Plage plage = new Plage();
		Assertions.assertTrue(plage.getId() == null);
		Plage plageSaved = plageService.save(plage);
		Assertions.assertTrue(plageSaved.getId() > 0);
	}
	
	@ParameterizedTest()
	@CsvSource(value = { "1","2","3","4","100" }, delimiter = ',')
	public void test_get_plage(Integer id)
	{
		System.out.println(id);
		Plage plageSaved = plageService.get(id);
		Assertions.assertTrue(plageSaved.getId() > 0);
		
	}
}
