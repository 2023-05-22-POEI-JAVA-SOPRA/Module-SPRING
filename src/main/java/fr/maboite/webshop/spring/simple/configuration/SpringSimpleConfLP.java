package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import fr.maboite.webshop.service.MonPremierServiceLP;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:test_proprietes.properties")
public class SpringSimpleConfLP {
	
		@Value(value="${toto.maVariable}")
		private String maVariable;
		
//		@Bean
		public MonPremierServiceLP monServiceTest() {
			return new MonPremierServiceLP();
		}
		
		@Bean
		public void afficherTest() {
			System.out.println("Je teste le @Configuration (Exo2)");
		}
		@Bean
		public String getMaVariable() {
			return maVariable;
		}

		public void setMaVariable(String maVariable) {
			this.maVariable = maVariable;
		}
		
		
		
		
}
