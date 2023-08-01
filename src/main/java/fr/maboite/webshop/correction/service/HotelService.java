package fr.maboite.webshop.correction.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.maboite.hotel.entity.Hotel;
import fr.maboite.webshop.correction.dao.HotelDao;

@Service
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	public Hotel save(Hotel hotel) {
		return this.hotelDao.save(hotel);
	}
	
	public Iterable<Hotel> getAll() {
		return this.hotelDao.findAll();
	}
	
	public Hotel getById(Integer id) {
		return this.hotelDao.findById(id).get();
	}
	
	public String delete(Integer id) {
		this.hotelDao.deleteById(id);
		return "Hôtel " + id + " supprimé.";
	}
	
//	public List<Hotel> searchByName(String name) {
//        return hotelDao.findByNom(name);
//    }
//
//    public List<Hotel> searchByNameIgnoreCase(String name) {
//        return hotelDao.findByNomIgnoreCase(name);
//    }
//
//    public List<Hotel> searchByAttributes(String nom, String ville) {
//        return hotelDao.findByNomAndVille(nom, ville);
//    }
//
//    public List<Hotel> searchByAttributesOr(String nom, String ville) {
//        return hotelDao.findByNomOrVille(nom, ville);
//    }
//
//    public List<Hotel> searchByPartialNameIgnoreCase(String partOfName) {
//        return hotelDao.findByNomContainingIgnoreCase(partOfName);
//    }
    
	//Méthodes avec @Query//
    public List<Hotel> searchByNom(String nom) {
        return hotelDao.findByNom(nom);
    }

    public List<Hotel> searchByNomAndVilleOr(String nom, String ville) {
        return hotelDao.findByNomAndVilleOr(nom, ville);
    }

    public List<Hotel> getAllHotelsSortedByNomAsc() {
        return hotelDao.findAllSortedByNomAsc();
    }

    public List<Hotel> getAllHotelsSortedByNomDesc() {
        return hotelDao.findAllSortedByNomDesc();
    }

}
