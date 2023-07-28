package fr.maboite.tpplage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HotelService {
	@Autowired
	HotelDao hotelDao;
	
	public Hotel save() {
		System.out.println("in HotelService : save");
		return hotelDao.save();
	}
	
	public Hotel get(Integer id) {
		System.out.println("in HotelService : get");
		return hotelDao.get(id);
	}
}
