package fr.EXERCICE.WebShop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "T_Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iduser;

	private String login;

	private String password;

	private Integer connectionnumber;

	public Integer getIdUser() {
		return iduser;
	}

	public void setIdUser(Integer idUser) {
		this.iduser = idUser;
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
		return connectionnumber;
	}

	public void setConnectionNumber(Integer connectionNumber) {
		this.connectionnumber = connectionNumber;
	}

	@Override
	public String toString() {
		return "User [idUser=" + iduser + ", login=" + login + ", password=" + password + ", connectionNumber="
				+ connectionnumber + "]";
	}
	
	
}
