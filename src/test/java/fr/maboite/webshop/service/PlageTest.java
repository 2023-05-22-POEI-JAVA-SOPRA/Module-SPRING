package fr.maboite.webshop.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import fr.maboite.plage.service.PlageServices;
import fr.maboite.webshop.model.PlagePojo;
import fr.maboite.webshop.spring.simple.configuration.PlageSpringConfig;

@SpringJUnitConfig(PlageSpringConfig.class)
public class PlageTest {
	@Autowired
	private PlageServices plageServices;
	
	@Test
	public void test() {
		Assertions.assertNotNull(plageServices);
	}
	
	@Test
	public void test_method_save() {
		 // Créez une instance de PlagePojo que vous souhaitez sauvegarder
	    PlagePojo plage = new PlagePojo();

	    // Appelez la méthode save de PlageServices
	    PlagePojo savedPlage = plageServices.save(plage);

	    Assertions.assertNotNull(savedPlage);
	}

//	Merci ChatGPT car je ne vois toujours pas comment faire des tests... 
//	je comprends à quoi ils servent et quand je lis les codes des corrections je les comprends mais à l'exo suivant pas moyen de les faire
}
