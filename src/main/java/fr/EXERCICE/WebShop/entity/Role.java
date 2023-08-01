package fr.EXERCICE.WebShop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "T_Roles")
public class Role {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idrole;

	@Column(name = "rolename")
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
