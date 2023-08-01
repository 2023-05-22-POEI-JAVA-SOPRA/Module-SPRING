package fr.EXERCICE.WebShop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "T_Users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer iduser;
	
	@Email(message="Le login doit être un email valide")
	@Size(min=1,max=25, message="Le login doit être de 20 caracteres max")//20 c'est trop petit quand on fait un test en tapant n'imp sur le clavier
	@NotNull(message="Vous etes oblige de rentrer un login valide")
	private String login;
	
	@Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=!]).*$",
            message = "Le mot de passe doit contenir au moins une majuscule, "
            		+ "une minuscule et un caractère spécial.")
	@Size(min=1,max=20, message="Le mot de passe doit faire entre 1 et 20 caracteres")
	@NotNull(message="Il faut entrer un mot de passe")
	private String password;
	
	
	@NotNull
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
