package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfiguration;

@SpringJUnitConfig(SpringSimpleConfiguration.class)
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void test_userService_exists()
	{
		Assertions.assertNotNull(userService);
		userService.hello();
	}
	
	@Test
	public void test_userService_check_min_age_by_default()
	{
		Assertions.assertTrue(userService.getMinAge() == 25);
	}
	
	@ParameterizedTest()
	@CsvSource(value = { "1", "100", "800" }, delimiter = ',')
	public void test_userService_check_min_age_after_set(Integer age)
	{
		System.out.println("age : " + age);
		userService.setMinAge(age);
		Assertions.assertTrue(userService.getMinAge() == age,"L'age minimum de l'instance est différent de " + age);
	}

}
