package fr.EXERCICE.WebShop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.EXERCICE.WebShop.dao.UserDao;
import fr.EXERCICE.WebShop.entity.User;

@Service
public class serviceUser {
	
	@Autowired
	private UserDao monUserDao;
	
	public List<User> getAll(){
		return (List<User>) this.monUserDao.findAll();
	}
}
