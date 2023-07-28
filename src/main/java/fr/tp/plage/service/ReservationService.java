package fr.tp.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.tp.plage.entity.Reservation;

@Component
public class ReservationService {
	
	@Autowired
	private ReservationDao reservationDao;
	
	public Reservation save(Reservation reservation) {
		return this.reservationDao.save(reservation);
	}
	
	public Reservation get(Integer id) {
		return this.reservationDao.get(id);
	}

}
