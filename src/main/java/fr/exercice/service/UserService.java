package fr.exercice.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import fr.exercice.dao.UserRepository;
import fr.exercice.entity.User;

@Service
public class UserService {

	@Autowired
	private UserRepository ur;
	
	public User getById(Integer id) {
		return this.ur.findById(id).get();
	}
	
	public User save(User user) {
		return this.ur.save(user);
	}
	
	public Iterable<User> getAll(){
		return this.ur.findAll();
	}
	
	public void deleteById(Integer id) {
		this.ur.deleteById(id);
	}
	
	public List<User> searchByLoginAndPassword(String login, String password) {
		return ur.findByLoginAndPassword(login, password);
	}
	
}