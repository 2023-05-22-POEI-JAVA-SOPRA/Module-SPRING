package fr.maboite.webshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import fr.maboite.webshop.jdbcdao.HotelDao;
import fr.maboite.webshop.model.Hotel;

@Service
public class HotelService {
	
	@Autowired
	private HotelDao hotelDao;
	
	
	
	public Hotel save(Hotel hotel) {
		System.out.println("Appel de save HotelService");
		return this.hotelDao.save(hotel);
	}
	
	public Hotel getById(Long id) {
		System.out.println("Appel de get HotelService");
		return this.hotelDao.findById(id).get();
	}
	
	public Iterable<Hotel> getAll(){
		return this.hotelDao.findAll();
	}
	
	public void delete(Long id) {
		this.hotelDao.deleteById(id);
	}

}
