package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;

import fr.maboite.webshop.service.PremierService;
import fr.maboite.webshop.service.SecondService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:Values.properties")
//@Scope("prototype")
public class PremiereConfiguration {

	@Value(value="${premierservice.title}")
	private String title1;
	
	@Value(value="${secondservice.title}")
	private String title2;
	
	@Bean
	public PremierService createPremierService() {
		System.out.println(title1);
		return new PremierService(1);
	}	
	
	@Bean
	public SecondService createSecondService() {
		System.out.println(title2);
		return new SecondService(2);
	}
	
}
