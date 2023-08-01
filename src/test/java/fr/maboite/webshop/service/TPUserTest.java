package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.User;
import fr.maboite.webshop.spring.simple.configuration.TPUserConfiguration;

@SpringJUnitConfig(TPUserConfiguration.class)
public class TPUserTest {
	
	@Autowired
	UserService userService = new UserService();	
	
	@Test
	public void testUserServiceSave() {
		User user = new User(1l,"lo@lo.com","1234",001);
		User result = userService.save(user);
		assertNotNull(result);
		assertEquals(user.toString(), result.toString());
	}
	
	@Test
	public void testUserServiceGetById() {
		Optional<User> user = Optional.of(new User(1l,"lo@lo.com","1234",001));
		Optional<User> result = userService.getById(1l);
		assertNotNull(result);
		assertEquals(user.toString(), result.toString());
	}
	
	@Test
	public void testUserServiceFindByLoginAndPassword() {
		Optional<User> user = Optional.of(new User(1l,"lo@lo.com","1234",001));
		Optional<User> result = userService.findByLoginAndPassword("lo@lo.com", "1234");
		assertNotNull(result);
		assertEquals(user.toString(), result.toString());
	}
	
}
