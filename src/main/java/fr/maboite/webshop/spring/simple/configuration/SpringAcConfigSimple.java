package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


@Configuration
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:exemple-application.properties")
public class SpringAcConfigSimple {
	
	@Value("${my.property.1}")
	private String variableConfiguree = "valeur par défaut";
	
	@Bean
	public void test() {
		System.out.println("coucou je viens de la configuration simple");
	} 
	
	public String getVariableConfiguree() {
		return variableConfiguree;
	}

	public void setVariableConfiguree(String variableConfiguree) {
		this.variableConfiguree = variableConfiguree;
	}
	
}
