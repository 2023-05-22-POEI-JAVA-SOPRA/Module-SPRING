package fr.maboite.webshop.spring.simple.configuration;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import fr.maboite.webshop.service.HotelService;
import fr.maboite.webshop.service.PlageService;
import fr.maboite.webshop.service.ReservationService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
public class TPConfiguration {
	
	@Bean
	public ReservationService createReservationService() {
		return new ReservationService();
	}
	
	@Bean
	public HotelService createHotelService() {
		return new HotelService();
	}
	
	
	@Bean
	public PlageService createPlageService() {
		return new PlageService();
	}

}
