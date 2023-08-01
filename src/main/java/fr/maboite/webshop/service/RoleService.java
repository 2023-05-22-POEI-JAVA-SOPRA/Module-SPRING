package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.dao.RoleDao;
import fr.maboite.webshop.model.Role;

@Service
public class RoleService {
	
	@Autowired
	private RoleDao roleDao;
	
	public Role saveRole(Role role) {
		return this.roleDao.save(role);
	}
	
	public List<Role> getByNomIgnoreCase(String nom) {
		return this.roleDao.findByNomContainingIgnoreCase(nom);
	}
}
