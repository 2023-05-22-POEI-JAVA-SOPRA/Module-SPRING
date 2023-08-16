package fr.EXERCICE.WebShop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.EXERCICE.WebShop.dao.RoleDao;
import fr.EXERCICE.WebShop.entity.Role;

@Service
public class serviceRole {
	
	@Autowired
	RoleDao monRoleDao;
	
	public Iterable<Role> getAll() {
		return this.monRoleDao.findAll();
	}
	
	public Optional<Role> getById(Integer id) {
		return this.monRoleDao.findById(id);
	}
	
	public Role save(Role role) {
		return this.monRoleDao.save(role);
	}
	
	public void deleteById(Integer id) {
		this.monRoleDao.deleteById(id);
	}
	
	public List<Role> getByNameIgnoreCaseContaining(String nom){
		return this.monRoleDao.findByNameIgnoreCaseContaining(nom);
	}

}