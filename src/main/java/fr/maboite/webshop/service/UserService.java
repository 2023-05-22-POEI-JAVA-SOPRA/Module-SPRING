package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.dao.UserDao;
import fr.maboite.webshop.model.User;

@Service
public class UserService {
	@Autowired
	UserDao userDao;
	
	public User getById(Integer id) {
		return userDao.findById(id).get();
	}
	
	public User save(User user) {
		return userDao.save(user);
	}
	
	public void deleteById(Integer id) {
		userDao.deleteById(id);
	}
	
	public Iterable<User> getAll() {
		return userDao.findAll();
	}
}
