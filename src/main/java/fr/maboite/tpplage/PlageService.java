package fr.maboite.tpplage;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlageService {
	@Autowired
	PlageDao plageDao;
	
	public Plage save() {
		System.out.println("in PlageService : save");
		return plageDao.save();
	}
	
	public Plage get(Integer id) {
		System.out.println("in PlageService : get");
		return plageDao.get(id);
	}

	public boolean isOk(String plageName) {
		if (plageName == null) {
			return true;
		} else {
			Pattern pattern = Pattern.compile("plage$", Pattern.CASE_INSENSITIVE);
			Matcher matcher = pattern.matcher(plageName);
			return matcher.matches();
		}
	}
}
