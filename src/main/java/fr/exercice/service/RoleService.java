package fr.exercice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.exercice.dao.RoleRepository;
import fr.exercice.entity.Role;

@Service
public class RoleService {

	@Autowired
	private RoleRepository rr;
	
	public Role getById(Integer id) {
		return this.rr.findById(id).get();
	}
	
	public Role save(Role role) {
		return this.rr.save(role);
	}
	
	public Iterable<Role> getAll(){
		return this.rr.findAll();
	}
	
	public void deleteById(Integer id) {
		this.rr.deleteById(id);
	}
	
	public List<Role> getByNameIgnoreCaseContaining(String nom){
		return this.rr.findByNameIgnoreCaseContaining(nom);
	}
}

