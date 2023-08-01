package vac.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vac.webshop.dao.RoleDaoRepo;
import vac.webshop.entity.Role;

@Service
public class RoleServices {
	
	@Autowired
	private RoleDaoRepo roleRepo;
	
	public Iterable<Role> getAll(){
		return this.roleRepo.findAll();
	}
}
