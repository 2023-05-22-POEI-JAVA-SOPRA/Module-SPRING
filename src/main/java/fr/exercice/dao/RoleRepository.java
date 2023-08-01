package fr.exercice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

	List<Role> findByNameContainingIgnoreCase(String partOfRoleName);

}
