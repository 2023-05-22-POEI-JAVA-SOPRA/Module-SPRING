package fr.maboite.webshop.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.MonPremierDao;
import fr.maboite.webshop.service.MonPremierService;
import fr.maboite.webshop.service.MyFirstService;
import fr.maboite.webshop.service.MySecondService;

@Configuration
public class SpringSimpleConfiguration {

	@Bean
	public MyFirstService createService() {
		return new MyFirstService();

	}
	
	@Bean
	public MySecondService createService1() {
		return new MySecondService();

	}
	
	@Bean
	public MonPremierService createService2() {
		return new MonPremierService();

	}
	
	@Bean
	public MonPremierDao createService3() {
		return new MonPremierDao();

	}

}
