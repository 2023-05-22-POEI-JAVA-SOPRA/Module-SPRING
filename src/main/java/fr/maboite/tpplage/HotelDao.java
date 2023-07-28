package fr.maboite.tpplage;

 
import org.springframework.stereotype.Component;

@Component
public class HotelDao {

	public Hotel save() {
		System.out.println("in HotelDao : save");
		return new Hotel(100, "saveHotel", "marseille");
	}

	public Hotel get(Integer id) {
		System.out.println("in HotelDao : get");
		return new Hotel(id, "getHotel", "paris");
	}

}
