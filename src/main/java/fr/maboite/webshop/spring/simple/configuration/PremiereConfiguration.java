package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.PremierService;
import fr.maboite.webshop.service.SecondService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class PremiereConfiguration {
	
	@Bean
	public PremierService createPremierService() {
		return new PremierService(1);
	}	
	
	@Bean
	public SecondService createSecondService() {
		return new SecondService(2);
	}
	
}
