package fr.maboite.webshop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Employee")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;
	private String department;
	private Double salary;

	@ManyToOne
	@JoinColumn(name = "id_ecole")
	private Ecole ecole;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public Ecole getEcole() {
		return ecole;
	}

	public void setEcole(Ecole ecole) {
		this.ecole = ecole;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public Employee(Long id, String nom, String department, Double salary) {
		super();
		this.id = id;
		this.nom = nom;
		this.department = department;
		this.salary = salary;
	}

	public Employee(String nom, String department, Double salary) {
		super();
		this.nom = nom;
		this.department = department;
		this.salary = salary;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", nom=" + nom + ", department=" + department + ", salary=" + salary + ", ecole="
				+ ecole + "]";
	}

	public Employee(String nom, String department, Double salary, Ecole ecole) {
		super();
		this.nom = nom;
		this.department = department;
		this.salary = salary;
		this.ecole = ecole;
	}
	
	public Employee( Employee employee, Ecole ecole)
	{
		employee.setEcole(ecole);
	}

}
