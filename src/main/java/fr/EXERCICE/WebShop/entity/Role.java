package fr.EXERCICE.WebShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "T_Roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrole;

	@Column(name = "rolename")
	@NotNull(message="Nom du role obligatoire")
	@Size(min=1,max=20, message="Le nom du role doit faire entre 1 et 20 caracteres")
	private String name;

	public Integer getIdRole() {
		return idrole;
	}

	public void setIdRole(Integer idRole) {
		this.idrole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idrole + ", name=" + name + "]";
	}
	
	
}
