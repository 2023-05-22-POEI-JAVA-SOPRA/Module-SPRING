package fr.maboite.webshop.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import fr.maboite.webshop.model.Plage;

@Component
@PropertySource("classpath:TP.properties")
public class PlageDao {
	
	@Value(value="${Plage.id}")
	private Integer idPlage;
	
	@Value(value="${Plage.nom}")
	private String nomPlage;
	
	public Plage save(Plage plage) {
		System.out.println("Appel de save PlageDao");
		plage.setId(idPlage);
		plage.setNom(nomPlage);
		return plage;
	}

	public Plage get(Integer id) {
		System.out.println("Appel de get PlageDao");
		Plage plage = new Plage();
		plage.setId(id);
		plage.setNom(nomPlage);
		return plage;
	}

}
