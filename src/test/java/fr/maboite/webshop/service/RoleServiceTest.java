package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.webshop.spring.simple.configuration.ConfigurationTP_SpringData;

@SpringJUnitConfig(ConfigurationTP_SpringData.class)
public class RoleServiceTest {

	@Autowired
	RoleService roleService;
}
