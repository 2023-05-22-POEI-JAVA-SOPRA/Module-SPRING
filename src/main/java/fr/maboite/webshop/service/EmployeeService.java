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
	public Employee getById(Long id)
	{
		return employeeRepository.findById(id).get();
	}
	
	public void delete(Long id)
	{
		 employeeRepository.deleteById(id);
	}
	public void deleteAll()
	{
		 employeeRepository.deleteAll();
	}
	public void printAll()
	{
		for(Employee employee : getAll())
		{
			System.out.println(employee);
		}
	}
	
	
}
