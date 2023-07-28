package fr.maboite.webshop.spring.simple.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import fr.maboite.webshop.service.ServiceHotel;
import fr.maboite.webshop.service.ServicePlage;
import fr.maboite.webshop.service.ServiceReservation;

@Configuration
@ComponentScan({"fr.maboite.webshop.service", "fr.maboite.webshop.jdbcdao"})
public class ConfigurationTP {

	
	@Bean
	public ServiceHotel createServiceHotel() {
		return new ServiceHotel();
	}
	

	@Bean
	public ServicePlage createServicePlage() {
		return new ServicePlage();
	}
	

	@Bean
	public ServiceReservation createServiceReservation() {
		return new ServiceReservation();
	}
}
