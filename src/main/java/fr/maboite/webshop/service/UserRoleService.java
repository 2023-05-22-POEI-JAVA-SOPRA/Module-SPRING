package fr.maboite.webshop.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service //@Component@
public class UserRoleService {
	
	public void hello() {
		System.out.println("Hello User Dao");
	}
	public UserRoleService() {
		System.out.println("UserRoleService started");
	}
}
