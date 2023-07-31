package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Employee;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.EmployeeService;
import fr.maboite.webshop.service.ExamplesService;
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
//			examplesServiceBean.save(new Example("TestSave",15.0f));
//			Iterable<Example> allExamples = examplesServiceBean.getAll();
//				for(Example ex : allExamples)
//				{
//					System.out.println("I got a example with the name : "  + ex.getNom());
//				}
//			
//				List<Example> examples =examplesServiceBean.getByNom("Test1");
//				for(Example ex : examples)
//				{
//					System.out.println("I got a example with the name  for get by nom  test:" +   ex.getNom());
//				}
//			
						
			EmployeeService employeeServiceBean =appContext.getBean(EmployeeService.class);
			Employee emp1 = new Employee("Tac", "IT", 25000.0);
			Employee emp2 = new Employee("Tic", "HR", 500.0);
			Employee emp3 = new Employee("Tac", "IT", 100.0);
			Employee emp4 = new Employee("Tuc", "Marketing", 1000.0);
			Employee emp5= new Employee("Jean", "CEO", 1000.0);
			Employee emp6 = new Employee("Marc", "Marketing", 1000.0);
			Employee emp7 = new Employee("Max", "Marketing", 1000.0);
		
			employeeServiceBean.save(emp1);
			employeeServiceBean.save(emp2);
			employeeServiceBean.save(emp3);
			employeeServiceBean.save(emp4);
			employeeServiceBean.save(emp5);
			employeeServiceBean.save(emp6);
			employeeServiceBean.save(emp7);
			
			
			Iterable<Employee> allEmployees = employeeServiceBean.getAll();
			for(Employee emp : allEmployees)
			{
				System.out.println("I got an employee : " + emp);
			}
			employeeServiceBean.delete(emp3.getId());
			
			allEmployees = employeeServiceBean.getAll();
			for(Employee emp : allEmployees)
			{
				System.out.println("I got an employee : " + emp);
			}
			
			
			employeeServiceBean.deleteAll();
			employeeServiceBean.save(emp1);
			employeeServiceBean.save(emp2);
			employeeServiceBean.save(emp3);
			employeeServiceBean.save(emp4);
			employeeServiceBean.save(emp5);
			employeeServiceBean.save(emp6);
			employeeServiceBean.save(emp7);
			
			employeeServiceBean.printAll();
			System.out.println(" ======================Get by nom ==========================");
			System.out.println(" === get by nom\'Tic\'  "+ employeeServiceBean.getByNom("Tic"));
			System.out.println(" ======================Get by nom  ignore case ==========================");
			System.out.println(" === get by nom ignore case \'tic\'  "+ employeeServiceBean.getByNomIgnoreCase("tic"));
			System.out.println(" ======================Get by nom  and department  ==========================");
			System.out.println(" === get by by nom and department'  "+ employeeServiceBean.getByNomAndDepartment("Tac","It"));
			System.out.println(" ======================Get by nom  or department  ==========================");
			System.out.println(" === get by by nom  or department '  "+ employeeServiceBean.getByNomOrDepartment("Tic","IT"));
			System.out.println(" ======================Get by nom like  ==========================");
		//	System.out.println(" === get by by nom  like Ma%  "+ employeeServiceBean.findByNomLike("Ma%"));
			
		}
	}

}
