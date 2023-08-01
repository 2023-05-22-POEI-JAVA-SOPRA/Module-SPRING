package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.jdbcdao.RoleDAO;
import fr.maboite.webshop.model.Role;

@Service
public class RoleService {

	@Autowired
	RoleDAO roleDAO;
	
	
	
	

	
	public Role save(Role role) {
		return roleDAO.save(role);
	}
	
	public Role getById(Long id) {
		return roleDAO.findById(id).orElse(null);
	}
	
	public Iterable<Role> getAll() {
		return roleDAO.findAll();
	}
	
	public void delete(Long id) {
		roleDAO.deleteById(id);
	}
	
	
	
	
	public List<Role> getByNameLike(String partialName){
		return roleDAO.getByNameLike(partialName);
	}
	
	
	
	


}
