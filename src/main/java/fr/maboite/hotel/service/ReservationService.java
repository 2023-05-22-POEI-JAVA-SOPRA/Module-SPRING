package fr.maboite.hotel.service;

import org.springframework.stereotype.Service;

import fr.maboite.hotel.dao.ReservationDao;
import fr.maboite.hotel.entity.Reservation;

@Service
public class ReservationService {

	private ReservationDao rDao;

	public Reservation getReservation(Integer id) {
		System.out.println("Get Reservation In Service");
		return rDao.get(id);
	}

	public Reservation saveReservation(Reservation reservation) {
		System.out.println("Save Reservation In Service");
		return rDao.save(reservation);
	}

	public ReservationService(ReservationDao rDao) {
		System.out.println("Reservation Service");
		this.rDao = rDao;
	}
	
	

}
