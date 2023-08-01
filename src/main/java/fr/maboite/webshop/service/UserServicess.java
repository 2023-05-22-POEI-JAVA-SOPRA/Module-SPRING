package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;



@Scope("prototype" )
//@Scope("singleton" )
//@Component //@Service 
public class UserServicess {

	@Autowired
	private UserRoleService userRoleService;
	
	@Value(value = "${userserv.minage}")
	private Integer minAge;
	
	public void hello() {
		System.out.println("Hello User service ! :) ");
	}
	
	public UserServicess() {
		System.out.println("User service started");
	}
	
	public UserRoleService getUserRoleService() {
		return userRoleService;
	}

	public Integer getMinAge() {
		return minAge;
	}

	public void setMinAge(Integer minAge) {
		this.minAge = minAge;
	}

	public void setUserRoleService(UserRoleService userRoleService) {
		this.userRoleService = userRoleService;
	}
}
