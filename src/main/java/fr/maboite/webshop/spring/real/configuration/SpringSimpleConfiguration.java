package fr.maboite.webshop.spring.real.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import fr.maboite.webshop.correction.service.MonService;

@Configuration
@ComponentScan("fr.maboite.webshop.correction.service")
@PropertySource("classpath:example-application.properties")
public class SpringSimpleConfiguration {
	
//	@Bean
//	public MonService monServiceBean() {
//		MonService instanceMonService = new MonService();
//		//instanceMonService.testMethod();
//		return instanceMonService;
//	}
//	
}
