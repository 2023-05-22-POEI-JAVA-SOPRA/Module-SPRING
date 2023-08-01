package fr.maboite.webshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;


@Entity
@Table(name = "T_Users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="iduser")
	private Integer idUser;


	@Column(length = 20)
	@Email
	@NotNull
	private String login;
	@Column(length = 20)
	@Email
	@NotNull
	private String password;
	@NotNull @PositiveOrZero
	@Column(name="connectionnumber")
	private Integer connectionNumber;

//	@ManyToMany
//	@JoinTable(name = "T_Users_Roles_Associations", joinColumns = @JoinColumn(name = "idUser"), inverseJoinColumns = @JoinColumn(name = "idRole"))
//	private List<Role> roles = new ArrayList<>();

//	public List<Role> getRoles() {
//		return roles;
//	}

	public User(String login,  String password,
			Integer connectionNumber) {
		super();

		this.login = login;
		this.password = password;
		this.connectionNumber = connectionNumber;
	}

//	public void setRoles(List<Role> roles) {
//		this.roles = roles;
//	}

	public User() {
	}

	public Integer getIdUser() {
		return idUser;
	}

	public void setIdUser(Integer idUser) {
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

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", login=" + login + ", password=" + password + ", connectionNumber="
				+ connectionNumber + "]";
	}
	
}
