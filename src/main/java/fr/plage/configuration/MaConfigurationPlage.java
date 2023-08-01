package fr.plage.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("fr.plage.services")
@ComponentScan("fr.plage.dao")
public class MaConfigurationPlage {

}
