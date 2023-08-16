package fr.maboite.webshop.spring.simple.configuration;

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

import fr.maboite.webshop.model.ExampleSpringDao;
import fr.maboite.webshop.service.MonPremierServiceLP;

@EnableJpaRepositories("fr.maboite.webshop.model")

@Configuration
@ComponentScan("fr.maboite.webshop.service")
@ComponentScan("fr.maboite.webshop.model")
@PropertySource("classpath:test_proprietes.properties")
public class SpringSimpleConfLP {
	
		@Value(value="${toto.maVariable}")
		private String maVariable;
		
//		@Bean
		public MonPremierServiceLP monServiceTest() {
			return new MonPremierServiceLP();
		}
		
		
		//Exercice 1 Spring data, mise en place lien avec BDD
		private static final String PERSISTENCE_UNIT_NAME = "persistence-unit";
		@Bean
		public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		}
		@Bean(name = "transactionManager")
		public PlatformTransactionManager dbTransactionManager(EntityManagerFactory emf) {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(
		emf);
		return transactionManager;
		}
		
		@Bean
		public void afficherTest() {
			System.out.println("Je teste le @Configuration (Exo2)");
		}
		@Bean
		public String getMaVariable() {
			return maVariable;
		}

		public void setMaVariable(String maVariable) {
			this.maVariable = maVariable;
		}
		
		
		
		
}
