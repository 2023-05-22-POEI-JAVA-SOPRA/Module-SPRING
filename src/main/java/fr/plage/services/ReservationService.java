package fr.plage.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.plage.dao.ReservationDao;
import fr.plage.entity.Reservation;

@Service
public class ReservationService {

	@Autowired
	private ReservationDao resDao;
	
	public Reservation create(Reservation reservation) {
		return this.resDao.save(reservation);
	}
	
	public String getById(Integer id) {
		return this.resDao.getById(id);
	}
	
	public String delById(Integer id) {
		return this.resDao.delById(id);
	}
}