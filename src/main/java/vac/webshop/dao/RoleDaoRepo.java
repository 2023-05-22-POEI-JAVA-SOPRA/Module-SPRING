package vac.webshop.dao;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vac.webshop.entity.Role;

@Repository
public interface RoleDaoRepo extends CrudRepository<Role, Integer> {

	List<Role> findByNameIgnoreCaseContaining(String nom);

}
