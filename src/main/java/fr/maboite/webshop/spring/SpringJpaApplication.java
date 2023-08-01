package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Ecole;
import fr.maboite.webshop.model.Employee;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.EcoleService;
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
						
//			EmployeeService employeeServiceBean =appContext.getBean(EmployeeService.class);
//			Employee emp1 = new Employee("Tac", "IT", 25000.0);
//			Employee emp2 = new Employee("Tic", "HR", 500.0);
//			Employee emp3 = new Employee("Tac", "IT", 100.0);
//			Employee emp4 = new Employee("Tuc", "Marketing", 1000.0);
//			Employee emp5= new Employee("Jean", "CEO", 1000.0);
//			Employee emp6 = new Employee("Marc", "Marketing", 1000.0);
//			Employee emp7 = new Employee("Max", "Marketing", 1000.0);
//		
//			employeeServiceBean.save(emp1);
//			employeeServiceBean.save(emp2);
//			employeeServiceBean.save(emp3);
//			employeeServiceBean.save(emp4);
//			employeeServiceBean.save(emp5);
//			employeeServiceBean.save(emp6);
//			employeeServiceBean.save(emp7);
//			
//			
//			Iterable<Employee> allEmployees = employeeServiceBean.getAll();
//			for(Employee emp : allEmployees)
//			{
//				System.out.println("I got an employee : " + emp);
//			}
//			employeeServiceBean.delete(emp3.getId());
//			
//			allEmployees = employeeServiceBean.getAll();
//			for(Employee emp : allEmployees)
//			{
//				System.out.println("I got an employee : " + emp);
//			}
//			
//			
//			employeeServiceBean.deleteAll();
//			employeeServiceBean.save(emp1);
//			employeeServiceBean.save(emp2);
//			employeeServiceBean.save(emp3);
//			employeeServiceBean.save(emp4);
//			employeeServiceBean.save(emp5);
//			employeeServiceBean.save(emp6);
//			employeeServiceBean.save(emp7);
//			
//			employeeServiceBean.printAll();
//			System.out.println(" ======================Get by nom ==========================");
//			System.out.println(" === get by nom\'Tic\'  "+ employeeServiceBean.getByNom("Tic"));
//			System.out.println(" ======================Get by nom  ignore case ==========================");
//			System.out.println(" === get by nom ignore case \'tic\'  "+ employeeServiceBean.getByNomIgnoreCase("tic"));
//			System.out.println(" ======================Get by nom  and department  ==========================");
//			System.out.println(" === get by by nom and department'  "+ employeeServiceBean.getByNomAndDepartment("Tac","It"));
//			System.out.println(" ======================Get by nom  or department  ==========================");
//			System.out.println(" === get by by nom  or department '  "+ employeeServiceBean.getByNomOrDepartment("Tic","IT"));
//			System.out.println(" ======================Get by nom like  ==========================");
//		//	System.out.println(" === get by by nom  like Ma%  "+ employeeServiceBean.findByNomLike("Ma%"));
//			
//			System.out.println(" ======================Get by Salary Desc  ==========================");
//			System.out.println(employeeServiceBean.findAllOrderBySalaryAsc(1000.0));
//			
//			System.out.println(" =====================Get by nom  or department  ==========================");
//			System.out.println(employeeServiceBean.findByNomOrDepartmentOrderByIdDesc("Tac","IT"));
//			System.out.println(" =====================Get all order id desc  ==========================");
//			System.out.println(employeeServiceBean.getAllOrderByDesc());
			
			
			
			EmployeeService employeeServiceBean =appContext.getBean(EmployeeService.class);
			EcoleService ecoleServiceBean  =appContext.getBean(EcoleService.class);
			
			Ecole ecole1 = new Ecole("School1",100);
			Ecole ecole2 = new Ecole("School2",200);
			Ecole ecole3 = new Ecole("School3",300);
			Ecole ecole4 = new Ecole("School4",500);
			Ecole ecole5 = new Ecole("School5",1400);
			Ecole ecole = new Ecole("the School",12000);
			ecoleServiceBean.save(ecole1);
			ecoleServiceBean.save(ecole2);
			ecoleServiceBean.save(ecole3);
			ecoleServiceBean.save(ecole4);
			ecoleServiceBean.save(ecole4);
			ecoleServiceBean.save(ecole5);
		
			for(Ecole eco : ecoleServiceBean.getAll())
			{
				System.out.println(eco.toString());
			}
			Employee emp1 = new Employee("Tac", "IT", 25000.0,ecole1);
			Employee emp2 = new Employee("Tic", "HR", 500.0,ecole2);
			Employee emp4 = new Employee("Tuc", "Marketing", 1000.0,ecole3);
			Employee emp5= new Employee("Jean", "CEO", 1000.0,ecole1);
			Employee emp6 = new Employee("Marc", "Marketing", 1000.0,ecole4);
			Employee emp7 = new Employee("Max", "Marketing", 1000.0);
			Employee emp8 = new Employee("Frank", "It", 1050.0);
			employeeServiceBean.save(emp1);
			employeeServiceBean.save(emp2);
			employeeServiceBean.save(emp4);
			employeeServiceBean.save(emp5);
			employeeServiceBean.save(emp6);
			//employeeServiceBean.save(emp7);
			//employeeServiceBean.createEmp(emp7, ecole5);
			
			System.out.println(" =====================Get By Ecole   ==========================");
			employeeServiceBean.printAllEmp(employeeServiceBean.findByEcole(ecole1));
			System.out.println(" =====================Get By Ecole   ==========================");
			employeeServiceBean.printAllEmp(employeeServiceBean.findByEcoleAndDepartment(ecole4,"Marketing"));
			
		//	employeeServiceBean.createEmp(emp7, ecole);
		//	System.out.println(employeeServiceBean.findByEcole(ecole));
			System.out.println(" =====================Saved with emp and school not in db  ==========================");
			System.out.println(employeeServiceBean.save(emp7, ecole));
			System.out.println(" =====================Saved with emp a not in db  and school in db  ==========================");
			System.out.println(employeeServiceBean.save(emp8, ecole5));
			
			System.out.println(" =====================Saved with emp already in db  and school in db  ==========================");
			System.out.println(employeeServiceBean.save(emp1, ecole5));
		}
	}

}
