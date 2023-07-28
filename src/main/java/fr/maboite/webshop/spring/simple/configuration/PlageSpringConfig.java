package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({"fr.maboite.plage.service", "fr.maboite.plage.dao"})

public class PlageSpringConfig {
	
}
