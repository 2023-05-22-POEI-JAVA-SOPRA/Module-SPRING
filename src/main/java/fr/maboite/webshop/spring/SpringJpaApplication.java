package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Employee;
import fr.maboite.webshop.service.EmployeeService;

import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;



public class SpringJpaApplication {

	public static void main(String[] args) {
		//On démarre le contexte Spring
		//avec la configuration qui se trouve dans SpringConfiguration.class
		try (AnnotationConfigApplicationContext appContext 
				= new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			
//			ExamplesService examplesServiceBean = appContext.getBean(ExamplesService.class);
//			
//			examplesServiceBean.save(new Example());
//			Iterable<Example> allExamples = examplesServiceBean.getAll();
//				for(Example ex : allExamples)
//				{
//					System.out.println("I got a example with the name : "  + ex.getNom());
//				}
//				
						
			EmployeeService employeeServiceBean =appContext.getBean(EmployeeService.class);
			Employee emp1 = new Employee("Max", "IT", 25000.0);
			Employee emp2 = new Employee("Tic", "HR", 500.0);
			Employee emp3 = new Employee("Tac", "Marketing", 1000.0);
			employeeServiceBean.save(emp1);
			employeeServiceBean.save(emp2);
			employeeServiceBean.save(emp3);
			
			Iterable<Employee> allEmployees = employeeServiceBean.getAll();
			for(Employee emp : allEmployees)
			{
				System.out.println("I got an employee : " + emp);
			}
			
				
		}
	}

}
