package fr.maboite.webshop.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.correction.service.simple.ExampleService;
import fr.maboite.webshop.model.Example;
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
		
		//============================================================
		//=== 31/07/2023 exo1   QUERY METHODS + BONUS (Containing) ===
		//=============================================================
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
		
		//================================================================
		//=== 31/07/2023 exo1   FIN QUERY METHODS + BONUS (Containing) ===
		//================================================================
		
		
		//=============================================
		//=== 01/08/2023 exo1   QUERY METHODS Perso ===
		//=============================================
		
		System.out.println();
		System.out.println("=============================================");
		System.out.println("=== Utilisation getNomOrderByTailleIdDesc ===");
		System.out.println("=============================================");
		Iterable<Example> examplesQueryPerso=
				monService.getNomOrderByTailleIdDesc("Crocodile");
		for (Example example : examplesQueryPerso) {			
			System.out.println(example);
		}
		
		
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("=== Utilisation Query Perso 2 order by 1.0<taille<2.0 contenant P ===");
		System.out.println("=====================================================================");
		Iterable<Example> examplesQueryPerso2=
				monService.getAnimalByTailleContenantLettre("p",(Float)1f,(Float)2f);
		for (Example example : examplesQueryPerso2) {			
			System.out.println(example);
		}
		
		
		
		System.out.println();
		System.out.println("=====================================================================");
		System.out.println("=== Utilisation Query Perso 2 order by 1.0<taille<2.0 contenant P ===");
		System.out.println("=====================================================================");
		Iterable<Example> examplesQueryPerso3=
				monService.getAnimalsByNoms("poisson");
		for (Example example : examplesQueryPerso3) {			
			System.out.println(example);
		}
		
		
		//=================================================
		//=== 01/08/2023 exo2   Jointure table category ===
		//=================================================

		System.out.println();
		System.out.println("===============================================");
		System.out.println("=== Utilisation getExampleByCategory (Fruit)===");
		System.out.println("===============================================");
		Iterable<Example> examplesQueryPerso4=
				monService.getExampleByCategory("Fruit");
		for (Example example : examplesQueryPerso4) {			
			System.out.println(example);
		}
		
		System.out.println();
		System.out.println("===============================================");
		System.out.println("=== Utilisation getExampleByCategory (Animal)===");
		System.out.println("===============================================");
		Iterable<Example> examplesQueryPerso5=
				monService.getExampleByCategory("Animal");
		for (Example example : examplesQueryPerso5) {			
			System.out.println(example);
		}
		
		
		
	}

}
}

