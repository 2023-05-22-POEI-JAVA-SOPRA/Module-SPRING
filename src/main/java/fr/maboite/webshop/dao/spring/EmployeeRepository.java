package fr.maboite.webshop.dao.spring;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Employee;


@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {

}
