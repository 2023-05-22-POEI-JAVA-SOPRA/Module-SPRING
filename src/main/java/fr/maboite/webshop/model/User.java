package fr.maboite.webshop.model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity @Table(name = "users")
public class User {
	@Id @Column(name = "id_user") 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUser;
	private String login;
	private String password;
	@Column(name = "connection_number")
	private Integer connectionNumber;

	public User() {
		super();
	}


	public User(String login, String password, Integer connectionNumber) {
		super();
		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
	}

	
	

	public User(Integer idUser, String login, String password, Integer connectionNumber) {
		super();
		this.idUser = idUser;
		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
	}


	public Integer getIdUser() {
		return idUser;
	}


	public String getLogin() {
		return login;
	}


	public String getPassword() {
		return password;
	}


	public Integer getConnectionNumber() {
		return connectionNumber;
	}


	public void setIdUser(Integer idUser) {
		this.idUser = idUser;
	}


	public void setLogin(String login) {
		this.login = login;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void setConnectionNumber(Integer connectionNumber) {
		this.connectionNumber = connectionNumber;
	}


	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password=" + password + ", connectionNumber="
				+ connectionNumber + "]\n";
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(connectionNumber, other.connectionNumber) && Objects.equals(idUser, other.idUser)
				&& Objects.equals(login, other.login) && Objects.equals(password, other.password);
	}
}
