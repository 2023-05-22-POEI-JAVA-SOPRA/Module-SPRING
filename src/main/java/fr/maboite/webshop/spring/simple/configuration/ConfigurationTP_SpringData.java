package fr.maboite.webshop.spring.simple.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;


@Configuration
@EnableJpaRepositories("fr.maboite.webshop.jdbcdao")
@ComponentScan({"fr.maboite.webshop.service", "fr.maboite.webshop.jdbcdao", "fr.maboite.webshop.model"})
public class ConfigurationTP_SpringData {
	
	private static final String PERSISTENCE_UNIT_NAME = "persistence-unit";
	
	
	
	
	
	
	
	@Bean
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
	}
	
	@Bean(name = "transactionManager")
	public PlatformTransactionManager dbTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}

}
