package fr.exercice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	public List<User> findByLoginAndPassword(String login, String password);
		
}
