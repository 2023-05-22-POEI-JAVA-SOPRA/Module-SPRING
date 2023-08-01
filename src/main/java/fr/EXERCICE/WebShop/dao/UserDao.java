package fr.EXERCICE.WebShop.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.EXERCICE.WebShop.entity.User;

@Repository
public interface UserDao extends CrudRepository<User,Integer>{
	List<User> findAll();
}
