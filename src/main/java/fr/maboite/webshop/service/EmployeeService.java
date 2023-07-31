package fr.maboite.webshop.service;

import java.util.List;

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
	public List<Employee> getByNom(String nom)
	{
		return employeeRepository.findByNom(nom);
	}
	
	public List<Employee> getByNomIgnoreCase(String nom)
	{
		return employeeRepository.findByNomIgnoreCase(nom);
	}
	public List<Employee> getByNomAndDepartment(String nom,String department)
	{
		return employeeRepository.findByNomAndDepartment(nom,department);
	}
	
	public List<Employee> getByNomOrDepartment(String nom,String department)
	{
		return employeeRepository.findByNomOrDepartment(nom,department);
	}
	
	public List<Employee> findByNomLike(String nom)
	{
		return employeeRepository.findByNomLike(nom);
	}
	
}
