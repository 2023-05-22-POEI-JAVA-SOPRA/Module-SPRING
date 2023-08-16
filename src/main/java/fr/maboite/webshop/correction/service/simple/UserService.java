package fr.maboite.webshop.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.UserRepository;
import fr.maboite.webshop.model.User;

@Component
public class UserService {

	@Autowired
	private UserRepository userRepository;
	
	public Iterable<User> getAll()
	{
		return userRepository.findAll();
	}
	
	public User  getById(Integer id)
	{
		return userRepository.findById(id).orElse(null);
	}
	
	public User save(User user)
	{
		return userRepository.save(user);
	}
	public List<User>  getByLoginAndPassword(String login, String password)
	{
		return userRepository.findByLoginAndPassword(login,password);
	}
	
}
