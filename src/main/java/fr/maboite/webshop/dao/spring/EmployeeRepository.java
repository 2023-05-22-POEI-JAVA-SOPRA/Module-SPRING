package fr.maboite.webshop.dao.spring;

import org.springframework.data.repository.CrudRepository;

import fr.maboite.webshop.model.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
