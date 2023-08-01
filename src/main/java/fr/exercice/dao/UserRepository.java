package fr.exercice.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.exercice.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{

}
