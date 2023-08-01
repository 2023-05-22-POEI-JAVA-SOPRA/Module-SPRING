package fr.maboite.webshop.jdbcdao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Long>{
	
	Optional<User> findByLoginAndPassword(String login, String password);
	

}
