package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;



//Déclare un bean de configuration
//ce bean va créer d'autres instances
@Configuration

//Scanne les composants trouvés dans le
//package fourni en paramètre
@ComponentScan("fr.maboite.webshop.service")
@PropertySource("classpath:tp-application.properties")
public class SpringSimpleConfiguration {		

//	@Bean
//	public MyService createService() {
//		return new MyService();
//	}

//	@Bean 
//	public UserService createUserService()
//	{
//		return new UserService();
//	}
	

}