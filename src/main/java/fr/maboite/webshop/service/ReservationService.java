package fr.maboite.webshop.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.jdbcdao.ReservationDao;
import fr.maboite.webshop.model.DemandeReservation;
import fr.maboite.webshop.model.Hotel;
import fr.maboite.webshop.model.Reservation;

@Service
public class ReservationService {

	@Autowired
	private ReservationDao reservationDao;
	
	public Reservation save(Reservation reservation) {
		System.out.println("Appel de save ReservationService");
		return this.reservationDao.save(reservation);
	}
	
	public Reservation get(Long id) {
		System.out.println("Appel de get ReservationService");
		return this.reservationDao.findById(id).get();
	}
	
	public Iterable<Reservation> getAll(){
		return this.reservationDao.findAll();
	}
	
	public void delete(Long id) {
		System.out.println("Appel de delete ReservationService");
		this.reservationDao.deleteById(id);
	}
	
	public List<Reservation> findByNom(String nom){
		return this.reservationDao.findByNom(nom);
	}
	
	public List<Reservation> findByNomIgnoreCase(String nom){
		return this.reservationDao.findByNomIgnoreCase(nom);
	}
	
	public List<Reservation> findByNomAndDebut(String nom, LocalDate debut){
		return this.reservationDao.findByNomAndDebut(nom,debut);
	}
	
	public List<Reservation> findDistinctReservationByNomOrDebut(String nom, LocalDate debut){
		return this.reservationDao.findDistinctReservationByNomOrDebut(nom,debut);
	}
	
	public List<Reservation> findByNomIgnoreCaseContaining(String PartNom){
		return this.reservationDao.findByNomIgnoreCaseContaining(PartNom);
	}
	
	public List<Reservation> queryFindByNom(String nom){
		return this.reservationDao.queryFindByNom(nom);
	}
	
	public List<Reservation> queryFindByNomOrDebut(String nom, LocalDate debut){
		return this.reservationDao.queryFindByNomOrDebut(nom,debut);
	}
	
	public List<Reservation> queryFindByNomAndDebut(String nom, LocalDate debut){
		return this.reservationDao.queryFindByNomAndDebut(nom,debut);
	}

	public List<Reservation> querySortByNomAsc(){
		return this.reservationDao.queryFindByNomAsc();
	}
	
	public List<Reservation> findByHotelVille(String ville){
		return this.reservationDao.findByHotelVille(ville);
	}

	public Reservation demandeDeReservation(DemandeReservation demandeReservation) {
		if(demandeReservation.getHotel()==null) {
			return null;
		}
		else if(demandeReservation.getHotel().startsWith("super")) {
			System.out.println("L'hôtel n'a plus de chambre disponible.");
			return null;
		}
		if(demandeReservation.getPlage()==null) {
			return null;
		}
		else if(demandeReservation.getPlage()!=null && !(demandeReservation.getPlage().endsWith("plage"))) {
			System.out.println("La réservation est impossible car cette plage n'existe pas.");
			return null;
		}
		return new Reservation((long) 2,demandeReservation.getNom(),demandeReservation.getDebut(),demandeReservation.getFin());
	}
	
}
