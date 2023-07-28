package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import fr.maboite.webshop.service.SuperDao;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:infos.properties")
public class MegaConfig {

	@Bean
	public SuperDao createSuperDao() {
		System.out.println("init superDao");
		return new SuperDao();
	}
}
