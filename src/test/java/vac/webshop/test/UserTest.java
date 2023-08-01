package vac.webshop.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import vac.webshop.configuration.WebShopConfig;
import vac.webshop.entity.User;
import vac.webshop.service.UserServices;

@SpringJUnitConfig(WebShopConfig.class)
public class UserTest {
	@Autowired
	private UserServices userServices;
	
	@Test
	public void testUser() {
//		Arrange
		
		
//		Act
		User user = userServices.getById(1);
		
//		Assert
		Assertions.assertNotNull(user);
//		Assertions.assertEquals(1, user.getId());
	}
}
