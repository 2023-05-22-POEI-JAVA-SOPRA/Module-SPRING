package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.dao.spring.EcoleRepository;
import fr.maboite.webshop.dao.spring.EmployeeRepository;
import fr.maboite.webshop.model.Ecole;
import fr.maboite.webshop.model.Employee;

//@Component
public class EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	EcoleService ecoleService;
	
//	public Employee createEmp(Employee emp,Ecole ecole)
//	{
//		
//		if(ecole.getId() != null)
//		{
//			
//			return employeeRepository.save(new Employee(emp, ecole));
//		}
//		if(emp.getEcole() != null )
//		{
//			return employeeRepository.save(emp);
//		}
//		else  {
//			
//			Ecole savedEcole = ecoleService.save(ecole);
//			return employeeRepository.save(new Employee(emp, savedEcole));
//		}
		
		
//		else // get by id ? 
//			check si existe en base ? 
		//return null;
	//}
	
	public Employee save(Employee employee,Ecole ecole)
	{
		if(employee != null  && ecole != null)
		{
			
			if (ecole.getId() == null)
			{
				Ecole savedEcole = ecoleService.save(ecole);
				employee.setEcole(savedEcole);
				return save(employee);
			}
			else
			{
				employee.setEcole(ecole);
				return save(employee);
			}
		}
		return null;
	}
	
	
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

	/**
	 * Find all examples in DB
	 * 
	 * @return
	 */
	public Iterable<Employee> getAll() {
		return employeeRepository.findAll();
	}

	public Employee getById(Long id) {
		return employeeRepository.findById(id).get();
	}

	public void delete(Long id) {
		employeeRepository.deleteById(id);
	}

	public void deleteAll() {
		employeeRepository.deleteAll();
	}

	public void printAll() {
		for (Employee employee : getAll()) {
			System.out.println(employee);
		}
	}
	public void printAllEmp(List<Employee> employees) {
		for (Employee employee : employees) {
			System.out.println(employee);
		}
	}
	public List<Employee> getByNom(String nom) {
		return employeeRepository.findByNom(nom);
	}

	public List<Employee> getByNomIgnoreCase(String nom) {
		return employeeRepository.findByNomIgnoreCase(nom);
	}

	public List<Employee> getByNomAndDepartment(String nom, String department) {
		return employeeRepository.findByNomAndDepartment(nom, department);
	}

	public List<Employee> getByNomOrDepartment(String nom, String department) {
		return employeeRepository.findByNomOrDepartment(nom, department);
	}

	public List<Employee> findByNomLike(String nom) {
		return employeeRepository.findByNomLike(nom);
	}

	public List<Employee> findAllOrderBySalaryAsc(Double salary) {
		return employeeRepository.findBySalaryOrderByDesc(salary);
	}

	public List<Employee> findByNomOrDepartmentOrderByIdDesc(String nom, String department) {
		return employeeRepository.findByNomOrDepartmentOrderByIdDesc(nom, department);
	}

	public List<Employee> getAllOrderByDesc() {
		return employeeRepository.getAllOrderByDesc();
	}
	
	public List<Employee> findByEcole(Ecole ecole){
		return employeeRepository.findByEcole(ecole);
	}
	public List<Employee> findByEcoleAndDepartment(Ecole ecole,String department){
		return employeeRepository.findByEcole(ecole);
	}
}
