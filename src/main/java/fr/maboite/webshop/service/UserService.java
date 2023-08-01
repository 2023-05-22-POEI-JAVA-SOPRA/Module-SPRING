package fr.maboite.webshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.UserDao;
import fr.maboite.webshop.model.User;

@Component
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public Iterable<User> getAll(){
		return this.userDao.findAll();
	}
	
	public Optional<User> getById(Long id) {
		return this.userDao.findById(id);
	}
	
	public User save(User user) {
		return this.userDao.save(user);
	}
	
	public void delete(Long id) {
		this.userDao.deleteById(id);
	}
	
	public Optional<User> findByLoginAndPassword(String login, String password){
		return this.userDao.findByLoginAndPassword(login, password);
	}
	

}
