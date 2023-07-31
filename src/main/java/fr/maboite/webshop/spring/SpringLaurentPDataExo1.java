package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.ExampleService;
import fr.maboite.webshop.spring.simple.configuration.SpringSimpleConfLP;

public class SpringLaurentPDataExo1{
	public static void main(String[] args) {
		
	
	try (AnnotationConfigApplicationContext appContext 
			= new AnnotationConfigApplicationContext(SpringSimpleConfLP.class)) {


		System.out.println("Contexte Spring démarré");

		ExampleService monService=appContext.getBean(ExampleService.class);

		//opérations getAll
		Example monExample=new Example();
		monService.save(monExample);
		Iterable<Example> examples=monService.getAll();
		for (Example example : examples) {
			if(example.getNom()==null) {
				monService.deleteById(example.getId());
			}
			else {
			System.out.println(example);
			}
		}
		
		Iterable<Example> examplesByName=monService.getByNom("Léopard");
		System.out.println("=========================================");
		System.out.println("===  Utilisation getByNom (Leopard) : ===");
		System.out.println("=========================================");
		for (Example example : examplesByName) {			
			System.out.println(example);
		}
		
		System.out.println();
		System.out.println("======================================================");
		System.out.println("=== Utilisation getByNomIgnoreCase (orang-outan) : ===");
		System.out.println("======================================================");
		Iterable<Example> examplesByNameIgnoreCase=monService.getByNomIgnoreCase("ORANG-OUTAN");
		for (Example example : examplesByNameIgnoreCase) {			
			System.out.println(example);
		}
		
		
		System.out.println();
		System.out.println("=====================================");
		System.out.println("=== Utilisation getByNomAndTaille ===\n"
				+ 		   "=== (Nom=Requin et taille= 4,5) : ===");
		System.out.println("=====================================");
		Iterable<Example> examplesByNameAndTaille=monService.
				getByNameAndTaille("Requin",(float) 4.5);
		for (Example example : examplesByNameAndTaille) {			
			System.out.println(example);
		}
		
		System.out.println();
		System.out.println("====================================");
		System.out.println("=== Utilisation getByNomOrTaille ==="
				+ "\n=== (Nom= Lion et taille= 0,8) : ===");
		System.out.println("====================================");
		Iterable<Example> examplesByNameOrTaille=monService.
				getByNameOrTaille("Lion", 0.7f);
		for (Example example : examplesByNameOrTaille) {			
			System.out.println(example);
		}
		
		System.out.println();
		System.out.println("=================================");
		System.out.println("=== Utilisation getByPartName ===");
		System.out.println("=================================");
		Iterable<Example> examplesByPartName=
				monService.getByPartName("L");
		for (Example example : examplesByPartName) {			
			System.out.println(example);
		}
		//essai de within mais ne fonctionne pas sous postgre
//		Iterable<Example> examplesFouchette=
//				monService.getByForchetta("Lion", 0.7f,0.9f);
//		for (Example example : examplesFouchette) {			
//			System.out.println(example);
//		}
		
		
		
		
	}

}
}

