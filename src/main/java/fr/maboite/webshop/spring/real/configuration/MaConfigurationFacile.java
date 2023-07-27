package fr.maboite.webshop.spring.real.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.model.Example;
@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class MaConfigurationFacile {

	@Bean
	public Example example() {
		return new Example();
	}
}
