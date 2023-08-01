package vac.webshop.configuration;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories("vac.webshop.dao")
@ComponentScan("vac.webshop.service")
public class WebShopConfig {
private static final String PERSISTENCE_UNIT_NAME = "persistence-unit";
	
	/**
	 * Crée une entityManagerFactory, utilisée pour 
	 * créer des entityManagers
	 * @return
	 */
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
}
