package fr.maboite.webshop.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import jakarta.validation.constraints.NotNull;


@Entity
@Table(name = "T_Roles")
public class Role {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idrole")
	private Integer id;
	@NotNull
	@Column(length = 20,name = "rolename")
	private String roleName;
	
//	@ManyToMany  
//	@Transient
//    @JoinTable( name = "T_Users_Roles_Associations",
//                joinColumns = @JoinColumn( name = "idRole" ),
//                inverseJoinColumns = @JoinColumn( name = "idUser" ) )
//	private List<User> users = new ArrayList<>();
//	
//	
//	public List<User> getUsers() {
//		return users;
//	}
//
//	public void setUsers(List<User> users) {
//		this.users = users;
//	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}


	public Role(){
	}

	@Override
	public String toString() {
		 return "[" + this.roleName + "]";
	}

	public Role( String roleName, List<User> users) {
		super();
		this.roleName = roleName;
	}
	public Role( String roleName) {
		this.roleName = roleName;
	}

	
	
	
	
}
