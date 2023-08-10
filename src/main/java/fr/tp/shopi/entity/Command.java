package fr.tp.shopi.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "T_commands")
public class Command {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_command")
	private Integer idCommand;
	
	@Column(name = "command_date")
	private LocalDateTime commandDate;
	@ManyToOne
	@JoinColumn(name = "id_user")
	private User user;
	public Integer getIdCommand() {
		return idCommand;
	}
	public void setIdCommand(Integer idCommand) {
		this.idCommand = idCommand;
	}
	public LocalDateTime getCommandDate() {
		return commandDate;
	}
	public void setCommandDate(LocalDateTime commandDate) {
		this.commandDate = commandDate;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	

}
