package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Ecole;
import fr.maboite.webshop.model.Employee;

//@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findByNom(String nom);

	List<Employee> findByNomIgnoreCase(String nom);

	List<Employee> findByNomAndDepartment(String nom, String department);

	List<Employee> findByNomOrDepartment(String nom, String department);
	
	List<Employee> findByNomLike(String nom);
	
	@Query("from Employee where salary = :salary order by salary desc")
	List<Employee> findBySalaryOrderByDesc(@Param("salary") Double salary);
	
	@Query("from Employee where nom = :nom or department = :department order by id desc")
	List<Employee> findByNomOrDepartmentOrderByIdDesc(@Param("nom") String nom ,@Param("department") String department);

	@Query("from Employee order by id desc")
	List<Employee> getAllOrderByDesc();
	
	
	List<Employee> findByEcole(Ecole ecole);
	
	public List<Employee> findByEcoleAndDepartment(Ecole ecole,String department);
} 
