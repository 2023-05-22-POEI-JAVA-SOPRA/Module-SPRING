package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.User;
import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP_SpringData;

@SpringJUnitConfig(ConfigurationTP_SpringData.class)
public class UserServiceTest {

	@Autowired
	UserService userService;
	
	

	@Test
	public void testCorrespondingDaoExists() {
		Assertions.assertNotNull(userService.userDAO);
	}
	

	@Test
	public void testGet() {
		//Arrange
		User user = new User();
		user.setLogin("loginTest");
		user.setPassword("passwordTest");
		user.setConnectionNumber(1);
		User userTemp = userService.save(user);
		
		//Action
		User userTest = userService.getById(userTemp.getId());
		
		Assertions.assertEquals("loginTest", userTest.getLogin());
		Assertions.assertEquals("passwordTest", userTest.getPassword());
		Assertions.assertEquals(1, userTest.getConnectionNumber());

		//Clean database
		userService.delete(userTest.getId());
	}
	@Test
	public void testSave() {
		//Arrange
		User user = new User();
		user.setLogin("loginTest");
		user.setPassword("passwordTest");
		user.setConnectionNumber(1);

		//Action
		User userTest = userService.save(user);

		Assertions.assertEquals("loginTest", userTest.getLogin());
		Assertions.assertEquals("passwordTest", userTest.getPassword());
		Assertions.assertEquals(1, userTest.getConnectionNumber());

		//Clean database
		userService.delete(userTest.getId());
	}
	@Test
	public void testSaveUpdate() {
		//Arrange
		User user = new User();
		user.setLogin("loginTest");
		user.setPassword("passwordTest");
		user.setConnectionNumber(1);
		User userTemp = userService.save(user);
		userTemp.setLogin("nouveau login");

		//Action
		User userTest = userService.save(userTemp);

		Assertions.assertEquals("nouveau login", userTest.getLogin());
		Assertions.assertEquals("passwordTest", userTest.getPassword());
		Assertions.assertEquals(1, userTest.getConnectionNumber());

		//Clean database
		userService.delete(userTest.getId());
	}
	@Test
	public void testDelete() {
		//Arrange
		User user = new User();
		user.setLogin("UNIQUE_LOGIN_TEST_DELETE");
		user.setPassword("UNIQUE_PASSWORD_TEST_DELETE");
		user.setConnectionNumber(12300123);
		User userTemp = userService.save(user);

		//Action
		userService.delete(userTemp.getId());

		User userTest = userService.getById(userTemp.getId());
		Assertions.assertNull(userTest);
	}
	
	
	
	
	
	
	
	
	
	
}
