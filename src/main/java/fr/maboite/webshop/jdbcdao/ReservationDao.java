package fr.maboite.webshop.jdbcdao;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import fr.maboite.webshop.model.Reservation;

//@Component
//@PropertySource("classpath:TP.properties")

@Repository
public interface ReservationDao extends CrudRepository<Reservation, Long>{

	List<Reservation> findByNom(String nom);
	List<Reservation> findByNomIgnoreCase(String nom);
	List<Reservation> findByNomAndDebut(String nom, LocalDate debut);
	List<Reservation> findDistinctReservationByNomOrDebut(String nom, LocalDate debut);
	List<Reservation> findByNomIgnoreCaseContaining(String partNom);

	
	}
	
//	@Value(value="${Reservation.id}")
//	private Integer idReservation;
//	
//	@Value(value="${Reservation.nom}")
//	private String nomReservation;
//	
//	private LocalDate debut = LocalDate.now();
//	
//	private LocalDate fin = LocalDate.now().plusDays(15);
//
//	public Reservation save(Reservation reservation) {
//		System.out.println("Appel de save ReservationDao");
//		reservation.setId(idReservation);
//		reservation.setNom(nomReservation);
//		reservation.setDebut(debut);
//		reservation.setFin(fin);
//		return reservation;
//	}
//
//	public Reservation get(Integer id) {
//		System.out.println("Appel de get ReservationDao");
//		Reservation reservation = new Reservation();
//		reservation.setId(id);
//		reservation.setNom(nomReservation);
//		reservation.setDebut(debut);
//		reservation.setFin(fin);
//		return reservation;
//	}
	
	

//}
