package fr.maboite.webshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity @Table(name = "users")
public class User {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_user")
	private Long idUser;
	
	@NotNull
	private String login;
	
	@NotNull
	private String password;
	
	@Column(name = "connection_number")
	private Integer connectionNumber;

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getConnectionNumber() {
		return connectionNumber;
	}

	public void setConnectionNumber(Integer connectionNumber) {
		this.connectionNumber = connectionNumber;
	}

	public User(String login,String password,Integer connectionNumber) {
		super();
		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
	}
	
	public User(Long idUser,String login,String password,Integer connectionNumber) {
		super();
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
	}

	public User() {
		super();
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password=" + password + ", connectionNumber="
				+ connectionNumber + "]";
	}
	
	
	
}
