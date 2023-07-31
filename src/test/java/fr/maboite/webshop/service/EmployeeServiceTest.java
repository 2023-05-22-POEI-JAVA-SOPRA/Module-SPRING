package fr.maboite.webshop.service;

import java.util.Arrays;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;


import fr.maboite.webshop.model.Employee;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

@SpringJUnitConfig(SpringConfiguration.class)
public class EmployeeServiceTest {

	@Autowired
	private  EmployeeService employeeService;
	
//	@BeforeAll
//	public static void beforeAll()
//	{
//		createEmployee();
//	}
//	
//	
//	public static void createEmployee()
//	{	
//		EmployeeService	employeeService = new EmployeeService();
//		List<Employee> employees = Arrays.asList(new Employee("EmpCreated1","Finance",42000.0),new Employee("EmpCreated2","Maintenance",22000.0),new Employee("EmpCreatet3","Archives",30000.0));
//		for (Employee employee : employees) {
//			var t =employeeService.save(employee);
//		}
//	}

	@Test
	public void test_employeeService_exists() {
		Assertions.assertNotNull(employeeService);
	}

	@ParameterizedTest
	@CsvSource(value = { "Emp1,IT,250", "Emp2,IT,50", "Emp3,HR,200", "Emp4,Comm,100",
			"Emp5,sdgfsd,25000" }, delimiter = ',')
	public void test_save(String name, String dp, Double salary) {
		Employee emp = new Employee(name, dp, salary);
		Employee savedEmp = employeeService.save(emp);
		Assertions.assertNotNull(savedEmp);
		Assertions.assertTrue(emp.getNom() == savedEmp.getNom());
		Assertions.assertTrue(emp.getDepartment() == savedEmp.getDepartment());
		Assertions.assertTrue(emp.getSalary() == savedEmp.getSalary());
	}
	
	@ParameterizedTest
	@CsvSource(value = { "1","2" }, delimiter = ',')
	public void test_get(Long id)
	{
		Employee employeetoGet = employeeService.getById(id);
		Assertions.assertNotNull(employeetoGet);
		Assertions.assertTrue(employeetoGet.getId()==id);
	}
	
	@Test
	public void test_get_all()
	{
		Iterable<Employee> employees = employeeService.getAll();
		Assertions.assertNotNull(employees);
		for(Employee employee : employees)
		{
			Assertions.assertTrue(!employee.getNom().isBlank());
			Assertions.assertTrue(!employee.getDepartment().isBlank());
			Assertions.assertTrue(employee.getId() != 	0L );
			Assertions.assertTrue(employee.getSalary() > 0  );
			
		}
		
		
	}

}
