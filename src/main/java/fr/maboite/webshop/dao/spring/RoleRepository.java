package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Role;


@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	public List<Role> findByroleNameContainingIgnoreCase(String roleName);
}
