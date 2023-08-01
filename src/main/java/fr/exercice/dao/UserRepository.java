package fr.exercice.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	List<User> findByLoginAndPassword(@Param("login") String login, @Param("password") String password);

}
