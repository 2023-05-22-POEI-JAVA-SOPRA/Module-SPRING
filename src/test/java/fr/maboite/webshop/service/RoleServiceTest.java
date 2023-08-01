package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;
import fr.maboite.webshop.model.Role;


@SpringJUnitConfig(SpringConfiguration.class)
public class RoleServiceTest {
	
	 @Autowired
	    private RoleService roleService;
	 
	 @Test
	    public void testSaveRole() {
	        Role role = new Role();
	        role.setNom("admin");
	        Role savedRole = roleService.saveRole(role);

	        Assertions.assertEquals("admin", savedRole.getNom());

	        
	    }

}
