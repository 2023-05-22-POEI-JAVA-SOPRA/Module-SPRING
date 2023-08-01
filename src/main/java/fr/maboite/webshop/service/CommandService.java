package fr.maboite.webshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.jdbcdao.CommandDao;
import fr.maboite.webshop.model.Command;

@Component
public class CommandService {

	@Autowired
	private CommandDao commandDao;
	
	public Iterable<Command> getAll(){
		return this.commandDao.findAll();
	}
	
	public Optional<Command> getById(Long id) {
		return this.commandDao.findById(id);
	}
	
	public Command save(Command command) {
		return this.commandDao.save(command);
	}
	
	public void delete(Long id) {
		this.commandDao.deleteById(id);
	}
	
	public List<Command> findByUserLogin(String login){
		return this.commandDao.findByUserLogin(login);
	}
	
}
