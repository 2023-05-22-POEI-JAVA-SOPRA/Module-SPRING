package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.MonPremierServiceLP;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class SpringSimpleConfLP {

		@Bean
		public MonPremierServiceLP monServiceTest() {
			return new MonPremierServiceLP();
		}
		
		@Bean
		public void afficherTest() {
			System.out.println("Je teste le @Configuration (Exo2)");
		}
}
