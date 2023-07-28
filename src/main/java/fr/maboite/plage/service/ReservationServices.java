package fr.maboite.plage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.plage.dao.ReservationDao;
import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.ReservationPojo;


@Service
public class ReservationServices {
	@Autowired
	private ReservationDao reservationDao;
	
//	avec la nouvelle entité Demande de Resa il faut je pense lier plage et hotel à Reservation
	@Autowired
	private PlageServices plageServices;
	
	@Autowired
	private HotelServices hotelServices;
	

	
	public ReservationPojo save(ReservationPojo resa) {
		return this.reservationDao.save(resa);
	}
	
	public ReservationPojo get(Integer id) {
		return this.reservationDao.get(id);
	}

	
//	Methode demandée dernière partie TP. On renvoi une ResaPojo ???
	public ReservationPojo bookReservation(DemandeReservation demandeReservation) {
		return new ReservationPojo();
	}
}
