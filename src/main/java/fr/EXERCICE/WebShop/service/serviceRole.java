package fr.EXERCICE.WebShop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.EXERCICE.WebShop.dao.RoleDao;
import fr.EXERCICE.WebShop.entity.Role;

@Service
public class serviceRole {
	
	@Autowired
	RoleDao monRoleDao;
	
	public Iterable<Role> getAll() {
		// TODO Auto-generated method stub
		return this.monRoleDao.findAll();
	}

}
