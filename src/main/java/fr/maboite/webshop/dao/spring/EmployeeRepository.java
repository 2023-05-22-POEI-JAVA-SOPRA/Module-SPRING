package fr.maboite.webshop.dao.spring;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	List<Employee> findByNom(String nom);

	List<Employee> findByNomIgnoreCase(String nom);

	List<Employee> findByNomAndDepartment(String nom, String department);

	List<Employee> findByNomOrDepartment(String nom, String department);
	
	List<Employee> findByNomLike(String nom);
}
