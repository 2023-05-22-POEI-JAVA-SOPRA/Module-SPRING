package fr.EXERCICE.WebShop.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.EXERCICE.WebShop.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role,Integer>{

	List<Role> findByNameIgnoreCaseContaining(String nom);

}