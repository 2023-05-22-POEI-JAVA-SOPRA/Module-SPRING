package fr.maboite.tpplage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService {
	@Autowired
	ReservationDao reservationDao;
	
	public Reservation save() {
		System.out.println("in ReservationService : save");
		return reservationDao.save();
	}
	
	public Reservation get(Integer id) {
		System.out.println("in ReservationService : get");
		return reservationDao.get(id);
	}
}
