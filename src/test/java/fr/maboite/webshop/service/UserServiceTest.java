package fr.maboite.webshop.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.util.NoSuchElementException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.model.User;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class UserServiceTest {
	@Autowired
	UserService service;
	
	@Test
	void get_by_existing_id() {
		User resultTested = service.getById(2);
		User result = new User(2, "paul@paul.com", "motdepasse", 655615546);
		assertEquals(result, resultTested);
	}
	
	@Test
	void get_by_non_existing_id() {
		assertThrows(NoSuchElementException.class,
				() -> service.getById(1000));
	}
	

}
