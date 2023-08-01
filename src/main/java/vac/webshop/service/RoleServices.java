package vac.webshop.service;

import java.util.List;

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
	
	public List<Role> getByNomContaining(String nom) {
		return this.roleRepo.findByNameIgnoreCaseContaining(nom);
	}
}
