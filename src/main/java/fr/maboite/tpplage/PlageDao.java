package fr.maboite.tpplage;

import org.springframework.stereotype.Component;

@Component
public class PlageDao {

	public Plage save() {
		System.out.println("in PlageDao : save");
		return new Plage(100, "savePlage");
	}

	public Plage get(Integer id) {
		System.out.println("in PlageDao : get");
		return new Plage(id, "getPlage");
	}
}
