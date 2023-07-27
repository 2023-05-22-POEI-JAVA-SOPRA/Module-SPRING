package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.MonPremierService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class SpringAcConfigSimple {
	
	@Bean
	public void test() {
		System.out.println("coucou je viens de la configuration simple");
	} 
	
//	@Bean
//	public MonPremierService monService () {
//		return new MonPremierService();
//	}
}
