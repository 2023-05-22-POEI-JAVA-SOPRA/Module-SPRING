package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import fr.maboite.webshop.jdbcdao.DaoThomas;
import fr.maboite.webshop.service.PremierServiceThomas;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:thomasProperty.properties")
//@PropertySource("classpath:francoisPropert.properties")
public class ConfigurationThomas {

	
	@Bean(name = "instanceDansConfig")
	public PremierServiceThomas createPremierService() {
		return new PremierServiceThomas();
	}
	
	
//	@Bean
//    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
//        return new PropertySourcesPlaceholderConfigurer();
//    }
	
	
	/*
	@Value(value = "${DaoThomas.valeur1}")
	DaoThomas daoThomas;
	*/
	
	
}
