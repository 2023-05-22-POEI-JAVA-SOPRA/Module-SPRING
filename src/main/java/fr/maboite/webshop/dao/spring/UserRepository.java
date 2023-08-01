package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	
	public List<User> findByLoginAndPassword(String login, String password);
	
}
