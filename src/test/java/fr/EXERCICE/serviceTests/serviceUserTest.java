package fr.EXERCICE.serviceTests;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import fr.EXERCICE.WebShop.configuration.*;
import fr.EXERCICE.WebShop.entity.User;
import fr.EXERCICE.WebShop.service.serviceUser;


@SpringJUnitConfig(SpringConfig.class)
public class serviceUserTest {

	@Autowired
	private serviceUser monServiceUser;
	
	@Test
	public void saveTest() {
		User user=new User();
		assertNotNull(monServiceUser.save(user)); 
	}
	
}
