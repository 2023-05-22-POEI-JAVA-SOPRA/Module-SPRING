package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.RoleRepository;
import fr.maboite.webshop.model.Role;

@Component
public class RoleService {

	@Autowired
	private RoleRepository roleRepository;

	public RoleService() {
		System.out.println("Role Service started");
	}

	public Iterable<Role> getAll() {
		return roleRepository.findAll();
	}

	public Role getById(Integer id) {
		return roleRepository.findById(id).orElse(null);
	}

	public Role save(Role role) {
		return roleRepository.save(role);
	}
	public List<Role> getRolesLike(String rolename)
	{
		return roleRepository.findByroleNameContainingIgnoreCase(rolename);
	}
}
