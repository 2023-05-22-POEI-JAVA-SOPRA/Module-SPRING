package vac.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vac.webshop.dao.UserDaoRepo;
import vac.webshop.entity.User;

@Service
public class UserServices {
	
	@Autowired
	private UserDaoRepo userRepo;
	
	
	public Iterable<User> getAll(){
		return this.userRepo.findAll();
	}
	
	public List<User> getLoginPasswordNoCase(String login, String password) {
		return this.userRepo.findByLoginAndPasswordAllIgnoreCase(login, password);
	}
	
	public User getById(Integer id) {
		return this.userRepo.findById(id).get();
	}
}

//	
//	public User save(User user) {
//		return this.userRepo.save(user);
//	}
//	public void deleteById(Integer id) {
//		this.userRepo.deleteById(id);
//	}