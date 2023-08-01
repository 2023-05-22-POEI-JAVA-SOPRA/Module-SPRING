package fr.maboite.webshop.spring;

import java.util.List;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import fr.maboite.webshop.model.Role;
import fr.maboite.webshop.service.RoleService;
import fr.maboite.webshop.spring.real.configuration.SpringConfiguration;

public class SpringMainRole {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(
                SpringConfiguration.class)) {
            System.out.println("Contexte Spring démarré");
            
            RoleService roleService = appContext.getBean(RoleService.class);

            // Insérer des exemples
            Role role1 = new Role();
            role1.setNom("admin");
            roleService.saveRole(role1);

            Role role2 = new Role();
            role2.setNom("Supervisor");
            roleService.saveRole(role2);

            
            //Recherche insensible à la casse
            String rechercheNom = "adm";
            List<Role> rolesTrouves = roleService.getByNomIgnoreCase(rechercheNom);
            for (Role role : rolesTrouves) {
                System.out.println("Nom du rôle : " + role.getNom());
            }
        }
    }
}
