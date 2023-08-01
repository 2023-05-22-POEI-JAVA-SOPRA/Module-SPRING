package fr.maboite.webshop.correction.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import fr.maboite.hotel.entity.Hotel;

@Repository
public interface HotelDao extends CrudRepository<Hotel, Integer> {

//	List<Hotel> findByNom(String nom);
//	
//	List<Hotel> findByNomIgnoreCase(String nom);
//	
//	List<Hotel> findByNomAndVille(String nom, String ville);
//
//	List<Hotel> findByNomOrVille(String nom, String ville);
//	
//	List<Hotel> findByNomContainingIgnoreCase(String partOfNom);

	@Query("SELECT h FROM Hotel h WHERE h.nom = :nom")
	List<Hotel> findByNom(@Param("nom") String nom);

	@Query("SELECT h FROM Hotel h WHERE h.nom = :nom AND h.ville = :ville OR h.nom = :nom OR h.ville = :ville")
	List<Hotel> findByNomAndVilleOr(@Param("nom") String nom, @Param("ville") String ville);

	@Query("SELECT h FROM Hotel h ORDER BY h.nom ASC")
	List<Hotel> findAllSortedByNomAsc();

	@Query("SELECT h FROM Hotel h ORDER BY h.nom DESC")
	List<Hotel> findAllSortedByNomDesc();

}
