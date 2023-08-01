package fr.maboite.webshop.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;

@Entity @Table
public class Role {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)@Column(name = "id_role")
	private Long idRole;
	
	@NotNull
	private String name;

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role() {
		super();
	}
	
	public Role(String name) {
		super();
		this.name = name;
	}
	
	public Role(Long idRole, String name) {
		super();
		this.idRole = idRole;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", name=" + name + "]";
	}
	
	
	
}
