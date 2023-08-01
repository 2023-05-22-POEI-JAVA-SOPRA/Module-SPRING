package fr.maboite.webshop.spring.simple.configuration;

import java.time.LocalDate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import fr.maboite.webshop.service.HotelService;
import fr.maboite.webshop.service.PlageService;
import fr.maboite.webshop.service.ReservationService;

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@EnableJpaRepositories("fr.maboite.webshop.jdbcdao")
public class TPConfiguration {

	private static final String PERSISTENCE_UNIT_NAME = "persistence-unit";
	
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}

	/**
	 * Crée un transactionManager, utilisé
	 * par Spring Data pour gérer les transactions
	 * via @Transactional
	 * @param emf
	 * @return
	 */
	@Bean(name = "transactionManager")
	public PlatformTransactionManager dbTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(
				emf);
		return transactionManager;
	}
//	
//	@Bean
//	public ReservationService createReservationService() {
//		return new ReservationService();
//	}
//	
//	@Bean
//	public HotelService createHotelService() {
//		return new HotelService();
//	}
//	
//	
//	@Bean
//	public PlageService createPlageService() {
//		return new PlageService();
//	}

}
