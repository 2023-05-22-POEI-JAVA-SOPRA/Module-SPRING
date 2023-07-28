package fr.maboite.webshop.jdbcdao;

import org.springframework.stereotype.Component;

import fr.maboite.webshop.pojo.Plage;

@Component
public class PlageDao {


	/**
	 * Renvoie une plage avec l'ID correspondant.
	 * @return plage
	 */
	public Plage get(Integer id) {
		Plage plage = new Plage();
		plage.setId(id);
		plage.setNom("nomPlage");
		return plage;
	}
	

	/**
	 * "Enregistre" une plage et la renvoie.
	 * @return plage
	 */
	public Plage save(Plage plage) {
		Plage plageSaved = new Plage();
		plageSaved.setId(plage.getId());
		plageSaved.setNom(plage.getNom());
		return plageSaved;
	}
}
