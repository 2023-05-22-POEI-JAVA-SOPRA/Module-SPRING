package fr.maboite.webshop.spring;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import fr.maboite.webshop.model.Category;
import fr.maboite.webshop.model.Example;
import fr.maboite.webshop.service.CategoryService;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class ExampleSpringJpaApplication {

	public static void main(String[] args) {

		try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
				SpringConfiguration.class)) {
			MonPremierService exampleServiceBean = appContext.getBean(MonPremierService.class);
			CategoryService categoryServiceBean = appContext.getBean(CategoryService.class);

			Example nouvelExample = new Example();
			Category category = new Category();
			category.setId(4l);
			//categoryServiceBean.save(category);
			
			nouvelExample.setNom("hahahavolume2");
			nouvelExample.setTaille(6f);
			nouvelExample.setCategoryId(category);
			//exampleServiceBean.save(nouvelExample);

//			Iterable<Example> allExamples = exampleServiceBean.getAll();
//			for (Example example : allExamples) {
//				System.out.println("En base, j'ai un example avec le nom : " + example.getNom());
//			}

			Example example1 = exampleServiceBean.getExampleById(3l);
			System.out.println("L'example 1 a le nom : " + example1.getNom());

			// exampleServiceBean.delete(3l);
			List<Example> example2 = exampleServiceBean.findBy2Attribut("ququnautre", 5f);

			for (Example example : example2) {
				System.out.println("L'example 2 a l'id : " + example.getId());
			}
			List<Example> example3 = exampleServiceBean.findByNomIgnoringCase("WALID");

			for (Example example : example3) {
				System.out.println("L'example 3 a l'id : " + example.getId());
			}
			List<Example> example4 = exampleServiceBean.findByNom("Walid");

			for (Example example : example4) {
				System.out.println("L'example 4 a l'id : " + example.getId());
			}
			
			List<Example> example5 = exampleServiceBean.findByPartNomIgnoringCase("ququ");

			for (Example example : example5) {
				System.out.println("L'example 5 a l'id : " + example.getId());
			}
			
			List<Example> example6 = exampleServiceBean.findByTwoAttributQuery("Walid",5f);

			for (Example example : example6) {
				System.out.println("L'example 6 a l'id : " + example.getId());
			}
			
			List<Example> example7 = exampleServiceBean.findByNomQuery("ququnautre");

			for (Example example : example7) {
				System.out.println("L'example 7 a l'id : " + example.getId());
			}
			
			List<Example> example8 = exampleServiceBean.findAllOrderAsc();

			for (Example example : example8) {
				System.out.println("L'example 8 a l'id : " + example.getNom());
			}
			
			List<Example> example9 = exampleServiceBean.findByCategoryId(3l);
			for (Example example : example9) {
				System.out.println("L'example 9 a l'id : " + example.getId()+" et le nom: "+ example.getNom());
			}
			
			List<Example> example10 = exampleServiceBean.findByCategoryNom("classique");
			for (Example example : example10) {
				System.out.println("L'example 10 a l'id : " + example.getId()+" et le nom: "+ example.getNom());
			}
			
			

			

		}
	}

}
