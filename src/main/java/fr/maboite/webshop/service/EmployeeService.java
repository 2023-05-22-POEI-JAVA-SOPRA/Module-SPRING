package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.EmployeeRepository;
import fr.maboite.webshop.model.Employee;


@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	public Employee save(Employee employee)
	{
		return employeeRepository.save(employee);
	}
	/**
	 * Find all examples in DB
	 * @return
	 */
	public Iterable<Employee> getAll()
	{
		return employeeRepository.findAll();
	}
	public Employee get(Long id)
	{
		return employeeRepository.findById(id).get();
	}
}
