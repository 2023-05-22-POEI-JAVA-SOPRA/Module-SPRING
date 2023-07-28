package fr.maboite.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.plage.dao.ReservationDao;
import fr.maboite.webshop.model.ReservationPojo;


@Service
public class ReservationServices {
	@Autowired
	private ReservationDao reservationDao;
	
	public ReservationPojo save(ReservationPojo resa) {
		return this.reservationDao.save(resa);
	}
}
