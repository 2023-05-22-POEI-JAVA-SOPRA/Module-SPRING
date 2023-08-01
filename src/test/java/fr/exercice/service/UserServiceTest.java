package fr.exercice.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.exercice.entity.User;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class UserServiceTest {
	
	@Autowired
	private UserService us;
	
	@Test
	public void test_save_non_nul() {
		User user =new User();
		assertNotNull(us.save(user));
	}

}
