package fr.plage.dao;

import org.springframework.stereotype.Component;
import fr.plage.entity.Plage;

@Component
public class PlageDao {

	public Plage save(Plage plage) {
		Plage savedRes = new Plage(plage);
		System.out.println("Une réservation a été créée : " + savedRes.toString());
		return savedRes;
	}

	public void getById(Integer id) {
		System.out.println("Plage numéro : " + id + " a été trouvée.");
	}

	public void delById(Integer id) {
		System.out.println("Plage numéro : " + id + " a été supprimée.");
	}
}