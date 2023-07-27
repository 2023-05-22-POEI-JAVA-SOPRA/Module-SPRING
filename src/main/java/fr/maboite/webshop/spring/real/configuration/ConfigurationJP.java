package fr.maboite.webshop.spring.real.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import fr.maboite.webshop.service.MonDeuxiemeService;
import fr.maboite.webshop.service.MonPremierService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class ConfigurationJP {
	
//	@Bean
//	public MonPremierService preums() {
//		System.out.println("Preums");
//		return new MonPremierService();
//	}
//	
//	@Bean
//	public MonDeuxiemeService deuz() {
//		System.out.println("Deuz");
//		return new MonDeuxiemeService();
//	}

}
