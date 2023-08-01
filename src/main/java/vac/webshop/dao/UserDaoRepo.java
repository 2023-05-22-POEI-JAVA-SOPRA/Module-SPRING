package vac.webshop.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import vac.webshop.entity.User;

@Repository
public interface UserDaoRepo extends CrudRepository<User, Integer>{

}
