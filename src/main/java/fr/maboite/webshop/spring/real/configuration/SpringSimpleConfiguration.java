package fr.maboite.webshop.spring.real.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.correction.service.MonService;

@Configuration
public class SpringSimpleConfiguration {
	
	@Bean
	public MonService monServiceBean() {
		MonService instanceMonService = new MonService();
		//instanceMonService.testMethod();
		return instanceMonService;
	}
	
}
