package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component //@Service //@Component
public class UserService {

	@Autowired
	private UserRoleService userRoleService;
	
	public void hello() {
		System.out.println("Hello User service ! :) ");
	}
	
	public UserService() {
		System.out.println("User service started");
	}
	
	public UserRoleService getUserRoleService() {
		return userRoleService;
	}
}
